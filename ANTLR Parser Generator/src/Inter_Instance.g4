// Define a grammar called Hello
grammar Inter_Instance;


file  	: (define)* (statement)*   EOF; // TODO find a better name

define : DEF CLAUSE '(' ARGS ((KONJ|',') ARGS)* ')'; 

statement	: explicitSetting
	 		| assignment
			;
			
explicitSetting 	: SET (extern|specification) ((KONJ|',') (extern|specification))* ;

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
		
specification	: 'role' rt 'can execute' tt  		#roleTask // TODO bessere Bezeichnung
				| 'user' ut 'can execute' tt 		#userTask
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
				| 'SUM OF' (VARIABLE|ut|tt|nt)  WHERE conditionalBody 'IS' nt			#sum
				| 'AVG OF' (VARIABLE|ut|tt|nt)  WHERE conditionalBody 'IS' nt			#avg
				| 'MIN OF' (VARIABLE|ut|tt|nt)  WHERE conditionalBody 'IS' nt			#min
				| 'MAX OF' (VARIABLE|ut|tt|nt)  WHERE conditionalBody 'IS' nt			#max
				;

conditionalBody 	: clauses ( KONJ clauses)* ;
	
comparison 		: equalityParams ('='|'!=') equalityParams 		 					#equality
				| inequalityParams ('<'|'<='|'>'|'>=') inequalityParams				#unequality
				; 
				
equalityParams	: (nt|rt|tp|tt|ti|wt|ut|'('arithmetic')'); // TODO hier ist am Anfang noch nicht klar, was es ist, deshalb sollte es nicht gleich abgestempelt werden

inequalityParams: (taut|nt|rt|'('arithmetic')'); // TODO hier ist am Anfang noch nicht klar, was es ist, deshalb sollte es nicht gleich abgestempelt werden
				
arithmetic		: nt|taut ('*'|'/'|'+'|'-') nt|taut // TautT, weil zB time1 - time2 = 30 days
				| '('arithmetic')' ('*'|'/'|'+'|'-') '('arithmetic')';
	
// Constants and Vars
ut	: CONSTANT | VARIABLE ; 	// TODO: add surname
rt	: CONSTANT | VARIABLE | ut ROLE | tt ROLE;
tt 	: intra|inter|interp;
intra	: CONSTANT|VARIABLE ;
inter	: (CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE);
interp	: (CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE);
nt		: NUMBER 
		| VARIABLE 
		| variable
		;
		
tp 		: YEAR? MONTH? DAY? HOUR? MINUTE? SECOND? MSECOND? ; // timepoint symbols // TODO das kann auch den Empty String matchen
ts		: '??' ; // timeinterval symbols
ti		: tt TASKINSTANCE ; // task instances
wt		: '??' ; // workflow symbols
taut	: VARIABLE
		| tp
		| ts
		| 'timestamp(' tt ')'
		| 'timeinterval(' tt ',' tt ')'
		;
variable: 'Var(' tt ').'CONSTANT;


// LEXER PART // TODO move into own file

MULTILINE_COMMENTS  : '/*' .*?  '*/' -> skip;
SINGLE_LINE_COMMENTS: '//' .*? '\n'    -> skip ;

// KEYWORDS
SET		: 'SET' | 'set'; // TODO hier auch Groß und Kleinschreibung vermischt
IF		: 'IF' | 'if' | 'If' | 'iF';
THEN	: 'THEN';
KONJ 	: 'AND' | 'and'; // TODO
DISJ	: 'OR'; // TODO
DEF		: ('DEF'|'DEFINE'|'define'|'def');   
DESC	: ('DESC') [ ]*? '"' .*?  '"'; // TODO
ARGS	: ('UT'|'RT'|'TT'|'WT'|'TauT'|'NT');
WHERE	: 'WHERE';
ROLE	: '.Role';
TASKINSTANCE : '.InstanceID';

// TIME POINTS
YEAR		:	NUMBER 'y';
MONTH		:	NUMBER 'm';
DAY			:	NUMBER 'd';
HOUR		:	NUMBER 'h';
MINUTE		:	NUMBER 'min';
SECOND		:	NUMBER 'sec';
MSECOND	:	NUMBER 'ms';


// ELEMENTARY 
CONSTANT : '\''.*?'\'' ;
VARIABLE : [A-Z][A-Za-z0-9]* ; 
CLAUSE	: [a-z_]+;
NUMBER : [0-9]+ ; // Null muss auch erlaubt sein
STRING  : [A-Za-z0-9]+;


// SKIP WHITESPACES
WS		: [ \t\r\n]+ -> skip;

