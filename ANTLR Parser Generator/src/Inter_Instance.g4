// Define a grammar called Hello
grammar Inter_Instance;

@parser::header{
}

@parser::members{
	public void checkDate(String sdate) { // TODO kann man solche Funktionen auch in ein extra file verschieben?
		String[] tmpArr = sdate.split("[-T:]"); // TODO gibt es eine praktische Konvention, wie man einen DateString testet?
		if (tmpArr[0] != null) {}
		if (tmpArr[1] != null) {
			if (Integer.parseInt(tmpArr[1]) < 1 || Integer.parseInt(tmpArr[1])>12) {
				System.out.println("Month must be a value between 1 and 12");
			}
		}
		if (tmpArr[2] != null) {}
		if (tmpArr[3] != null) {}
		if (tmpArr[4] != null) {}
		if (tmpArr[5] != null) {}
	}
}

file  	: (define)* (explicitSetting)* (assignment)*  EOF; // TODO find a better name

define : DEF CLAUSE '(' ARGS ((KONJ|',') ARGS)* ')'; // TODO Alles in ein Array oder so laden
			
explicitSetting : SET (extern|specification) ((KONJ|',') (extern|specification))* ;

assignment : (DESC)? IF assignmentBody THEN assignmentHead ;

assignmentBody 	: clauses ( KONJ clauses)* ;

clauses			: atoms
				| '(' atoms (DISJ atoms)* ')'
				;

atoms			: specification		
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
				| 'role' r=rt 'cannot execute' tt	
				{System.out.println($r.text);}
				#cannotRole
				|  ut 'must execute' tt				#mustUser
				| 'mrole' rt 'must execute' tt 		#mustRole
				| 'panic'							#panic
				;
			
status			:  'user'? ut 'executed' tt			#executedUser
				|  'role' rt 'executed' tt			#executedRole
				|  ut 'is assigned to' tt			#assignedUser
				|  tt 'aborted'						#abortedTask // TODO hier auch mit den EventTypes..
				|  tt 'succeeded'					#succeededTask
				|  tt 'started'						#startedTask
				| 'EventType(' tt ').' (event | unknownEvent) #flexibleEvent
				|  ut 'is collaborator of' ut		#collaborator // TODO ??
				|  ut 'is collaborator of' ut 'in tasks' tt ',' tt #collaboratorExt // TODO ??
				;
	
conditional		: 'NUMBER' WHERE conditionalBody 'IS' nt							#numSimple
				| 'NUMBER OF' VARIABLE WHERE conditionalBody 'IS' nt		#numVars
				| 'NUMBER OF DIFF' VARIABLE  WHERE conditionalBody 'IS' nt	#numDiff
				| 'SUM OF' VARIABLE  WHERE conditionalBody 'IS' nt			#sum
				| 'AVG OF' VARIABLE  WHERE conditionalBody 'IS' nt			#avg
				| 'MIN OF' VARIABLE WHERE conditionalBody 'IS' nt			#min
				| 'MAX OF' VARIABLE  WHERE conditionalBody 'IS' nt			#max
				;

conditionalBody 	: clauses ( KONJ clauses)* ;
	
comparison 		: equalityExpr	 					
				| inequalityExpr	
				; 
				
equalityExpr	: VARIABLE equality VARIABLE
				| nt equality nt
				| rt equality rt
				| tp equality tp
				| ts equality ts
				| wt equality wt
				| wi equality wi
				| ut equality ut
				;

inequalityExpr	: VARIABLE inequality VARIABLE
				| nt inequality nt
				| rt inequality rt
				| tp inequality tp
				| ts inequality ts
				;
				
	
event			: 'assign' // TODO hier eine Funktion, die aus einem File liest
				| 'ate_abort'
				| 'autoskip'
				| 'complete'
				| 'manual_skip'
				| 'pi_abort'
				| 'reassign'
				| 'resume'
				| 'schedule'
				| 'start'
				| 'suspend'
				| 'withdraw'
				;
unknownEvent	: CONSTANT;

// Constants and Vars
ut				: CONSTANT | VARIABLE ;
rt				: CONSTANT | VARIABLE | ut ROLE | tt ROLE;
tt 				: intra|inter|interp;
intra			: CONSTANT|VARIABLE ;
inter			: (CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE);
interp			: (CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE);
nt				: NUMBER 
				| '(' nt arithmetic nt ')'
				| VARIABLE 
				;
				
// timepoint symbols		
tp 		:DATETIME
		{checkDate($DATETIME.text);}
		# dateTime
		| DATE					# date 	 
		| TIME		# time
		| '(' tp ADD ts ')'    										# relativeTimepoint
		| 'timestamp(' tt ')'  										# timestamp
		| VARIABLE 													# varTP
		; 
		
// timeinterval symbols
ts		: (YEARS)? (MONTHS)? (DAYS)? (HOURS)? (MINUTES)? (SECONDS)? // TODO wie machen, dass mind 1 da sein muss?
		 {System.out.println($DAYS.text);}		
			# absoluteInterval
		| '(' tp SUB tp ')'											# timedifference
		| 'timeinterval(' tt ',' tt ')'								# timeinterval
		| VARIABLE													# varTS
		; 
	

// workflow symbols
wt		: tt WORKFLOW ; 

// workflow instances
wi 		: tt WORKFLOWINSTANCE;

// task variables
vt		: 'Var(' tt ').'CONSTANT
		; 

// Comparison Cases
equality 	: EQUAL 		#equal
			| NOTEQUAL		#noteual
			;
inequality	: LOWER			#lower
			| LEQ			#leq
			| GREATER		#greater
			| GEQ			#geq
			;

arithmetic	: MUL 			#mul
			| DIV			#div
			| ADD			#add
			| SUB			#sub
			;

// LEXER PART // TODO move into own file

MULTILINE_COMMENTS  : '/*' .*?  '*/' -> skip;
SINGLE_LINE_COMMENTS: '//' .*? '\n'    -> skip ;

// KEYWORDS
SET		: 'SET' | 'set'; // TODO hier auch Groß und Kleinschreibung vermischt
IF		: 'IF' | 'if' | 'If' | 'iF';
THEN	: 'THEN';
KONJ 	: 'AND' | 'and'; // TODO
DISJ	: 'OR' | 'or'; // TODO
DEF		: ('DEF'|'DEFINE'|'define'|'def');   
DESC	: ('DESC') [ ]*? '"' .*?  '"'; // TODO
ARGS	: ('UT'|'RT'|'TT'|'WT'|'TauT'|'NT');
WHERE	: 'WHERE';
ROLE	: '.Role';
TASKINSTANCE : '.InstanceID';
WORKFLOWINSTANCE: .'WorkflowID';
WORKFLOW:	'.Workflow';

// SPECIAL SYMBOLS
EQUAL   	: '=' ;
NOTEQUAL	: '!=' ;
LOWER		: '<' ;
LEQ			: '<=' ;
GREATER		: '>' ;
GEQ			: '>=' ;
MUL		 	: '*' ;
DIV			: '/' ;
ADD			: '+' ;
SUB			: '-' ;


YEARS 	: NUMBER 'Y';
MONTHS	: NUMBER 'M';
DAYS	: NUMBER 'D';
HOURS	: NUMBER 'h';
MINUTES	: NUMBER 'm';
SECONDS	: NUMBER ('.' NUMBER)? 's';

DATETIME: NUMBER '-' NUMBER '-' NUMBER  'T' NUMBER (':' NUMBER (':' NUMBER ('.' NUMBER)?)? )? ;
DATE	: NUMBER ('-' NUMBER ('-' NUMBER)? )?	;
TIME	: NUMBER (':' NUMBER (':' NUMBER ('.' NUMBER)?)? )? ;

// ELEMENTARY 
CONSTANT : '\''.*?'\'' ;
VARIABLE : [A-Z][A-Za-z0-9]* ; 
CLAUSE	: [a-z_]+;
NUMBER : [0-9]+ ; // Null muss auch erlaubt sein
STRING  : [A-Za-z0-9]+; // Ist es schlimm, dass CLAUSE herausgefiltert wird?


// SKIP WHITESPACES
WS		: [ \t\r\n]+ -> skip;

