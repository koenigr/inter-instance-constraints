// Define a grammar called Hello
grammar Inter_Instance;
import LexerRules;

@parser::header{
  package iicmchecker.constraintReader;
	
  import iicmchecker.constraintReader.ParserHelper;
  import java.util.logging.Logger;
  import java.util.logging.Level;
  import iicmchecker.logging.LoggerFactory;
  import iicmchecker.exceptions.UnexpectedContextException;
}

@parser::members{
  ParserHelper ph = new ParserHelper();
  enum Context { UNKNOWN, INTRA, INTER, INTERP};
  Context context = Context.UNKNOWN;
  Logger logger = LoggerFactory.getLogger();
 
}


tokens {EVENTTYPE}

file  	: { logger.severe("Start parsing..."); }
		(define)* (explicitSetting)* (assignment)*  EOF
		 { logger.severe("End of parsing..."); }
		;

define 	: DEF CLAUSE {ph.addClause($CLAUSE.text);} '(' ARGS {ph.addArgTypeToClause($CLAUSE.text, $ARGS.text);}
			((',') ARGS {ph.addArgTypeToClause($CLAUSE.text, $ARGS.text);}	
			)* ')' 
		
		; 
			
explicitSetting : SET (extern|specification|definedClause) ((KONJ|',') (extern|specification|definedClause))* ; // TODO Konj und . sollten schon das selbe sein

assignment 	: { context = Context.UNKNOWN;}
			(description)? IF (assignmentBody)? THEN assignmentHead 	
			;
			
description		: DESC CONSTANT;

assignmentBody 	: clauses ( KONJ clauses)* ; 

clauses			: atoms
				| disjunction
				| negation
				;
				
disjunction		: '(' atoms (DISJ atoms)* ')'
				; 
				
negation		: NEG atoms;

atoms			: specification		
				| status
				| comparison
				| conditional
				| extern
				| definedClause
				;

definedClause	: CLAUSE '(' (CONSTANT|VARIABLE) (',' (CONSTANT|VARIABLE))* ')'
				{ ph.existsClause($CLAUSE.text);}
				;

assignmentHead : enforcement|definedClause ;

					
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
				| 'role' rt 'cannot execute' tt	#cannotRole
				|  ut 'must execute' tt				#mustUser
				| 'role' rt 'must execute' tt 		#mustRole
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
				;
	
conditional		: 'NUMBER' WHERE conditionalBody 'IS' nt					#numSimple
				| 'NUMBER OF' VARIABLE WHERE conditionalBody 'IS' nt		#numVars
				| 'NUMBER OF DIFF' VARIABLE  WHERE conditionalBody 'IS' nt	#numDiff // TODO das müsste doch eigentlich schon numVars sein
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
				| wt equality wt // TODO wegmachen?
				| wi equality wi // TODO wegmachen?
				| ut equality ut
				| st equality st
				;

inequalityExpr	: VARIABLE inequality VARIABLE
				| nt inequality nt
				| rt inequality rt
				| tp inequality tp
				| ts inequality ts
				| st inequality st
				;
				
	
event			: EVENTTYPE ; 


unknownEvent	: CONSTANT;

// Constants and Vars
ut				: CONSTANT | VARIABLE ;
rt				: CONSTANT | VARIABLE | ut ROLE | tt ROLE;
tt 				: intra { 
					if (context == Context.UNKNOWN) {
						context = Context.INTRA;
					} else if (context != Context.INTRA) {
					logger.log(Level.SEVERE, ""
						, new UnexpectedContextException($intra.text, "INTRA",  context.toString())
					);
					}
				}
				|inter { 
					if (context == Context.UNKNOWN) {
						context = Context.INTER;
					} else if (context != Context.INTER) {
					logger.log(Level.SEVERE, ""
						, new UnexpectedContextException($inter.text, "INTER",  context.toString())
					);
					}
				}
				|interp { 
					if (context == Context.UNKNOWN) {
						context = Context.INTERP;
					} else if (context != Context.INTERP) {
					logger.log(Level.SEVERE, ""
						, new UnexpectedContextException($interp.text, "INTERP", context.toString())
					);
					}
				}
				;

intra			: CONSTANT|VARIABLE 
				;
				
				
inter			: (CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE)
				;
				
				
interp			: (CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE)'.'(CONSTANT|VARIABLE)
				;
				
				
nt				: NUMBER 										#num
				| VARIABLE 										#var
				| '(' nt arithmetic nt ')'						# arithm
				| 'Num_Var(' tt ').'CONSTANT					# num_var
				;
				
st	    : 'String_Var(' tt ').'CONSTANT							#str_var
		| VARIABLE												#var1
		| CONSTANT												#num1
		; 
				
// timepoint symbols		
tp 		:DATETIME
		{ph.checkDateTime($DATETIME.text);}							# dateTime
		| DATE					
		{ph.checkDate($DATE.text);}									# date 	 
		| TIME		
		{ph.checkTime($TIME.text);}									# time
		| '(' tp ADD ts ')'    										# relativeTimepoint
		| tt  TIMESTAMP											# timestamp
		| VARIABLE 													# varTP
		; 
		
// timeinterval symbols
ts		: TIMEINTERVAL		
		{ph.checkTimeInterval($TIMEINTERVAL.text);}					# absoluteInterval
		| '(' tp SUB tp ')'											# timedifference
		| 'timeinterval(' tt ',' tt ')'								# timeinterval
		| VARIABLE													# varTS
		; 
	

// workflow symbols
wt		: tt WORKFLOW ; 

// workflow instances
wi 		: tt WORKFLOWINSTANCE;

		

// Comparison Cases
equality 	: EQUAL 		
			| NOTEQUAL		
			;
inequality	: LOWER			
			| LEQ		
			| GREATER		
			| GEQ			
			;

arithmetic	: MUL 			
			| DIV			
			| ADD			
			| SUB			
			;



