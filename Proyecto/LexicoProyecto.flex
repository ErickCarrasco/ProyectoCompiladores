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
corcheteOpen = [{]
corcheteClose = [}]
ID={letras}+({numeros}*|{simbolosEsp}*)*
Sent = {letras}*


Loop = (for){corcheteOpen}{espacios}*{Sent}{espacios}{corcheteClose}(each){parenthesisOpen}{numeros}{parenthesisClose}
declaracionInt = (def){espacios}(int){espacios}{ID}{espacios}{asignacion}{espacios}*{numeros}+ {espacios}* {puntocoma}
declaracionBool= (def){espacios}(faker){espacios}{ID}{espacios}{asignacion}{espacios}*(true|false){espacios}*{puntocoma}
stateIF = (if){parenthesisOpen}{espacios}* {ID} {OPREL} {ID} {espacios}*{parenthesisClose} 

%%



<YYINITIAL>{
	{declaracionInt} 	{System.out.println("Encontro una declaracion Int");}
	{declaracionBool} 	{System.out.println("Encontro una declaracion Char");}
	{stateIF}	{System.out.println("IF con OPREL");}
	{Loop}		{System.out.println("Loop encontrado");}
}