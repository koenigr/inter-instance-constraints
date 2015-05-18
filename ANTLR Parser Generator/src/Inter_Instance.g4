// Define a grammar called Hello
grammar Inter_Instance;


file  	: (statement)*   EOF; // TODO find a better name

// TODO : define own literals

statement	: explicit
	 		| assignment
			| staticdynamic
			| derivation
			;
			
explicit 	: 'SET' (extern|specification) ';';

assignment : 'IF' assignmentBody ('AND' assignmentBody)* 'THEN' assignmentHead  ';' ;

assignmentBody 	: specification
				| status
				| comparison
				| conditional
				| extern
				;

assignmentHead : enforcement ;

staticdynamic : 'IF' staticdynamicBody ('AND' staticdynamicBody)* 'THEN' staticdynamicHead  ';' ;

staticdynamicBody 	: specification
					| comparison
					| conditional
					;

staticdynamicHead   : enforcement
					| specification 
					;

derivation : 'IF' derivationBody ('AND' derivationBody)* 'THEN' derivationHead  ';' ;

derivationBody 		: specification
					| status
					;

derivationHead   	: enforcement
					| specification 
					;		
					
/* Literals */
extern	: 'related(' user ',' user ')'
		| 'partner_of(' user ',' user ')'
		| 'same_group(' user ',' user ')'
		;
		
specification	: 'role(' role ',' task ')'
				| 'user(' user ',' task ')'
				| 'belong(' user ',' role ')'
				| 'glb(' role ',' task ')'
				| 'lub(' role ',' task ')'
				| '>(' role ',' role ')'
				| 'critical_task_pair(' task ',' task ')'
				;

enforcement		: 'cannot_do_u(' user ',' task ')' 
				| 'cannot_do_r(' role ',' task ')'
				| 'must_execute_u(' user ',' task ')'
				| 'must_execute_r(' role ',' task ')'
				;
			
status			: 'executed_u(' user ',' task ')'
				| 'executed_r(' role ',' task ')'
				| 'assigned(' user ',' task ')'
				| 'aborted(' task ')'
				| 'succeeded(' task ')'
				| 'collaborator(' user ',' user ')'
				;
	
conditional		: 'count(' (specification|status|comparison) ',' nt ')'
				| 'count(' user ',' (specification|status|comparison) ',' nt ')' // TODO instead of user all vars
				| 'avg(' user ',' (specification|status|comparison) ',' nt ')' // TODO instead of user all vars
				| 'mint(' user ',' (specification|status|comparison) ',' nt ')' // TODO instead of user all vars
				| 'max(' user ',' (specification|status|comparison) ',' nt ')' // TODO instead of user all vars
				| 'sum(' user ',' (specification|status|comparison) ',' nt ')' // TODO instead of user all vars
				| 'timestamp ('
				| 'time_interval('
				;
	
comparison 		: (ut|rt|ct|tt|ti|wt|nt) '=' (ut|rt|ct|tt|ti|wt|nt)
				| (taut|nt) ('<'|'<='|'>'|'>=') (taut|nt)
				;
				
	
user	: CONSTANT | VARIABLE ; 	// TODO: add surname
role	: CONSTANT | VARIABLE ;
task 	: CONSTANT | VARIABLE ;
nt		: NUMBER; 		// TODO: nt are constants and vars
ut		: user ;
rt		: role ;
ct 		: '??' ;
tt		: task ;
ti		: task ;
wt		: 'workflow' ;
taut	: 'kp' ;


STRING  : [A-Z][a-z]+;
CONSTANT : '\''.*?'\'' ;
VARIABLE : [A-Z]+ ;
STRING_NUM : [A-Za-z0-9]+ ;
NUMBER : [1-9][0-9]+ ;

WS		: [ \t\r\n]+ -> skip;

