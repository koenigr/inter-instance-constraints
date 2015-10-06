
%
:- dynamic collaborator/2.
:- dynamic dominates/2.
:- dynamic related/2.
:- dynamic critical_task_pair/2.

:- multifile related/2.
:- multifile dominates/2.
:- multifile task_name/2.
:- multifile attribute/3.
:- multifile role_executed/2.
:- multifile workflow_name/2.
:- multifile timestamp/2.
:- multifile task_workflow/2.
:- multifile user_executed/2.
:- multifile task_event/2.
:- multifile user_task/2.
:- multifile user_role/2.
:- multifile same_group/2.
:- multifile role_task/2.
:- multifile partner/2.
:- multifile lub/2.
:- multifile glb/2.
:- multifile critical_task_pair/2.
:- multifile collaborator/2.
:- multifile role_cannot_execute/3.
:- multifile user_cannot_execute/3.
:- multifile role_must_execute/3.
:- multifile user_must_execute/3.
:- multifile illegal_execution/1.
:- multifile collaborator/2.
:- multifile related/2.
:- multifile critical_task_pair/2.



%
% Start the different checking routines
%
run_checker :-
	open('outputfiles/results.txt', write, Stream),
	write(Stream, 'Modelchecker startet...\n'), 
	addcollaborators,
	adddominates, %%%%% TODO testen
	addrelated,
	addsamegroup,
	addpartner,
	illegal_execution_by_user(Stream),
	illegal_execution_by_role(Stream),
	missed_execution_by_user(Stream),
	missed_execution_by_role(Stream),
	illegal_execution_gen(Stream),
	write(Stream, 'Modelchecker finished...\n'),
	close(Stream).

%
% Different checking rotines
%

illegal_execution_by_user(Stream) :-
	write(Stream, '\nSearching for illegal executions by user...\n'),
	user_cannot_execute(Stream,A,B),
	user_executed(A,B),
	write(Stream, 'Illegal execution found: \n'),
	write(Stream, 'User '), write(Stream, A), write(Stream, ' executed Task '),write(Stream, B),
	task_name(B,C), write(Stream, ' with name '), write(Stream, C), write(Stream, '\n'),
	fail; true.

illegal_execution_by_role(Stream) :-
	write(Stream, '\nSearching for illegal executions by role...\n'),
	role_cannot_execute(Stream,A,B),
	role_executed(A,B),
	write(Stream, 'Illegal execution found: \n'),
	write(Stream, 'Role '), write(Stream, A), write(Stream, ' executed Task '),write(Stream, B),
	task_name(B,C), write(Stream, ' with name '), write(Stream, C), write(Stream, '\n'),
	fail; true.


missed_execution_by_user(Stream) :-
	write(Stream, '\nSearching for missed executions by user...\n'),
	user_must_execute(Stream,A,B),
	not(user_executed(A,B)),
	write(Stream, 'Missed execution found: \n'),
	write(Stream, 'User '), write(Stream, A), write(Stream, ' should execute Task '),write(Stream, B),
	task_name(B,C), write(Stream, ' with name '), write(Stream, C), write(Stream, '\n'),
	fail; true.

missed_execution_by_role(Stream) :-
	write(Stream, '\nSearching for missed executions by role...\n'),
	role_must_execute(Stream,A,B),
	not(role_executed(A,B)),
	write(Stream, 'Missed execution found: \n'),
	write(Stream, 'Role '), write(Stream, A), write(Stream, ' should execute Task '),write(Stream, B),
	task_name(B,C), write(Stream, ' with name '), write(Stream, C), write(Stream, '\n'),
	fail; true.

illegal_execution_gen(Stream) :-
	write(Stream, '\nSearching for illegal executions...\n'),
	illegal_execution(Stream),
	write(Stream, 'Illegal execution found: \n'), fail; true.

%
% internal Methods
%

% Role hierarchy is ... TODO explanation		
adddominates :- dominates(A,B), 
		dominates(B,C), 
		not(dominates(A,C)),
		asserta(dominates(A,C)),fail;true.


%% Related 

addrelated :- 	related(A,B), 
		related(B,C), 
		not(related(A,C)),
		asserta(related(A,C)),fail;true.

addrelated :-   related(A,B),
		not(related(B,A)),
		asserta(related(B,A)),fail;true.


%% SameGroup

addsamegroup :- same_group(A,B), 
		same_group(B,C), 
		not(same_group(A,C)),
		asserta(same_group(A,C)),fail;true.

addsamegroup :-  same_group(A,B),
		not(same_group(B,A)),
		asserta(same_group(B,A)),fail;true.
%% Partner

addpartner :- partner(A,B), 
		partner(B,C), 
		not(partner(A,C)),
		asserta(partner(A,C)),fail;true.

addpartner :-  partner(A,B),
		not(partner(B,A)),
		asserta(partner(B,A)),fail;true.

%% Collaborators

addcollaborators :- 
	critical_task_pair(TASKNAME1, TASKNAME2),
	user_executed(USER1, TASK1),
	task_name(TASK1, TASKNAME1),
	user_executed(USER2, TASK2),
	task_name(TASK2, TASKNAME2),
	task_workflow(TASK1, W),
	task_workflow(TASK2, W),
	assert(collaborator(USER1, USER2)),
	fail; true.

addcollaborators :- % TODO testen
	collaborator(USER1, USER2),
 	write('asd'),
	assert(collaborator(USER2, USER1)),fail;true.

%
% Conditional Methods
%

% count TODO Count/3 sollte nur verschiedene Lösungen für x finden, count/2 findet ALLE Lösungen für P
count(X, P,N) :- 
	write('Starting count/3 '),
	findall(X, P, L),
	sort(L, L2),
	compress(L2, ResList),
	length(ResList,N),
	write(N),
	tab(2),
	write(ResList),
	nl.

count(P,N):- 
        findall(1,P,L),
        length(L,N).

compress([],[]).
compress([X],[X]).
compress([X,X|Xs],Zs) :- compress([X|Xs],Zs).
compress([X,Y|Ys],[X|Zs]) :- X \= Y, compress([Y|Ys],Zs).


% sum
sum(X,P,N) :- findall(X, P, L),
	sumlist(L, N),
	open('results.txt', append, Stream),
	write(Stream, N),
	tab(Stream, 2),
	write(Stream, L),
	nl(Stream),
	close(Stream).

sumlist([ ], 0).
sumlist([H | Rest], Total) :- sumlist(Rest, S), Total is (S + H) .

% avg
avg(X,P,N) :- findall(X,P,List),
 	avglist(List, N),
	open('results.txt', append, Stream),
	write(Stream, N),
	tab(Stream, 2),
	write(Stream, List),
	nl(Stream),
	close(Stream).

avglist( List, Avg ):- 
    sumlist( List, Sum),
    length( List, Length), 
    Avg is (Sum / Length).

%%%%%%% max
max(X,P,N) :- findall(X, P, List),
	max_list(List, N),
	open('results.txt', append, Stream),
	write(Stream, N),
	tab(Stream, 2),
	write(Stream, List),
	nl(Stream),
	close(Stream).

%%%%%%%%% min
min(X,P,N) :- findall(X, P, List),
	min_list(List, N),
	open('results.txt', append, Stream),
	write(Stream, N),
	tab(Stream, 2),
	write(Stream, List),
	nl(Stream),
	close(Stream).

% time interval
time_interval(TASK1, TASK2, N) :-
	timestamp(TASK1, N1),
	timestamp(TASK2, N2),
	N2 - N1 >= 0,
	N is (N2 - N1).

