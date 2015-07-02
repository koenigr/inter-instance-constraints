
:- dynamic(collaborator/2).

:- [status].



%
% Start the different checking routines
%
run_checker :-
	open('outputfiles/results.txt', write, Stream),
	write(Stream, 'Modelchecker startet...\n'), 
	get_all_tasks(Stream),
	close(Stream).


get_all_tasks(Stream) :- 
	task(A, B),
	write(Stream, A),
	write(Stream, ' '),
	write(Stream, B),
	write(Stream, '\n'),
	fail;
	true.	




%
% Methods
%

related(A, B) :- related_to(A, B).
related(A, B) :- related_to(B, A).

equal_workflow(Task1, Task2) :- 
	workflow(Task1, A, B),
	workflow(Task2, A, B),
	not(Task1 = Task2).

% TODO stimmt das wirklich???
executed(User, Task) :-
	assigned(User, Task),
	succeeded(Task).
		


related(A,B) :- relative_of(A,B).
related(A,B) :- relative_of(B,A).

related2nd(A,C) :- related(A,B), related(B,C).

% count TODO Count/3 sollte nur verschiedene Lösungen für x finden, count/2 findet ALLE Lösungen für P
count(X, P,N) :- findall(X, P, L),
	length(L,N),
	open('results.txt', append, Stream),
	write(Stream, N),
	tab(Stream, 2),
	write(Stream, L),
	nl(Stream),
	close(Stream).


sumlist([ ], 0).
sumlist([H | Rest], Total) :- sumlist(Rest, S), Total is (S + H) .

% sum
sum(X,P,N) :- findall(X, P, L),
	sumlist(L, N),
	open('results.txt', append, Stream),
	write(Stream, N),
	tab(Stream, 2),
	write(Stream, L),
	nl(Stream),
	close(Stream).

avglist( List, Avg ):- 
    sumlist( List, Sum),
    length( List, Length), 
    Avg is (Sum / Length).

% avg
avg(X,P,N) :- findall(X,P,List),
 	avglist(List, N),
	open('results.txt', append, Stream),
	write(Stream, N),
	tab(Stream, 2),
	write(Stream, List),
	nl(Stream),
	close(Stream).

% max

% min

% time interval
time_interval(TASK1, TASK2, N) :-
	timestamp(TASK1, N1),
	timestamp(TASK2, N2),
	N2 - N1 >= 0,
	N is (N2 - N1).

% TODO nochmal alles überarbeiten
evaluate :- 
	open('results.txt', write, Stream),
        write(Stream,'Starting...'),  
	nl(Stream),
	close(Stream),
	illegally_executed(A, B), 
	open('results.txt', append, Stream2),
	write(Stream2, 'User'), 
	write(Stream2, A), 
	write(Stream2, ' executed Task with ID = '), 
	write(Stream2, B), 
	write(Stream2, ' illegally '), 
	nl(Stream2),
	close(Stream2),
	fail ; true. 

% TODO es sind zu viele Ergebnisse
calculate_collaborators :- 
	critical_task_pair(TASKNAME1, TASKNAME2),
	executed_u(USER1, TASK1),
	task(TASK1, TASKNAME1),
	executed_u(USER2, TASK2),
	task(TASK2, TASKNAME2),
	task_workflow(TASK1, W),
	task_workflow(TASK2, W),
	assert(collaborator(USER1, USER2, TASK1, TASK2)),
	fail; true.

start :-
	calculate_collaborators, % TODO eine Sperre einrichten, sodass nur 1mal ausgeführt wird
	evaluate.
