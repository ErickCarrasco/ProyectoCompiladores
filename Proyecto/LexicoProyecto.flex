%%

%unicode
%class Lexico
%int
%ignorecase
%line
%column
%standalone

letters = [a-zA-Z]|"_"
digit = [0-9]

//Integer
intType = {digit}+

//Boolean/Faker
faker = true|false

//ID
ID = {letters}({digit}|{letters})*

not = "not"
equals = "==="
//OPREL
op_rel = "~="|">"|"<"|">="|"<="|and|or|{not}
//OPARITMETHIC
op_arith = "+"|-|"*"|"/"|"%"

//Assignment
assignment = "->"

//Special Chars
spaces = [ \n\r\t]+
semicolon = ";"
lpar = "("
rpar = ")"
dot = "."
comma = ","
colon = ":"
left_square_bracket = "["
right_square_bracket = "]"

%%

<YYINITIAL>{
	"vector"			{System.out.println("vector");}
	"def"				{System.out.println("Define or def");}
	"loop"				{System.out.println("Loop");}
	"each"				{System.out.println("'each' of a loop");}
	"while"				{System.out.println("while case");}
	"switch"			{System.out.println("switch");}
	"case"				{System.out.println("case");}
	"break"				{System.out.println("break");}
	{intType}			{System.out.println("Integer");}
	{faker}				{System.out.println("Faker");}
	{equals}			{System.out.println("equals (===)");}
	{op_rel}			{System.out.println("OPREL");}
	{op_arith}			{System.out.println("OPARITHM");}
	{assignment}		{System.out.println("Assignment");}
	{ID}				{System.out.println("ID");}

}
