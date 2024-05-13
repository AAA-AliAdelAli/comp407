grammar final;

options {output=AST;}

tokens{
MAINSTMT;
STARTIT;
MAINCLASS;
CLASSDEC;
METHODDEC;
EXPR;
}


@members {
String s="";
}

compilationUnit:new_compilationUnit -> ^(STARTIT new_compilationUnit ) ;

// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
// The finally clause is the last part a rule executes before returning.
finally { s = s + "Exit..."+"\n"; }
  
new_compilationUnit
	:	 mainClass (classDeclaration)* ;
	
	
mainClass: ast_main -> ^(MAINCLASS ast_main) ;

	// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

ast_main:('class' ID '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' '{' (stmt)* '}' '}');	




classDeclaration 
	:	ast_classDeclaration -> ^(CLASSDEC ast_classDeclaration);
	
		// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}



ast_classDeclaration: 'class' ID ('extends' ID)? '{' classBody* '}';

classBody: (varDeclaration | methodDeclaration);


varDeclaration: type ID ';';




methodDeclaration
	:	ast_methodDeclaration -> ^(METHODDEC ast_methodDeclaration);
	
		// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


ast_methodDeclaration: 'public' type ID '('method_cond? ')' '{' methodBody* 'return' expression ';' '}';


method_cond
	:	( type ID ( ',' type ID )* ) ;

methodBody: (varDeclaration | stmt);       
 
 
stmt 	:	(new_stmt) -> ^( MAINSTMT  new_stmt );
	
		// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


	
 new_stmt : '{' ( stmt )* '}' 
	| if_stmt
         | while_stmt
         | ID '=' expression ';' 
         | ID '[' expression ']' '=' expression ';';
         
if_stmt	:	IF '(' expression ')' stmt ELSE stmt ;
while_stmt
	:	WHILE '(' expression ')' stmt | 'System.out.println' '(' expression ')' ';' ;

expression
	:	ast_expression -> ^(EXPR ast_expression);
		
		// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


ast_expression: term (tail)* ;

tail: (Operator term 
      | '[' expression ']' 
      | '.' (ID '(' (expression (',' expression)*)? ')' | 'length')) ;             



term: Int_N | Bool_CH | ID | 'this' | 'new' 'int' '[' expression ']' | 'new' ID '(' ')'
     | '!' expression | '(' expression ')' ;

type: ('int' '[' ']' | 'boolean' | 'int' | ID);

Bool_CH: ('true' | 'false');

Int_N: '0'..'9'+;
IF	:	'if';
ELSE	:	'else';
WHILE 	:	'while' ;

Operator: ('&&' | '<' | '+' | '-' | '*');

ID  : ('a'..'z'|'A'..'Z'|'_'|'$')('a'..'z'|'A'..'Z'|'_'|'$'|'0'..'9')* ;

COMMENT:   ('/*' ( options {greedy=false;} : . )* '*/' {skip();} |   '//' ~('\n'|'\r')* {skip();});


WS  : (' '|'\t'|'\n'|'\r')+ {skip();} ;

