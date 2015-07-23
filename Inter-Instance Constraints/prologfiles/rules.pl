% Rules
user_cannot_execute(Stream,USER,GENERATED3) :-  task_event(GENERATED3,'completed'),task_name(GENERATED3,'Antrag prüfen 1'),user_executed(USER,GENERATED2),task_name(GENERATED2,'Antrag annehmen'),write(Stream, '
'), write(Stream, '"4 Augen Prinzip bei T1 und T2"
').
user_cannot_execute(Stream,USER,GENERATED5) :-  task_event(GENERATED5,'completed'),task_name(GENERATED5,'Antrag prüfen 2'),user_executed(USER,GENERATED4),task_name(GENERATED4,'T1'),write(Stream, '
'), write(Stream, '"4 Augen Prinzip bei T1 und T3"
').
role_must_execute(Stream,'Manager',GENERATED1) :-  task_event(GENERATED1,'complete'),task_name(GENERATED1,'Antrag prüfen 2'),write(Stream, '
'), write(Stream, '"Role Manager must execute Task Antrag prüfen"
').
