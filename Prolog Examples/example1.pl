:- dynamic assigned/2.
:- dynamic cannot_do_u/2.
:- dynamic cannot_do_r/2.
:- dynamic must_execute/2.

% Facts
related_to('Lukas', 'Tom').
related_to('Tom', 'Lukas'). % Da gab es doch "diesen" Trick...

related(A, B) :- related_to(A, B).
related(A, B) :- related_to(B, A).

group('Marie', 'Manager').
group('Tom', 'Clerk').
group('Lukas', 'Admin').

% States
executed('Marie', '0000').
executed('Tom', '0001').
executed('Lukas', '0002').
executed('Marie', '0003').

executed('Tom', '0004').
executed('Lukas', '0005').
executed('Marie', '0006').
executed('Tom', '0007').

timestamp('0000', 12.00).
timestamp('0001', 12.30).
timestamp('0002', 13.00).
timestamp('0003', 13.30).

timestamp('0004', 13.00).
timestamp('0005', 13.15).
timestamp('0006', 13.30).
timestamp('0007', 13.45).

task_name('0000', 'task1').
task_name('0001', 'task2').
task_name('0002', 'task3').
task_name('0003', 'task4').

task_name('0004', 'task1').
task_name('0005', 'task2').
task_name('0006', 'task3').
task_name('0007', 'task4').

workflow('0000', 'W1', '1').
workflow('0001', 'W1', '1').
workflow('0002', 'W1', '1').
workflow('0003', 'W1', '1').

workflow('0004', 'W1', '2').
workflow('0005', 'W1', '2').
workflow('0006', 'W1', '2').
workflow('0007', 'W1', '2').

equal_workflow(Task1, Task2) :- 
	workflow(Task1, A, B),
	workflow(Task2, A, B),
	not(Task1 = Task2).

% Rules
%C1
cannot_do_u(User, Task2) :-
	executed(User, Task1),
	task_name(Task1, task1),
	task_name(Task2, task2),
	equal_workflow(Task1, Task2).


cannot_do_u(User, Task3) :-
	executed(User, Task1),
	task_name(Task1, task1),
	task_name(Task3, task3),
	equal_workflow(Task1, Task3).

cannot_do_u(User, Task4) :-
	executed(User, Task1),
	task_name(Task1, task1),
	task_name(Task4, task4),
	equal_workflow(Task1, Task4).
%C2
cannot_do_u(User, task3) :-
	executed(User, task4),
	task_name(Task3, task3),
	task_name(Task4, task4),
	equal_workflow(Task3, Task4).

cannot_do_u(User, Task4) :-
	executed(User, Task3),
	task_name(Task3, task3),
	task_name(Task4, task4),
	equal_workflow(Task3, Task4).
%C3
cannot_do_u(User1, Task3) :-
	executed(User2, Task2),
	task_name(Task3, task3),
	task_name(Task2, task2),
	equal_workflow(Task3, Task2),
	related(User1, User2),
write(User1), write(User2),nl.

%C4

%C5

%C6
abort :- 
	timestamp(Task1, T1),
	timestamp(Task2, T2), 
	0<(T1 - T2),
	(T1 - T2)< 1.0,
	task_name(Task1, task2),
	task_name(Task2, task2),
	not(T1 = T2),
	write(Task1), write(' and '), write(Task2).

%C7

%C8


% Derivation
executed(User, Task) :-
	assigned(User, Task),
	succeeded(Task).

collaborator(User1, User2) :- critical_task_pair(Task1, Task2), executed(User1, Task1), executed(User2, Task2).



% "Final rules, True if constraint isn't satisfied"
unconsistent_constraints :- 
	cannot_do_u(User, Task), 
	must_execute(User, Task),
	write('User '), write(User), write(' and Task '), write(Task), write(' are inconsistent.'), nl.

violated_constraints :- 
	cannot_do_u(User, Task), 
	executed(User, Task), 
	write('User '), write(User), write(' and Task '), write(Task), write(' have violated constraints.'), nl. 
%TODO: hier werden nicht alle aufgelistet

violated_constraints :- 
	cannot_do_r(Role, Task), 
	executed(User, Task), 
	role(User, Role),
	write('Role '), write(Role), write(' and Task '), write(Task), write(' have violated constraints.'), nl.

result :- unconsistent_constraints, fail; violated_constraints, fail; abort.

are_constraints_satisfied :- not(result).
