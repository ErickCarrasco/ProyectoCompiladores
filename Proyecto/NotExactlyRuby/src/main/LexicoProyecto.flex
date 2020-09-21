package main;
import java_cup.runtime.*;
import java.io.Reader;

%%

%{
	public static int erroresLexicos = 0;
        

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
%state COMMENT_LINE

%%

<YYINITIAL>{
	//reserved Words
	"init"				{ return new Symbol(sym.INIT, yycolumn, yyline, yytext());}
	"int"				{ return new Symbol(sym.INT, yycolumn, yyline, yytext());}
	"faker"				{ return new Symbol(sym.FAKER, yycolumn, yyline, yytext());}
	"char"				{ return new Symbol(sym.CHAR, yycolumn, yyline, yytext());}
	"vector"			{ return new Symbol(sym.VECTOR, yycolumn, yyline, yytext());}
	"def"				{ return new Symbol(sym.DEF, yycolumn, yyline, yytext());}
	"if"				{ return new Symbol(sym.IF, yycolumn, yyline, yytext());}
	"elsif"				{ return new Symbol(sym.ELSIF, yycolumn, yyline, yytext());}
	"else"				{ return new Symbol(sym.ELSE, yycolumn, yyline, yytext());}
	"loop"				{ return new Symbol(sym.LOOP, yycolumn, yyline, yytext());}
	"each"				{ return new Symbol(sym.EACH, yycolumn, yyline, yytext());}
	"while"				{ return new Symbol(sym.WHILE, yycolumn, yyline, yytext());}
	"switch"			{ return new Symbol(sym.SWITCH, yycolumn, yyline, yytext());}
	"case"				{ return new Symbol(sym.CASE, yycolumn, yyline, yytext());}
	"break"				{ return new Symbol(sym.BREAK, yycolumn, yyline, yytext());}
	"scan"				{ return new Symbol(sym.SCAN, yycolumn, yyline, yytext());}
	"sout"				{ return new Symbol(sym.SOUT, yycolumn, yyline, yytext());}
	"soutln"			{ return new Symbol(sym.SOUTLN, yycolumn, yyline, yytext());}
	"func"				{ return new Symbol(sym.FUNC, yycolumn, yyline, yytext());}
	"payback"			{return new Symbol(sym.PAYBACK, yycolumn, yyline, yytext());}
	"nothing"			{ return new Symbol(sym.NOTHING, yycolumn, yyline, yytext());}
	"default"			{ return new Symbol(sym.DEFAULT, yycolumn, yyline, yytext());}

	//vals
    {not}				{ return new Symbol(sym.NOT, yycolumn, yyline, yytext());}
	{int}				{ return new Symbol(sym.INTEGER, yycolumn, yyline, yytext());}
	{letters}			{ return new Symbol(sym.LETTERS, yycolumn, yyline, yytext());}
	{bool}				{ return new Symbol(sym.BOOL, yycolumn, yyline, yytext());}
	//{equals}			{return new Symbol(sym.EQUA, yycolumn, yyline, yytext());}
	{op_rel}			{ return new Symbol(sym.OPREL, yycolumn, yyline, yytext());}
	//{op_arith}			{return new Symbol(sym.OPARTHM, yycolumn, yyline, yytext());}
	
	{op_suma}			{ return new Symbol(sym.OPSUMA, yycolumn, yyline, yytext());}
	{op_mult}			{ return new Symbol(sym.OPMULT, yycolumn, yyline, yytext());}
	{op_res}			{ return new Symbol(sym.OPRES, yycolumn, yyline, yytext());}
	{assignment}                    { return new Symbol(sym.ASSIGNMENT, yycolumn, yyline, yytext());}
	{ID}				{ return new Symbol(sym.ID, yycolumn, yyline, yytext());}
	{colon}				{ return new Symbol(sym.COLON, yycolumn, yyline, yytext());}
	{semicolon}			{ return new Symbol(sym.SEMICOLON, yycolumn, yyline, yytext());}
	{lpar}				{ return new Symbol(sym.LPAR, yycolumn, yyline, yytext());}
	{rpar}				{ return new Symbol(sym.RPAR, yycolumn, yyline, yytext());}
	{left_Sbracket}                 { return new Symbol(sym.LSBRACKET, yycolumn, yyline, yytext());}
	{right_Sbracket}                { return new Symbol(sym.RSBRACKET, yycolumn, yyline, yytext());}
	{l_Cbracket}                    { return new Symbol(sym.LCBRACKET, yycolumn, yyline, yytext());}
	{r_Cbracket}                    { return new Symbol(sym.RCBRACKET, yycolumn, yyline, yytext());}
	{comma}				{ return new Symbol(sym.COMMA, yycolumn, yyline, yytext());}
	{pipe}				{ return new Symbol(sym.PIPE, yycolumn, yyline, yytext());}
	{hashComment}		{yybegin(COMMENT_PORTION);}
	"//"				{yybegin(COMMENT_LINE);}
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

<COMMENT_LINE>
{
	"\n"	{yybegin(YYINITIAL);}
	.		{}
}