grammar ArithmeticExpressions;



options {output=AST;}
tokens{
Start;
StartgeneralArithExpr;
GeneralArithExpr;
Term;
Factor;
Method;
COMMENT;
Assigment;
Forloop;
Whilestmt;
Decl;
Ifstmt;
Double_dec;
Int_dec;
ClassDec;
TYPE;
String_Dec;
Condition;
Conditions;
Main_METHOD;
Print;
Initialize;
Initialize_1;
Sys_print;
Ifstmt_2;

}
@members {
String s="";
}


startgeneralArithExpr	:	classDec* -> ^(Start classDec*);
// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
// The finally clause is the last part a rule executes before returning.
finally { s = s + "Exit..."+"\n"; }
  
classDec:	Modifier? Class VAR* '{' stmt* '}' ->^(ClassDec Modifier? Class VAR '{' stmt* '}');
	// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}


stmt    :   (
	decl -> ^(Decl decl)
	
	|main_method->^(Main_METHOD main_method)
	|ifstmt -> ^(Ifstmt ifstmt)
	|whilestmt -> ^(Whilestmt whilestmt)
	|forloop -> ^(Forloop forloop)
	|assigment -> ^(Assigment assigment)
	|method -> ^(Method method)
	|string_dec -> ^(String_Dec string_dec)
	|initialize -> ^(Initialize initialize)
	|initialize_1 -> ^(Initialize_1 initialize_1 )
	|sys_print -> ^(Sys_print  sys_print)
	);
	// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

	
	
	
method	:
	Modifier types? VAR* params '{' stmt* 'return' return_type SEMICOLON'}'
	 -> ^(Method Modifier types? VAR* params '{' stmt* 'return' return_type SEMICOLON'}')
	;
	
	
	
main_method
	
	:Modifier Static VOID Main '('STRING '['']' 'a' ')' '{'print*'}'-> ^(Main_METHOD Modifier Static VOID Main '('STRING '['']' 'a'  ')' '{'print*'}');
print	:System Dot Out Dot Println '('New VAR '('')'Dot VAR '('NUM?')' ')' SEMICOLON->^(Print System Dot Out Dot Println '('New VAR '('')'Dot VAR '('NUM?')' ')' SEMICOLON);

return_type
	:VAR|NUM ;
	
	
initialize: (types('['']')? VAR SEMICOLON|VAR* SEMICOLON);

initialize_1
	:	VAR '=' (New|VAR) Dot? VAR '('(NUM|VAR)?')' ;
sys_print
	:	System Dot Out Dot Println '('(NUM|VAR Dot VAR '('NUM?')')  ')' SEMICOLON;
object	:	VAR Dot VAR '(' (NUM|VAR)? ')' | VAR?;


params	:	'('((types VAR|VAR VAR) (',' types VAR)*)? ')';
decl    :   
	int_dec	-> ^(Int_dec int_dec)
	|double_dec -> ^(Double_dec double_dec)
	;
	while_condition
  	:	'(' condition ')'|object;
whilestmt	:	
	'while' '(' while_condition ')' '{' stmt* '}'
	 -> ^(Whilestmt 'while' '(' while_condition ')' '{' stmt* '}')
	; 
	
	//ifstmt_2  :    
	//'if' '(' if_cond ')' VAR ('{')? stmt* ('}')?('else' ('{')? stmt* ('}')?)?; 
ifstmt  :    
	'if' '(' ('!' '(')? if_cond (')')? ')' ('{')? stmt* ('}')? ('else' ('{')? stmt* ('}')?)? ('else' ('{')? stmt* ('}')?)?;
	
  
 if_cond	:  if_nor | object ; 
 if_nor :	 VAR (( '>' | '<' )^  VAR )*;
forloop	:   
	'for' '(' (decl) (condition) SEMICOLON (VAR change) ')' '{' stmt* '}'
	;
assigment:   
	assign
	-> ^(Assigment assign)
	;
	// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

assign	:	
	VAR (change|'=' generalArithExpr) SEMICOLON
	;
change	:
	('++'|'--'|('+='|'-=')generalArithExpr)
	;

condition:  
	generalArithExpr RelationalOperators generalArithExpr (AndOr condition)?
	->^(Condition generalArithExpr RelationalOperators generalArithExpr (AndOr condition)?)
	;
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  
int_dec	:	
	//(Modifier? INT VAR '=' (NUM|VAR) (Operation (NUM|VAR))* SEMICOLON)
	Modifier? INT VAR (('=' generalArithExpr)?|(',' VAR)*) SEMICOLON
	;
  
double_dec:	
	//(Modifier? DOUBLE VAR '=' (DNUM|NUM|VAR) (Operation (DNUM|NUM|VAR))* SEMICOLON)
	Modifier? DOUBLE VAR (('=' generalArithExpr)?|(',' VAR)*) SEMICOLON
	;

string_dec:	
	//(Modifier? DOUBLE VAR '=' (DNUM|NUM|VAR) (Operation (DNUM|NUM|VAR))* SEMICOLON)
	Modifier? STRING VAR ('=' Strings)? SEMICOLON
	 -> ^(String_Dec Modifier? STRING VAR ('=' Strings)? SEMICOLON)
	;
generalArithExpr: term (( '+' | '-' )^  term)*
	//-> ^(GeneralArithExpr term (('+' | '-')  term)*)	
	;
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  
term	:object| factor ( ( '*' | '/'  )^ factor)* 
	//-> ^(Term factor ( ( '*' | '/' ) factor)*)
	;
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}

factor	:  
	VAR -> ^(Factor VAR)
	|NUM -> ^(Factor NUM)
	|DNUM -> ^(Factor DOUBLE)
	|'-'  VAR -> ^(Factor  '-' VAR)
	|'-'  INT -> ^(Factor  '-' INT)
	|'-'  DNUM  -> ^(Factor  '-' DOUBLE)
	|'(' generalArithExpr ')' -> ^(Factor  '(' generalArithExpr ')')
	| Fun '(' generalArithExpr ')' -> ^(Factor Fun '(' generalArithExpr ')')
	;
	
// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
Class:'class';
System	:'System';
New	:	'new';
Dot	:	'.';
Out	:	'out';
Println	:	'println';

Args	:	'args';
Static	:	'static';
Main	:	'main';
types	:	STRING|BOOLEAN|DOUBLE|INT;
AndOr	:	'&&'|'||';
Modifier:	'private'|'public';   
Fun	: 'sin' | 'cos'| 'tan' ;
INT	:	'int';
DOUBLE	:	'double';
VOID	:	'void';
BOOLEAN	:	'boolean';
STRING  :	'String';
VAR	:	('a'..'z'|'A'..'Z'|'$'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$')*;
NUM	:	('-')?('0'..'9')*;
DNUM	:	('-')?('0'..'9')* '.' ('0'..'9')*;
SEMICOLON:	';';
Strings	:	'"' (.)* '"';
RelationalOperators:   '=='|'!='|'>'|'<'|'>='|'<='|;
ML_COMMENT	:	'/*' ( options {greedy=false;} : .)* '*/'+{skip();};
SL_COMMENT	:	'//' (.)*'\n'+{skip();};
WhiteSpace:	(' '|'\n'|'\r'|'\t')+{skip();};



//options {output=AST;}
//
//tokens{
//StartgeneralArithExpr;
//GeneralArithExpr;
//Term;
//Factor;
//}
//@members {
//String s="";
//}
//// Arithmetic Expressions
//startgeneralArithExpr: (generalArithExpr+) 
//	-> ^(StartgeneralArithExpr generalArithExpr+) 
//	;
//// catch blocks go first
//  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
//  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
//  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
//    
//  // The finally clause is the last part a rule executes before returning.
//  finally { s = s + "Exit..."+"\n"; }
//  
//generalArithExpr: term (('+' | '-')^  term)*
//	//-> ^(GeneralArithExpr term (('+' | '-')  term)*)	
//	;
//// catch blocks go first
//  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
//  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
//  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
//  
//term	: factor ( ( '*' | '/' )^ factor)* 
//	//-> ^(Term factor ( ( '*' | '/' ) factor)*)
//	;
//// catch blocks go first
//  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
//  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
//  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
//
//factor	:  ID -> ^(Factor ID)
//	|INT -> ^(Factor INT)
//	|DOUBLE -> ^(Factor DOUBLE)
//	| '-'  ID -> ^(Factor  '-' ID)
//	| '-'  INT -> ^(Factor  '-' INT)
//	| '-'  DOUBLE  -> ^(Factor  '-' DOUBLE)
//	| '(' generalArithExpr ')' -> ^(Factor  '(' generalArithExpr ')')
//	| Fun '(' generalArithExpr ')' -> ^(Factor Fun '(' generalArithExpr ')')
//	;
//	
//// catch blocks go first
//  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
//  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
//  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
//    
//Fun	: 'sin' | 'cos'| 'tan' ;
//
//
//ID 	:	('a'..'z'|'A'..'Z'|'_')  ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*  ;
//INT	:	 ('0'..'9')+ ;
//DOUBLE	:	INT '.' INT;
//WS  :   ( ' '
//        | '\t'
//        | '\r'
//        | '\n'
//        ) {skip();}
//    ;// ignore whitespace
































//classDec:	Modifier 'class' VAR '{' (array|decl) main '}' {System.out.println("invoke "+$VAR.text);};
//aa	:	(array|decl);
//main	:	'public static void main ( String [] 'VAR')' '{' body2 '}';
//array	:	int_array|double_array;
//int_array	:	INT VAR '[]''=' ('new' INT '['NUM ']');
//double_array	:	DOUBLE VAR '[]''=' ('new' INT '['NUM ']');
//body2	:	;
//ifstmt2  :     condition (('||'|'&&') condition)* '?'   stmt  ':' stmt;

//Modifier:	'private'|'public';
//params	:	'('(((INT|DOUBLE|String) VAR) (',' (INT|DOUBLE|String) VAR)*)? ')';
//Class	:	'class';
//s	:	stmt;
//stmt    :   ( ifstmt | decl | whilestmt | forloop | assigment | ML_COMMENT | SL_COMMENT)*;
//decl    :   int_dec|double_dec|string_dec;
//whilestmt:'while' '(' condition (('||'|'&&') condition)* ')' '{' stmt '}';
//ifstmt  :    'if' '(' condition (('||'|'&&') condition)* ')' '{' stmt '}'('else' '{' stmt '}')?;
//forloop	:   'for' '(' decl condition (('||'|'&&') condition)* SEMICOLON assigment ')' '{' stmt '}';
//assigment:   VAR (change|'=' (DNUM|NUM|VAR) (Operation (DNUM|NUM|VAR))* SEMICOLON);
//change	:('++'|'--'|('+='|'-=')(NUM|DNUM));
//condition:   (DNUM|NUM|VAR) RelationalOperators (DNUM|NUM|VAR);
//int_dec	:	INT VAR ('=' (NUM|VAR) (Operation (NUM|VAR))* SEMICOLON)?;
//double_dec	:	DOUBLE VAR ('=' (DNUM|NUM|VAR|triangle) (Operation (DNUM|NUM|VAR|triangle))* SEMICOLON)?;
//string_dec	:	String VAR ('='  '"'VAR'"'SEMICOLON)?;
//triangle :   ('sin'|'cos'|'tan') '(' (NUM|VAR|triangle) ')';
//String	:	'String';
//INT	:	'int';
//DOUBLE	:	'double';
//VAR	:	('a'..'z'|'A'..'Z'|'$'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$')*;
//NUM	:	('-')?('0'..'9')*;
//DNUM	:	('-')?('0'..'9')* '.' ('0'..'9')*;
//SEMICOLON:	';';
//Operation:   '/'|'*'|'+'|'-';
//RelationalOperators:   '=='|'!='|'>'|'<'|'>='|'<=';
//ML_COMMENT	:	'/*' ( options {greedy=false;} : .)* '*/'+{skip();};
//SL_COMMENT	:	'//' (.)*'\n'+{skip();};
//WhiteSpace:	(' '|'\n'|'\r'|'\t')+{skip();};


//WhiteSpace	:	(' '|'\n'|'\r'|'\t')+ -> skip;
//s	:	m|CHAR|NUM|ID;//gomal Rule
//m	:	ID A ID COM;//Rule
//DOMAIN	:	'gmail'|'yahoo'|'hotmail';
//ID 	:	('a'..'z')*;//tokens k inaha Terminal
//maunf3sh altoken ykon feh Rule
//AND is space   OR |
//NUM 	:	('0'..'9')*;//lo inta m7ttsh ay arqam error
//CHAR 	:	('0'..'9'|'a'..'z')*;
//A	:	'@';
//COM	:	'.com';

//start   :   decliration|if|ifelse;
//if  :   'if' '(' condition ')' '{' decliration* '}';
//ifelse  :   'if' '(' condition ')' '{' decliration* '}' 'else' '{' decliration* '}';
//decliration	:	int|double|multiDecliration;
//int	:	INT VAR '=' (NUM|VAR) (Operation (NUM|VAR))* SEMICOLON;
//double	:	DOUBLE VAR '=' (double_number|NUM|VAR) (Operation (double_number|NUM|VAR))* SEMICOLON;
//multiDecliration    :   (INT|DOUBLE) VAR (',' VAR)* SEMICOLON;
//condition   :   (double_number|NUM|VAR) RelationalOperators (double_number|NUM|VAR);
//WhiteSpace	:	(' '|'\n'|'\r'|'\t')+{skip();};
//INT	:	'int';
//DOUBLE	:	'double';
//VAR	:	('a'..'z'|'A'..'Z')*;
//NUM	:	('0'..'9')*;
//double_number	:	NUM '.' NUM;
//SEMICOLON	:	';';
//Operation  :   '/'|'*'|'+'|'-';
//RelationalOperators  :   '=='|'!='|'>'|'<'|'>='|'<=';


//optopns{
//    language=java;
//}
//@member{
//String s;
//}


//expresions   :  (expresion ('\n')*)*;
//expresion   :   expresion '+' term|expresion '-' term|term;
//term    :   term '*' factor|term '/' factor|factor;
//factor  :   number|VAR|tiangle|'(' expresion ')';
//tiangle :   ('sin'|'cos'|'tan') '(' (number|VAR) ')';
//number  :   '-'? (NUM|double_number);
//double_number	:	NUM '.' NUM;
//VAR	:	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
//NUM	:	('0'..'9')*;
//SEMICOLON	:	';';
//WhiteSpace	:	(' '|'\n'|'\r'|'\t')+ -> skip;


//expresion   :   plusOrMinus;
//plusOrMinus   :   (multiOrDivied | factor | factor ('+'|'-'))*;
//tiangle :   ('sin'|'cos'|'tan') '(' (number|VAR|tiangle) ')';
//factor  :   number | VAR | tiangle |'(' (number|VAR|tiangle) ')';
//multiOrDivied :   factor ('/'|'*') factor;
//number  :   '-'? (NUM | NUM '.' NUM);
//VAR	:	('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
//NUM	:	('0'..'9')+;
//SEMICOLON	:	';';


//WhiteSpace	:	(' '|'\n'|'\r'|'\t')+ -> skip;

