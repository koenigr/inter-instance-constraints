% Rules
illegal_execution(Stream) :-  count((user_executed(User,GENERATED6),task_name(GENERATED6,Task.ID),task_event(GENERATED6,'start')),N),N > 2,task_workflow(GENERATED6,GENERATED8),workflow_name(GENERATED8,GENERATED7),write(Stream, '
').
user_cannot_execute(Stream,User,GENERATED2) :-  task_event(GENERATED2,'start'),task_name(GENERATED2,Task),task_workflow(GENERATED2,ID2),count((user_executed(User,GENERATED1),task_name(GENERATED1,Task.ID1),task_event(GENERATED1,'start')),N),N > 3,task_workflow(GENERATED1,GENERATED4),workflow_name(GENERATED4,GENERATED3),task_workflow(GENERATED2,GENERATED5),workflow_name(GENERATED5,GENERATED3),write(Stream, '
'), write(Stream, 'RULEID1
').
