lexer grammar LexerRules;


@lexer::header {
package iicmchecker.constraintReader;
	
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
SET		: 'SET'; 
IF		: 'IF';
THEN	: 'THEN';
NEG		: 'NOT';
KONJ 	: 'AND'; 
DISJ	: 'OR'; 
DEF		: 'DEF';   
DESC	: 'DESC';
ARGS	: ('UT'|'RT'|'TT'|'WT'|'TP'|'NT'| 'TS'| 'STRING_VAR');
WHERE	: 'WHERE';


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

// This keyword is reserved for generated vars. 
// Its not possible to use it in the grammar.
// TODO noch das andere für desc oder so dazutun.
GEN			: 'GENERATED'; 

YEARS 	: NUMBER 'Y';
MONTHS	: NUMBER 'M';
DAYS	: NUMBER 'D';
HOURS	: NUMBER 'h';
MINUTES	: NUMBER 'm';
SECONDS	: NUMBER ('.' NUMBER)? 's';


TIMEINTERVAL: 'P' [ ]? YEARS [ ]? (MONTHS)? [ ]? (DAYS)? [ ]? 'T'(HOURS)? 
			[ ]? (MINUTES)? [ ]? (SECONDS)? 
			| 'P' [ ]? MONTHS [ ]? (DAYS)? [ ]? 'T' (HOURS)? 
			[ ]? (MINUTES)? [ ]? (SECONDS)? 
			| 'P' [ ]? DAYS [ ]? 'T' (HOURS)? 
			[ ]? (MINUTES)? [ ]? (SECONDS)? 
			| 'P' 'T' HOURS [ ]? (MINUTES)? [ ]? (SECONDS)? 
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
VARIABLE : [A-Z][A-Za-z0-9_]* ; 
CLAUSE	: [a-z_]+;
NUMBER : [0-9]+ ; // Null muss auch erlaubt sein
STRING  : [A-Za-z0-9]+; // Ist es schlimm, dass CLAUSE herausgefiltert wird?


// SKIP WHITESPACES
WS		: [ \t\r\n]+ -> skip;

  