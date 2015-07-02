% exetuted_u status facts
executed_u('Mark','0').
executed_u('Susi','1').
executed_u('Susi','2').
executed_u('Bob','3').
executed_u('Mark','4').
executed_u('Stefania','5').
executed_u('Mark','6').
executed_u('Susi','7').
executed_u('Lorenzo','8').
executed_u('Lorenzo','9').
% exetuted_g status facts
executed_g('null','0').
executed_g('null','1').
executed_g('null','2').
executed_g('null','3').
executed_g('null','4').
executed_g('null','5').
executed_g('null','6').
executed_g('null','7').
executed_g('null','8').
executed_g('null','9').
% task names 
task('0','check').
task('1','pay').
task('2','pay').
task('3','send_mail').
task('4','check').
task('5','send_mail').
task('6','check').
task('7','pay').
task('8','send_mail').
task('9','call_customer').
% timestamps
timestamp('0','Wed Jun 02 18:06:24 CEST 3915').
timestamp('1','Sun Jan 25 20:56:45 CET 1970').
timestamp('2','Sun Jan 25 20:56:45 CET 1970').
timestamp('3','Wed Jun 02 18:06:24 CEST 3915').
timestamp('4','Wed Jun 02 18:06:24 CEST 3915').
timestamp('5','Sun Jan 25 20:56:45 CET 1970').
timestamp('6','Wed Jun 02 18:06:24 CEST 3915').
timestamp('7','Sun Jan 25 20:56:45 CET 1970').
timestamp('8','Sun Jan 25 20:56:45 CET 1970').
timestamp('9','Sun Jan 25 20:56:45 CET 1970').
% task workflow facts
task_workflow('0','0').
task_workflow('1','0').
task_workflow('2','0').
task_workflow('3','1').
task_workflow('4','1').
task_workflow('5','1').
task_workflow('6','2').
task_workflow('7','2').
task_workflow('8','2').
task_workflow('9','2').
% workflow names facts
workflow('0','0').
workflow('0','0').
workflow('0','0').
workflow('1','0').
workflow('1','0').
workflow('1','0').
workflow('2','0').
workflow('2','0').
workflow('2','0').
workflow('2','0').
% task attributes
task_var('1' , 'loan_amount' ,2000).
task_var('2' , 'loan_amount' ,2000).
task_var('5' , 'recipient' ,2000).
task_var('7' , 'loan_amount' ,2000).
task_var('8' , 'recipient' ,2000).
task_var('9' , 'recipient' ,2000).
