/*
* TODO: noch die Speziellen Eigenheiten für IP, InterInstance, IntraInstance einfügen
*/



/*
Inter-Process Constraints
*/
% 1. Task 'send_mail' darf nur 2 mal pro Tag ausgeführt werden
illegally_executed(USER1, TASK1) :- 	
	open('results.txt', append, Stream),
	nl(Stream), 
	write(Stream, 'IP - constraint 1: Task "send_mail" darf nur 2 mal pro Tag ausgeführt werden'), 
	nl(Stream),
	close(Stream),
	executed_u(USER1, TASK1),
	task(TASK1, 'send_mail'),
	count(N, restriction3(USER1, TASK1, N), X),
	X >= 2.

restriction3(USER1, TASK1, TASK2) :- 
	executed_u(USER2, TASK2),
	task(TASK2, 'send_mail'),
	time_interval(TASK2, TASK1, T),
	T < 1,
	TASK2 \= TASK1.

% 2. Ein User darf nicht mehr als 100 Tasks pro Tag erledigen
illegally_executed(USER, TASK) :-
	open('results.txt', append, Stream),
	nl(Stream), 
	write(Stream, 'IP constraint 2: Ein User darf nicht mehr als 100 Tasks pro Tag erledigen'), 
	nl(Stream),
	close(Stream),
	executed_u(USER, TASK),
	count(TN, restriction1(USER, TASK, TN), N),
	N >= 1.

restriction1(USER, TASK, TN) :- 
	executed_u(USER,TN),
	executed_u(USER, TASK),
	TASK \= TN,
	time_interval(TN, TASK, X),
	X < 5.


/*
Inter-Instance Constraints
*/

% 1. User U darf bei T1 nicht mehr als 5000 Euro im Monat auszahlen
illegally_executed(USER, TASK1) :-
	open('results.txt', append, Stream),
	nl(Stream), 
	write(Stream, 'constraint 1: Ein User darf bei "pay" nicht mehr als 5000 Euro im Monat auszahlen'), 
	nl(Stream),
	close(Stream),
	executed_u(USER, TASK1),
	task(TASK1, 'pay'),
	sum(N, restriction2(USER, TASK1, N), X), X > 3000.

restriction2(USER, TASK1, N) :- 
	time_interval(TASK2, TASK1, T),
	executed_u(USER, TASK2),
	T < 30,
	TASK2 \= TASK1,
	task_var(TASK2, 'loan_amount', N).
	

% 2. U1 und U2 dürfen nicht mehr als 3x an T1 und T2 zusammen arbeiten

illegally_executed(USER1, TASK1) :- 
	open('results.txt', append, Stream),
	nl(Stream), 
	write(Stream, 'constraint 2: U1 und U2 dürfen nicht mehr als 3x zusammen an T1 und T2 arbeiten'), 
	nl(Stream),
	close(Stream),
	executed_u(USER1, TASK1),
	executed_u(USER2, TASK2),
	count(USER1, collaborator(USER1, USER2), N), % TODO: hier eine FUnktion erstellen, die berechnet, wie oft sie zusammen daran gearbeitet haben
	N >= 3.

% 3. User U darf 'check' nicht mehr als 5mal im Monat ausführen

illegally_executed(USER, TASK1) :- 
	open('results.txt', append, Stream),
	nl(Stream), 
	write(Stream, 'constraint 3: Ein User darf "check" nicht mehr als 5 mal im Monat ausführen'), 
	nl(Stream),
	close(Stream),
	executed_u(USER, TASK1),
	task(TASK1, 'check'),
	count(TASK2, restrictions4(USER, TASK1, TASK2),N),
	N >= 2. % 5 mal
	
restrictions4(USER, TASK1, TASK2) :-
	executed_u(USER, TASK2),
	time_interval(TASK2, TASK1, T),
	TASK2 \= TASK1,
	T < 10. % Monat




/*
Intra-Instance Constraints
*/


illegally_executed(USER1, TID1) :- 
	open('results.txt', append, Stream),
	nl(Stream), 
	write(Stream, 'Intra constraint 1: Wenn zwei User verwandt sind, dürfen sie nicht pay und check ausführen'), 
	nl(Stream),
	close(Stream),
	related(USER1, USER2),
	executed_u(USER1, TID1),
	task(TID1, 'pay'),
	executed_u(USER2, TID2 ),
	task(TID2, 'check'),
	task_workflow(TID1, W),
	task_workflow(TID2, W).

illegally_executed(USER1, TASK2) :-
	open('results.txt', append, Stream),
	nl(Stream), 
	write(Stream, 'Intra - constraint 2: Wenn ein User send_email ausgeführt hat, darf er nicht mehr call_customer ausführen'), 
	nl(Stream),
	close(Stream),
	executed_u(USER1, TASK2),
 	task(TASK2, 'call_customer'),
	executed_u(USER1, TASK1),
	task(TASK1, 'send_email'),
	task_workflow(TASK1, W),
	task_workflow(TASK2, W).
	

