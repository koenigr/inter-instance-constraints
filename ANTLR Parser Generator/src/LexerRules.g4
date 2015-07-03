lexer grammar LexerRules;


@lexer::header {
import java.util.HashMap;
import java.util.ArrayList;
}

@lexer::members {
 private HashMap<String, Integer> eventtypes = new HashMap<String, Integer>() {{
  	put("assign", Inter_InstanceParser.EVENTTYPE);
  	put("ate_abort", Inter_InstanceParser.EVENTTYPE);
  	put("autoskip", Inter_InstanceParser.EVENTTYPE);
  	put("complete", Inter_InstanceParser.EVENTTYPE);
  	put("manual_skip", Inter_InstanceParser.EVENTTYPE);
  	put("pi_abort", Inter_InstanceParser.EVENTTYPE);
  	put("reassign", Inter_InstanceParser.EVENTTYPE);
  	put("resume", Inter_InstanceParser.EVENTTYPE);
  	put("schedule", Inter_InstanceParser.EVENTTYPE);
  	put("start", Inter_InstanceParser.EVENTTYPE);
  	put("suspend", Inter_InstanceParser.EVENTTYPE);
  	put("withdraw", Inter_InstanceParser.EVENTTYPE);
}};
  
public void setEventTypes(ArrayList<String> arg) {
eventtypes = new HashMap<String, Integer>();
for (String el: arg) {
  	eventtypes.put(el, Inter_InstanceParser.EVENTTYPE);
}}}
  
  MULTILINE_COMMENTS  : '/*' .*?  '*/' -> skip;
SINGLE_LINE_COMMENTS: '//' .*? '\n'    -> skip ;

// KEYWORDS
SET		: 'SET' | 'set'; // TODO hier auch Groß und Kleinschreibung vermischt
IF		: 'IF' | 'if' | 'If' | 'iF';
THEN	: 'THEN';
NEG		: 'NOT'  | 'not';
KONJ 	: 'AND' | 'and'; // TODO
DISJ	: 'OR' | 'or'; // TODO
DEF		: ('DEF'|'DEFINE'|'define'|'def');   
DESC	: 'DESC' | 'desc' | 'description' ;
ARGS	: ('UT'|'RT'|'TT'|'WT'|'TauT'|'NT'| 'STRING_VAR');
WHERE	: 'WHERE';
ROLE	: '.Role';

TASKINSTANCE : '.InstanceID'; // TODO wegmachen?
WORKFLOWINSTANCE: .'WorkflowID'; // TODO wegmachen?
WORKFLOW:	'.Workflow'; // TODO wegmachen?


TIMESTAMP : '.Timestamp';

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


TIMEINTERVAL: 'P' [ ]? YEARS [ ]? (MONTHS)? [ ]? (DAYS)? [ ]? (HOURS)? 
			[ ]? (MINUTES)? [ ]? (SECONDS)? 
			| 'P' [ ]? MONTHS [ ]? (DAYS)? [ ]? (HOURS)? 
			[ ]? (MINUTES)? [ ]? (SECONDS)? 
			| 'P' [ ]? DAYS [ ]? (HOURS)? 
			[ ]? (MINUTES)? [ ]? (SECONDS)? 
			| 'P' HOURS [ ]? (MINUTES)? [ ]? (SECONDS)? 
			| 'P' MINUTES [ ]? (SECONDS)? 
			| 'P' SECONDS
		 	; // TODO im Moment ist es so, dass es keine Variable mit P geben darf

DATETIME: NUMBER '-' NUMBER '-' NUMBER  'T' NUMBER (':' NUMBER (':' NUMBER ('.' NUMBER)?)? )? ;
DATE	: NUMBER '-' NUMBER ('-' NUMBER)? 	;
TIME	: NUMBER ':' NUMBER (':' NUMBER ('.' NUMBER)?)?  ;

// ELEMENTARY 
CONSTANT 	: '\''.*?'\'' {
	if(eventtypes.containsKey(getText())) {
		setType(eventtypes.get(getText()));
	}}
			|'"'.*?'"' {
	if(eventtypes.containsKey(getText())) {
		setType(eventtypes.get(getText()));
	}}
			;
VARIABLE : [A-Z][A-Za-z0-9]* ; 
CLAUSE	: [a-z_]+;
NUMBER : [0-9]+ ; // Null muss auch erlaubt sein
STRING  : [A-Za-z0-9]+; // Ist es schlimm, dass CLAUSE herausgefiltert wird?


// SKIP WHITESPACES
WS		: [ \t\r\n]+ -> skip;

  