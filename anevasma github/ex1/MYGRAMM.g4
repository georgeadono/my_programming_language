grammar MYGRAMM;


program: PROGRAM 
		 declarations statements 
		 ENDPROGRAM ;

declarations: ( DECLARE varlist ENDDECLARE )* ;

varlist

: INTEGER variable 
  ( COMMA variable )* 
  |
  REAL variable 
 ( COMMA variable )* ;

statements
: statement ( SEMICOLON statement )* ;

statement: INPUT input_tail | 
		   PRINT print_tail | 
		   variable
		   assign_tail;
		   
input_tail: L_PAR variable R_PAR ;

print_tail: L_PAR expression R_PAR ;

assign_tail: ASSIGN expression;

expression: sign term ( PLUS term | MINUS term )* ;

sign: PLUS | MINUS |  ;

term: factor ( STAR factor | SLASH factor )* ;

factor: numerical_constant 
		|
		variable 
		| 
		L_PAR expression R_PAR ;
		
numerical_constant: NUMBER;

variable: LETTER+ LETTER* | LETTER+ NUMBER*;
		 
PROGRAM: 'program';
DECLARE: 'declare';
INTEGER: 'integer';
REAL: 'real';
COMMA: ',';
SEMICOLON: ';';
L_PAR: '(';
R_PAR: ')';
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
ASSIGN: ':=';
NULL: ' ' -> skip ;
LETTER: [a-zA-Z];
NUMBER: [0-9]+ | [0-9]+.[0-9]+;
INPUT: 'input';
PRINT: 'print';
ENDDECLARE: 'enddeclare';
ENDPROGRAM: 'endprogram';
WS : [ \t\r]+  -> skip ;
NEWLINE: [\n]+ -> skip;