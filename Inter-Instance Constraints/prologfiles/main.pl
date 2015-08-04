
%
%%%%%%%% TODO alles hinzufügen, was nötig sein könnte
%
:- dynamic collaborator/2.
:- dynamic user_cannot_execute/3.
:- dynamic role_cannot_execute/3.
:- dynamic user_must_execute/3.
:- dynamic role_must_execute/3.
:- dynamic illegal_execution/1.
:- dynamic role_executed/2.
:- dynamic dominates/2.
:- dynamic related/2.

:- multifile related/2.
:- multifile dominates/2.




%
% Start the different checking routines
%
run_checker :-
	open('outputfiles/results.txt', write, Stream),
	write(Stream, 'Modelchecker startet...\n'), 
	addcollaborators,
	adddominates, %%%%% TODO testen
	addrelated,
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
	write(Stream, 'Searching for illegal executions by user...\n'),
	user_cannot_execute(Stream,A,B),
	write('VVV1'),
	user_executed(A,B),
	write(Stream, 'Illegal execution found: \n'),
	write(Stream, 'User '), write(Stream, A), write(Stream, ' executed Task '),write(Stream, B),write(Stream, '\n'),
	fail; true.

illegal_execution_by_role(Stream) :-
	write(Stream, 'Searching for illegal executions by role...\n'),
	role_cannot_execute(Stream,A,B),
	write('VVV2'),
	role_executed(A,B),
	write(Stream, 'Illegal execution found: \n'),
	write(Stream, 'Role '), write(Stream, A), write(Stream, ' executed Task '),write(Stream, B),write(Stream, '\n'),
	fail; true.


missed_execution_by_user(Stream) :-
	write(Stream, 'Searching for missed executions by user...\n'),
	user_must_execute(Stream,A,B),
	write('VVV3'),
	not(user_executed(A,B)),
	write(Stream, 'Missed execution found: \n'),
	write(Stream, 'User '), write(Stream, A), write(Stream, ' should execute Task '),write(Stream, B),write(Stream, '\n'),
	fail; true.

missed_execution_by_role(Stream) :-
	write(Stream, 'Searching for missed executions by role...\n'),
	role_must_execute(Stream,A,B),
	write('VVV4'),
	not(role_executed(A,B)),
	write(Stream, 'Missed execution found: \n'),
	write(Stream, 'Role '), write(Stream, A), write(Stream, ' should execute Task '),write(Stream, B),
	task_name(B,C), write(Stream, ' with name '), write(Stream, C), write(Stream, '\n'),
	%%%%% TODO instead executed by role ...
	fail; true.

illegal_execution_gen(Stream) :-
	write(Stream, 'Searching for illegal executions...\n'),
	illegal_execution(Stream),
	write('VVV5'),
	write(Stream, 'Illegal execution found: \n'), fail; true.

%
% internal Methods
%

% Role hierarchy is ... TODO explanation		
adddominates :- dominates(A,B), 
		dominates(B,C), 
		not(dominates(A,C)),
		asserta(dominates(A,C)).


%% Related 

addrelated :- 	related(A,B), 
		related(B,C), 
		not(related(A,C)),
		asserta(related(A,C)).

addrelated :-   related(A,B),
		not(related(B,A)),
		asserta(related(B,A)).



%%%%%%%%% TODO es sind zu viele Ergebnisse... stimmt das noch?? testen!! Hier ist es erwünscht, dass es mehrmals da steht, da man %auch die Anzahl wissen möchte
addcollaborators :- 
	critical_task_pair(TASKNAME1, TASKNAME2),
	executed_u(USER1, TASK1),
	task(TASK1, TASKNAME1),
	executed_u(USER2, TASK2),
	task(TASK2, TASKNAME2),
	task_workflow(TASK1, W),
	task_workflow(TASK2, W),
	assert(collaborator(USER1, USER2)),
	fail; true.

addcollaborators :- % TODO testen
	collaborator(USER1, USER2),
	assert(collaborator(USER2, USER1)).

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

