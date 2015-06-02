// Define a grammar called Hello
grammar Inter_Instance;


file  	: (define)* (statement)*   EOF; // TODO find a better name

define : DEF CLAUSE '(' ARGS (',' ARGS)* ')'; 

statement	: explicit
	 		| assignment
			;
			
explicit 	: SET (extern|specification) (',' (extern|specification))* ;

assignment : (DESC)? IF assignmentBody THEN assignmentHead ;

assignmentBody 	: clauses ( KONJ clauses)* ;

clauses			: specification
				| status
				| comparison
				| conditional
				| extern
				;

assignmentHead : enforcement ;

					
/* Literals */
extern	: ut 'is related to' ut			#related
		| ut 'is partner of' ut			#partnerof
		| ut 'is in same group as' ut	#samegroup
		;
		
specification	: 'role' rt 'must execute' tt  		#roleTask
				| 'user' ut 'must execute' tt 		#userTask
				| 'user' ut 'belongs to role' rt 	#userRole
				|  rt 'is glb of' tt 				#glb
				|  rt 'is lub' tt 					#lub
				|  rt 'dominates' rt 				#dominate
				| 'critical_task_pair('tt','tt')'	#critTaskPair
				;

enforcement		: 'user'? ut 'cannot execute' tt	#cannotUser
				| 'role' rt 'cannot execute' tt		#cannotRole
				|  ut 'must execute' tt				#mustUser
				| 'mrole' rt 'must execute' tt 		#mustRole
				| 'panic'							#panic
				;
			
status			:  'user'? ut 'executed' tt			#executedUser
				|  'role' rt 'executed' tt			#executedRole
				|  ut 'is assigned to' tt			#assignedUser
				|  tt 'aborted'						#abortedTask
				|  tt'succeeded'					#succeededTask
				|  ut 'is collaborator of' ut		#collaborator
				|  ut 'is collaborator of' ut 'in tasks' tt ',' tt #collaboratorExt
				;
	
conditional		: 'NUMBER' WHERE conditionalBody 'IS' nt							#numSimple
				| 'NUMBER OF' (VARIABLE|ut|tt) WHERE conditionalBody 'IS' nt		#numVars
				| 'NUMBER OF DIFF' (VARIABLE|ut|tt)  WHERE conditionalBody 'IS' nt	#numDiff
				| 'SUM OF' (VARIABLE|ut|tt)  WHERE conditionalBody 'IS' nt			#sum
				| 'AVG OF' (VARIABLE|ut|tt)  WHERE conditionalBody 'IS' nt			#avg
				| 'MIN OF' (VARIABLE|ut|tt)  WHERE conditionalBody 'IS' nt			#min
				| 'MAX OF' (VARIABLE|ut|tt)  WHERE conditionalBody 'IS' nt			#max
				;

conditionalBody 	: clauses ( KONJ clauses)* ;
	
comparison 		: equalityParams ('='|'!=') equalityParams 		 					#equality
				| unequalityParams ('<'|'<='|'>'|'>=') unequalityParams				#unequality
				; 
				
equalityParams	: (ut|rt|ct|tt|ti|wt|nt|'('arithmetic')');

unequalityParams: (taut|nt|rt|'('arithmetic')'); // TODO hier ist am Anfang noch nicht klar, was es ist, deshalb sollte es nicht gleich abgestempelt werden
				
arithmetic		: nt ('*'|'/'|'+'|'-') nt
				| '('arithmetic')' ('*'|'/'|'+'|'-') '('arithmetic')';
	
// Constants and Vars
ut	: CONSTANT | VARIABLE ; 	// TODO: add surname
rt	: CONSTANT | VARIABLE | ut '.Role' | tt '.Role';
tt 	: intra|inter|interp;
intra	: CONSTANT|VARIABLE ;
inter	: (CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE);
interp	: (CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE);
nt		: NUMBER 
		| VARIABLE 
		| 'timestamp(' tt ',' taut ')'	
		| 'time_interval(' tt ',' tt ')'
		| output
		| input
		;
		
ct 		: '??' ; // timepoint symbols
ti		: '??' ;
wt		: '??' ;
taut	:  VARIABLE|ct ;
input	: 'Input(' tt ').' inputvar ;
inputvar: VARIABLE ; // TODO: es sollte auch Kleinschreibung möglich sein
output 	: 'Output(' tt ').' outputvar;
outputvar: VARIABLE;


// LEXER PART

MULTILINE_COMMENTS  : '/*' .*?  '*/' -> skip;
SINGLE_LINE_COMMENTS: '//' .*? '\n'    -> skip ;

SET		: 'SET';
IF		: 'IF' | 'if' | 'If' | 'iF';
THEN	: 'THEN';
KONJ 	: 'AND'; // TODO
DISJ	: 'OR'; // TODO
DEF		: ('DEF'|'DEFINE'|'define'|'def');   
DESC	: ('DESC') [ ]*? '"' .*?  '"'; // TODO
ARGS	: ('UT'|'RT'|'TT'|'WT'|'TauT'|'NT');
WHERE	: 'WHERE';

CONSTANT : '\''.*?'\'' ;
VARIABLE : [A-Za-z0-9]+ ;
CLAUSE	: [a-z_]+;
NUMBER : [1-9][0-9]+ ;


// TODO Whitespaces ganz zum Schluss
WS		: [ \t\r\n]+ -> skip;

