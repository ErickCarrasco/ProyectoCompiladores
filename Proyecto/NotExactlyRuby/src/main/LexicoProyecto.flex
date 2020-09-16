package main;
import java_cup.runtime.*;
import java.io.Reader;

%%

%{
	public static int erroresLexicos = 0;
        public void printer(String texto){
            System.out.println(": "+texto);
        }

%}


%unicode
%class Lexico
%public 
%int
%ignorecase
%line
%column
%standalone
%cup
%char
%eofval{
System.out.println("FIN DEL ARCHIVO");
System.exit(0);
%eofval}

//Contador errores lexicos



//initial data
letters = [a-zA-Z]|"_"
digit = [0-9]

//Integer
int = {digit}+

//Boolean/Faker
bool = true|false

//ID
ID = {letters}({digit}|{letters})*

not = "~"
and = and
or = or
equals = "==="
//OPREL
op_rel = "~="|">"|"<"|">="|"<="|{and}|{or}|{not}|{equals}
//OPARITMETHIC
//op_arith = "+"|-|"*"|"/"|"%"
op_suma = "+"|-
op_mult = "*"|"/"
op_res = "%"

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
pipe = "|"
//special_characters = "^"|@|"$"|#|&|"%"|"'"|"?"|"!"


//Comment char
hashComment = "#"

%state COMMENT_PORTION

%%

<YYINITIAL>{
	//reserved Words
	"init"				{printer("init"); return new Symbol(sym.INIT, yycolumn, yyline, yytext());}
	"int"				{printer("int"); return new Symbol(sym.INT, yycolumn, yyline, yytext());}
	"faker"				{printer("faker"); return new Symbol(sym.FAKER, yycolumn, yyline, yytext());}
	"char"				{printer("char"); return new Symbol(sym.CHAR, yycolumn, yyline, yytext());}
	"vector"			{printer("vector"); return new Symbol(sym.VECTOR, yycolumn, yyline, yytext());}
	"def"				{printer("def"); return new Symbol(sym.DEF, yycolumn, yyline, yytext());}
	"if"				{printer("if"); return new Symbol(sym.IF, yycolumn, yyline, yytext());}
	"elsif"				{printer("elsif"); return new Symbol(sym.ELSIF, yycolumn, yyline, yytext());}
	"else"				{printer("else"); return new Symbol(sym.ELSE, yycolumn, yyline, yytext());}
	"loop"				{printer("loop"); return new Symbol(sym.LOOP, yycolumn, yyline, yytext());}
	"each"				{printer("each"); return new Symbol(sym.EACH, yycolumn, yyline, yytext());}
	"while"				{printer("while"); return new Symbol(sym.WHILE, yycolumn, yyline, yytext());}
	"switch"			{printer("swicth"); return new Symbol(sym.SWITCH, yycolumn, yyline, yytext());}
	"case"				{printer("case"); return new Symbol(sym.CASE, yycolumn, yyline, yytext());}
	"break"				{printer("break"); return new Symbol(sym.BREAK, yycolumn, yyline, yytext());}
	"scan"				{printer("scan"); return new Symbol(sym.SCAN, yycolumn, yyline, yytext());}
	"sout"				{printer("sout"); return new Symbol(sym.SOUT, yycolumn, yyline, yytext());}
	"soutln"			{printer("soutln"); return new Symbol(sym.SOUTLN, yycolumn, yyline, yytext());}
	"func"				{printer("func"); return new Symbol(sym.FUNC, yycolumn, yyline, yytext());}
	"payback"			{printer("payback");return new Symbol(sym.PAYBACK, yycolumn, yyline, yytext());}
	"nothing"			{printer("nothing"); return new Symbol(sym.NOTHING, yycolumn, yyline, yytext());}
	"default"			{printer("default"); return new Symbol(sym.DEFAULT, yycolumn, yyline, yytext());}

	//vals
    {not}				{printer("~"); return new Symbol(sym.NOT, yycolumn, yyline, yytext());}
	{int}				{printer("int"); return new Symbol(sym.INTEGER, yycolumn, yyline, yytext());}
	{letters}			{printer("letters"); return new Symbol(sym.LETTERS, yycolumn, yyline, yytext());}
	{bool}				{printer("bool"); return new Symbol(sym.BOOL, yycolumn, yyline, yytext());}
	//{equals}			{return new Symbol(sym.EQUA, yycolumn, yyline, yytext());}
	{op_rel}			{printer("op_rel"); return new Symbol(sym.OPREL, yycolumn, yyline, yytext());}
	//{op_arith}			{return new Symbol(sym.OPARTHM, yycolumn, yyline, yytext());}
	
	{op_suma}			{printer("op_suma"); return new Symbol(sym.OPSUMA, yycolumn, yyline, yytext());}
	{op_mult}			{printer("op_mult"); return new Symbol(sym.OPMULT, yycolumn, yyline, yytext());}
	{op_res}			{printer("residuo"); return new Symbol(sym.OPRES, yycolumn, yyline, yytext());}
	{assignment}                    {printer("->"); return new Symbol(sym.ASSIGNMENT, yycolumn, yyline, yytext());}
	{ID}				{printer("ID"); return new Symbol(sym.ID, yycolumn, yyline, yytext());}
	{colon}				{printer(":"); return new Symbol(sym.COLON, yycolumn, yyline, yytext());}
	{semicolon}			{printer(";"); return new Symbol(sym.SEMICOLON, yycolumn, yyline, yytext());}
	{lpar}				{printer("("); return new Symbol(sym.LPAR, yycolumn, yyline, yytext());}
	{rpar}				{printer(")"); return new Symbol(sym.RPAR, yycolumn, yyline, yytext());}
	{left_Sbracket}                 {printer("left_Sbrckt"); return new Symbol(sym.LSBRACKET, yycolumn, yyline, yytext());}
	{right_Sbracket}                {printer("right_Sbrckt"); return new Symbol(sym.RSBRACKET, yycolumn, yyline, yytext());}
	{l_Cbracket}                    {printer("l_Cbrckt"); return new Symbol(sym.LCBRACKET, yycolumn, yyline, yytext());}
	{r_Cbracket}                    {printer("r_Cbrckt"); return new Symbol(sym.RCBRACKET, yycolumn, yyline, yytext());}
	{comma}				{printer("comma"); return new Symbol(sym.COMMA, yycolumn, yyline, yytext());}
	{pipe}				{printer("|"); return new Symbol(sym.PIPE, yycolumn, yyline, yytext());}
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