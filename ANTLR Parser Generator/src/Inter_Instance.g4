// Define a grammar called Hello
grammar Inter_Instance;


file  	: (statement)*   EOF; // TODO find a better name

// TODO : define own literals

statement	: explicit
	 		| assignment
			| staticdynamic
			| derivation
			;
			
explicit 	: 'SET' (extern|specification) ;

assignment : 'IF' assignmentBody ('AND' assignmentBody)* 'THEN' assignmentHead ;

assignmentBody 	: specification
				| status
				| comparison
				| conditional
				| extern
				;

assignmentHead : enforcement ;

staticdynamic : 'IF' staticdynamicBody ('AND' staticdynamicBody)* 'THEN' staticdynamicHead ;

staticdynamicBody 	: specification
					| comparison
					| conditional
					;

staticdynamicHead   : enforcement
					| specification 
					;

derivation : 'IF' derivationBody ('AND' derivationBody)* 'THEN' derivationHead ;

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
				| 'panic'
				;
			
status			: 'executed_u(' user ',' task ')'
				| 'executed_r(' role ',' task ')'
				| 'assigned(' user ',' task ')'
				| 'aborted(' task ')'
				| 'succeeded(' task ')'
				| 'collaborator(' user ',' user ')'
				;
	
conditional		: 'count(' (specification|status|comparison) ',' nt ')'
				| 'count(' (nt) ',' (specification|status|comparison) ',' nt ')' // TODO instead of user all vars
				| 'avg(' (nt)',' (specification|status|comparison|output|input) ',' nt ')' // TODO instead of user all vars
				| 'min(' (nt) ',' (specification|status|comparison|output|input) ',' nt ')' // TODO instead of user all vars
				| 'max(' (nt) ',' (specification|status|comparison|output|input) ',' nt ')' // TODO instead of user all vars
				| 'sum(' (nt) ',' (specification|status|comparison|output|input) ',' nt ')' // TODO instead of user all vars
				;
	
comparison 		: (ut|rt|ct|tt|ti|wt|nt|'('arithmetic')') ('='|'!=') (ut|rt|ct|tt|ti|wt|nt|'('arithmetic')')
				| (taut|nt|'('arithmetic')') ('<'|'<='|'>'|'>=') (taut|nt|'('arithmetic')')
				; 
				
arithmetic		: nt ('*'|'/'|'+'|'-') nt
				| '('arithmetic')' ('*'|'/'|'+'|'-') '('arithmetic')';
	
// Constants and Vars
user	: CONSTANT | VARIABLE ; 	// TODO: add surname
role	: CONSTANT | VARIABLE ;
task 	: intra|inter|interp;
intra	: CONSTANT|VARIABLE ;
inter	: (CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE);
interp	: (CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE);
nt		: NUMBER 
		| VARIABLE 
		| 'timestamp(' task ',' taut ')'	
		| 'time_interval(' task ',' task ')'; 
ut		: user ;
rt		: role ;
ct 		: '??' ; // timepoint symbols
tt		: task ;
ti		: task ;
wt		: 'workflow' ;
taut	:  VARIABLE ;
input	: 'Input(' task ').' inputvar ;
inputvar: VARIABLE ; // TODO: es sollte auch Kleinschreibung möglich sein
output 	: 'Output(' task ').' outputvar;
outputvar: VARIABLE;

STRING  : [A-Z][a-z]+;
CONSTANT : '\''.*?'\'' ;
VARIABLE : [A-Z0-9]+ ;
STRING_NUM : [A-Za-z0-9]+ ;
NUMBER : [1-9][0-9]+ ;

// TODO Comments erweitern
COMMENTS: '/*' .*?  '*/' -> skip;
WS		: [ \t\r\n]+ -> skip;

