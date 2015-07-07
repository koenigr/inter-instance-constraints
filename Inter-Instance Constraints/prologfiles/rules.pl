% Rules
illegal_execution(Stream) :-  user_executed(User,GENERATED13),task_name(GENERATED13,Task1),user_executed(USER,GENERATED14),task_name(GENERATED14,Task2),write(Stream, '
'), write(Stream, '12354
').
illegal_execution(Stream) :-  user_executed(User,GENERATED15),task_name(GENERATED15,Task1),write(Stream, '
').
user_cannot_execute(Stream,C,GENERATED2) :-  task_name(GENERATED2,'pay'),user_executed(A,GENERATED1),task_name(GENERATED1,'check'),related(A,C),write(Stream, '
'), write(Stream, '"check and pay cannot be executed by related actors"
').
user_cannot_execute(Stream,C,GENERATED11) :-  task_name(GENERATED11,'pay'),task_name(GENERATED3,'check'),user_executed(GENERATED3,A),task_name(GENERATED3,'assigned'),task_name(GENERATED4,B),task_name(GENERATED4,'aborted'),task_name(GENERATED5,C),task_name(GENERATED5,'completed'),user_task(A,GENERATED6),user_task(B,GENERATED7),critical_task_pair(GENERATED6,GENERATED7),task_name(GENERATED6,'completed'),task_name(GENERATED7,'completed'),count(Z,(task_name(GENERATED8,B),task_name(GENERATED8,'aborted'),task_name(GENERATED9,C),task_name(GENERATED9,'aborted')),N),sum(Y,(task_name(GENERATED10,B),task_name(GENERATED10,'completed')),N),write(Stream, '
'), write(Stream, '"Rule which contains number predicate"
').
user_must_execute(null,null) :-  user_executed('klein Susi',GENERATED12),task_name(GENERATED12,'Task2'),write(Stream, '
'), write(Stream, '"Klein Susi muss entweder Task2 oder Task3 ausführen"
').
