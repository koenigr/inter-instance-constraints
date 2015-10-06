% Rules
illegal_execution(Stream) :-  task_name(GENERATED5,'Kunde kontaktieren'),task_event(GENERATED5,'complete'),task_name(GENERATED6,'Antrag empfangen'),task_event(GENERATED6,'complete'),timestamp(GENERATED5,N2),timestamp(GENERATED6,N1),(N2-N1) > 259200000,task_workflow(GENERATED6,GENERATED7),task_workflow(GENERATED5,GENERATED7),write(Stream, '
'), write(Stream, '"C2"
').
illegal_execution(Stream) :-  count((collaborator(U1,U2)),N),N > 3,write(Stream, '
'), write(Stream, '"C7 - besser"
').
user_cannot_execute(Stream,U1,GENERATED9) :-  task_name(GENERATED9,'Antrag prüfen 1'),task_name(GENERATED8,'Antrag empfangen'),user_executed(U1,GENERATED8),task_event(GENERATED8,'complete'),task_workflow(GENERATED9,GENERATED10),task_workflow(GENERATED8,GENERATED10),write(Stream, '
'), write(Stream, '"C3a"
').
user_cannot_execute(Stream,U1,GENERATED12) :-  task_name(GENERATED12,'Antrag prüfen 2'),task_name(GENERATED11,'Antrag empfangen'),user_executed(U1,GENERATED11),task_event(GENERATED11,'complete'),task_workflow(GENERATED12,GENERATED13),task_workflow(GENERATED11,GENERATED13),write(Stream, '
'), write(Stream, '"C3b"
').
user_cannot_execute(Stream,U1,GENERATED15) :-  task_name(GENERATED15,'Antrag prüfen 2'),task_name(GENERATED14,'Antrag prüfen 1'),user_executed(U1,GENERATED14),task_event(GENERATED14,'complete'),task_workflow(GENERATED14,GENERATED16),task_workflow(GENERATED15,GENERATED16),write(Stream, '
'), write(Stream, '"C4a"
').
user_cannot_execute(Stream,U1,GENERATED20) :-  related(U1,U2),task_name(GENERATED20,'Antrag prüfen 1'),attribute(GENERATED20,'Kunde',U2),task_workflow(GENERATED20,GENERATED21),write(Stream, '
'), write(Stream, '"C5a"
').
user_cannot_execute(Stream,U1,GENERATED22) :-  related(U1,U2),task_name(GENERATED22,'Antrag prüfen 2'),attribute(GENERATED22,'Kunde',U2),task_workflow(GENERATED22,GENERATED23),write(Stream, '
'), write(Stream, '"C5b"
').
user_cannot_execute(Stream,USER1,GENERATED24) :-  sum(X,(task_name(GENERATED24,'Antrag prüfen 1'),user_executed(USER1,GENERATED24),task_workflow(GENERATED24,WID),task_workflow(GENERATED24,WID),attribute(GENERATED24,'Kreditwunsch',X),task_workflow(GENERATED24,WID),attribute(GENERATED24,'Kunde',C)),N),N > 100000,task_workflow(GENERATED24,WID2),attribute(GENERATED24,'Kunde',C),task_workflow(GENERATED24,WID2),task_workflow(GENERATED24,GENERATED26),workflow_name(GENERATED26,GENERATED25),write(Stream, '
'), write(Stream, '"C6"
').
user_cannot_execute(Stream,U2,GENERATED28) :-  task_name(GENERATED28,'Antrag prüfen 1'),count((collaborator(U1,U2),task_name(GENERATED27,'Antrag annehmen'),user_executed(U1,GENERATED27),task_workflow(GENERATED27,WID)),N),N > 3,task_workflow(GENERATED28,WID),task_workflow(GENERATED28,GENERATED30),workflow_name(GENERATED30,GENERATED29),task_workflow(GENERATED27,GENERATED31),workflow_name(GENERATED31,GENERATED29),write(Stream, '
'), write(Stream, '"C7"
').
user_cannot_execute(Stream,U1,GENERATED32) :-  count((task_name(GENERATED32,T1),user_executed(U1,GENERATED32),task_workflow(GENERATED32,WN),workflow_name(WN,WID),task_workflow(GENERATED32,WN),workflow_name(WN,WID),task_event(GENERATED32,'ate_abort')),N),N > 5,task_workflow(GENERATED32,WN2),workflow_name(WN2,WID2),write(Stream, '
'), write(Stream, '"C8"
').
user_cannot_execute(Stream,User,GENERATED34) :-  count(Task,(task_name(GENERATED33,Task1),user_executed(User,GENERATED33),task_workflow(GENERATED33,WN),workflow_name(WN,WID),task_workflow(GENERATED33,WN),workflow_name(WN,WID),task_name(GENERATED34,Task2),task_workflow(GENERATED34,WN1),workflow_name(WN1,WID1),timestamp(GENERATED33,GENERATED35),timestamp(GENERATED34,GENERATED36),(GENERATED36 - GENERATED35) = X,X < 86400000),N),N > 5,task_workflow(GENERATED34,WN1),workflow_name(WN1,WID1),write(Stream, '
'), write(Stream, '"C9"
').
role_must_execute(Stream,'Kundenberater',GENERATED1) :-  task_name(GENERATED1,'Antrag empfangen'),task_workflow(GENERATED1,GENERATED2),write(Stream, '
'), write(Stream, '"C1a"
').
role_must_execute(Stream,'Kundenberater',GENERATED3) :-  task_name(GENERATED3,'Kunde kontaktieren'),task_workflow(GENERATED3,GENERATED4),write(Stream, '
'), write(Stream, '"C1b"
').
role_must_execute(Stream,'Bank Manager',GENERATED18) :-  task_name(GENERATED18,'Antrag prüfen 2'),task_name(GENERATED17,'Antrag empfangen'),attribute(GENERATED17,'Kreditwunsch',N),N > 100000,task_workflow(GENERATED18,GENERATED19),task_workflow(GENERATED17,GENERATED19),write(Stream, '
'), write(Stream, '"C4b"
').
