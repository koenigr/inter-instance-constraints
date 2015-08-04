% Rules
illegal_execution(Stream) :-  timestamp of'Kunde kontaktieren' < (timestamp of'Auftrag annehmen'+P3D),(1-2) >= (3*5),write(Stream, '
'), write(Stream, 'RULEID1
').
user_cannot_execute(Stream,USER,GENERATED3) :-  task_event(GENERATED3,'start'),task_name(GENERATED3,'Antrag prüfen 2'),user_executed(USER,GENERATED2),task_name(GENERATED2,'Antrag empfangen'),task_event(GENERATED2,'start'),task_workflow(GENERATED2,GENERATED4),task_workflow(GENERATED3,GENERATED4),write(Stream, '
'), write(Stream, 'RULEID2
').
