%%

%unicode
%class Lexico
%int
%ignorecase
%line
%column
%standalone

//Contador errores lexicos

%{
	public static int erroresLexicos = 0;
%}

//initial data
letters = [a-zA-Z]|"_"
digit = [0-9]

//Integer
int = {digit}+

//Boolean/Faker
faker = true|false

//ID
ID = {letters}({digit}|{letters})*


equals = "==="
//OPREL
op_rel = "~="|">"|"<"|">="|"<="|and|or
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
left_Sbracket = "["
right_Sbracket = "]"
l_Cbracket = "{"
r_Cbracket = "}"

//Comment char
hashComment = "#"

%state COMMENT_PORTION

%%

<YYINITIAL>{
	"init"				{System.out.println("INIT");}
	"int"				{System.out.println("int reserved word");}
	"faker"				{System.out.println("faker reserved word");}
	"vector"			{System.out.println("vector reserved word");}
	"def"				{System.out.println("Define or def");}
	"if"				{System.out.println("If block");}
	"elsif"				{System.out.println("elsif");}
	"else"				{System.out.println("else");}
	"loop"				{System.out.println("Loop");}
	"each"				{System.out.println("'each' of a loop");}
	"while"				{System.out.println("while case");}
	"switch"			{System.out.println("switch");}
	"case"				{System.out.println("case");}
	"break"				{System.out.println("break");}
	"scan"				{System.out.println("scan");}
	"sout"				{System.out.println("sout");}
	"soutln"			{System.out.println("soutln");}
	"default"			{System.out.println("default");}
	{int}				{System.out.println("Integer");}
	{faker}				{System.out.println("Faker");}
	{equals}			{System.out.println("equals (===)");}
	{op_rel}			{System.out.println("OPREL");}
	{op_arith}			{System.out.println("OPARITHM");}
	{assignment}		{System.out.println("Assignment");}
	{ID}				{System.out.println("ID");}
	{semicolon}			{System.out.println("semicolon");}
	{lpar}				{System.out.println("left parentesis");}
	{rpar}				{System.out.println("right parentesis");}
	{left_Sbracket}		{System.out.println("left bracket");}
	{right_Sbracket}	{System.out.println("right bracket");}
	{l_Cbracket}		{System.out.println("left curvy bracket");}
	{r_Cbracket}		{System.out.println("right curvy bracket");}
	{hashComment}		{yybegin(COMMENT_PORTION);}
	{spaces}			{}
	.
						{
							System.out.println("Falla en lexico, char o variable no aceptada: " +yytext()+">. Linea: "+(yyline + 1)+ ", Columna: "+(yycolumn+1));
							erroresLexicos++;
						}

}


<COMMENT_PORTION>
{
	{hashComment}	{yybegin(YYINITIAL);}
	.				{}

}