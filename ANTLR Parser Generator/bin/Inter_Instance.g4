// Define a grammar called Hello
grammar Inter_Instance;
@header {
	package cParser;
}

file  	: (statements)*   EOF; // TODO besseren Namen für irule finden

statements	: explicit
	 		| assignment
			| staticdynamic
			| derivation
			;
			
explicit 	: 'SET' (extern|specification) ';';

assignment : 'IF' assignmentBody 'THEN' assignmentBody  ('AND' assignmentBody)*';' ;

assignmentBody 	: specification
				| status
				| compare
				| conditional
				;

assignmentHead : enforcement ;

staticdynamic : 'IF' staticdynamicBody 'THEN' staticdynamicBody  ('AND' staticdynamicBody)*';' ;

staticdynamicBody 	: specification
					| compare
					| conditional
					;

staticdynamicHead   : enforcement
					| specification 
					;

derivation : 'IF' derivationBody 'THEN' derivationBody  ('AND' derivationBody)*';' ;

derivationBody 		: specification
					| status
					;

derivationHead   	: enforcement
					| specification 
					;		

literals	: extern
		 	| specification
			| enforcement
			| status
			| conditional
			| comparison
			;

extern	: 'related(' USER ',' USER ')'
		| 'partner_of(' USER ',' USER ')'
		| 'same_group(' USER ',' USER ')'
		;
		

	
	
USER	: [A-Z][a-z]*? ; // TODO vor und nachname
