%%

%unicode
%class Lexico
%int
%line
%column
%standalone

numeros = [0-9]
letras = [a-zA-Z]
puntocoma = [;]
asignacion = (->)
espacios = [ \n\r\t]+
OPREL = (>|<|===|~=|>=|<=)
OPARITM=[+ - * / %]
simbolosEsp=[-_]
parenthesisOpen = [(]
parenthesisClose = [)]
ID={letras}+{numeros}*

declaracionInt = (int){espacios}{ID}{espacios}{asignacion}{espacios}*{numeros}+ {espacios}* {puntocoma}
declaracionBool= (faker){espacios}{ID}{espacios}{asignacion}{espacios}*(true|false){espacios}*{puntocoma}
stateIF = (if){parenthesisOpen}{espacios}* {ID} {OPREL} {ID} {espacios}*{parenthesisClose} 

%%



<YYINITIAL>{
	{declaracionInt} 	{System.out.println("Encontro una declaracion Int");}
	{declaracionBool} 	{System.out.println("Encontro una declaracion Char");}
	{stateIF}	{System.out.println("IF con OPREL");}
}