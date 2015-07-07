% executed_u status facts
user_executed('Mark',0).
user_executed('Susi',1).
user_executed('Susi',2).
user_executed('Bob',3).
user_executed('Mark',4).
user_executed('Stefania',5).
user_executed('Mark',6).
user_executed('Susi',7).
user_executed('Lorenzo',8).
user_executed('Lorenzo',9).
% executed_g status facts
% task names 
task_name(0,'check').
task_name(1,'pay').
task_name(2,'pay').
task_name(3,'send_mail').
task_name(4,'check').
task_name(5,'send_mail').
task_name(6,'check').
task_name(7,'pay').
task_name(8,'send_mail').
task_name(9,'call_customer').
% event types 
task_name(0,'start').
task_name(1,'complete').
task_name(2,'complete').
task_name(3,'start').
task_name(4,'start').
task_name(5,'complete').
task_name(6,'start').
task_name(7,'complete').
task_name(8,'complete').
task_name(9,'complete').
% timestamps
timestamp(0,61391399059927).
timestamp(1,2145405300).
timestamp(2,2145405300).
timestamp(3,61391399059927).
timestamp(4,61391399059927).
timestamp(5,2145405300).
timestamp(6,61391399059927).
timestamp(7,2145405300).
timestamp(8,2145405300).
timestamp(9,2145405300).
% task workflow facts
task_workflow(0,0).
task_workflow(1,0).
task_workflow(2,0).
task_workflow(3,1).
task_workflow(4,1).
task_workflow(5,1).
task_workflow(6,2).
task_workflow(7,2).
task_workflow(8,2).
task_workflow(9,2).
% workflow names facts
workflow_name(0,0).
workflow_name(0,0).
workflow_name(0,0).
workflow_name(1,0).
workflow_name(1,0).
workflow_name(1,0).
workflow_name(2,0).
workflow_name(2,0).
workflow_name(2,0).
workflow_name(2,0).
% task attributes
attribute(1,'loan_amount','number',2000).
attribute(1,'customer_name','string','customer_234cf5').
attribute(1,'loan_amount_asString','number',2000).
attribute(2,'loan_amount','number',2000).
attribute(5,'recipient','string','chef').
attribute(7,'loan_amount','number',2000).
attribute(8,'recipient','string','customer').
attribute(9,'recipient','string','customer').
