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
simbLinea=[|]
ID={letras}+({numeros}*|{simbolosEsp}*)*
Sent = {letras}*

Type = (int|char)//Tipado para vector

//Variables
var = {ID}|{numeros}|{letras}
varVector = ({corcheteOpen}{var}{corcheteClose})*

//LOOP
Loop = (loop){corcheteOpen}{espacios}*{Sent}{espacios}{corcheteClose}(each){parenthesisOpen}{numeros}{parenthesisClose}

//Declaracion de variables char, int, faker, y vectores
declaracionInt = (def){espacios}+(int){espacios}+{ID}{espacios}*{asignacion}{espacios}*{numeros}+ {espacios}* {puntocoma}|(def){espacios}+(int){espacios}+{ID}{espacios}*{puntocoma}
declaracionBool= (def){espacios}+(faker){espacios}+{ID}{espacios}*{asignacion}{espacios}*(true|false|0|1){espacios}*{puntocoma}|(def){espacios}+(faker){espacios}+{ID}{espacios}*{puntocoma}
declaracionSingleVector = (def){espacios}+(Vector){espacios}+{simbLinea}{Type}{simbLinea}{espacios}*{ID}{espacios}*{puntocoma}
declaracionSingleVectorSimple = (def){espacios}+(Vector){espacios}*{ID}{espacios}*{puntocoma} | (def){espacios}+(Vector){espacios}*{ID}{espacios}*{asignacion}{espacios}*{corcheteOpen} {varVector}* {corcheteClose}

//Expresion que puede llevarse dentro de ifs, fors, o whiles
Expresion = {declaracionInt}|{declaracionBool}
ExpresionNumeric = {ID}{OPARITM}{ID}
ExpresionIncrementoAVar={ID}{asignacion}{ID}{OPARITM} ({ID}|{numeros})

//Expresion o sentencia para whiles y los ifs

compare = ({ID}{espacios}*{OPREL}{espacios}*{ID})|({ID})|({ExpresionNumeric}{OPREL}{ID})
//IFS 
stateIF = (if){parenthesisOpen}{espacios}* {compare} {espacios}*{parenthesisClose} {corcheteOpen}{espacios}*{Expresion}*{espacios}*{corcheteClose}
stateELSIF = (elsif){parenthesisOpen}{espacios}* {compare} {espacios}*{parenthesisClose}  {corcheteOpen}{espacios}*{Expresion}*{espacios}*{corcheteClose}

%%



<YYINITIAL>{
	{declaracionInt} 	{System.out.println("Encontro una declaracion Int");}
	{declaracionBool} 	{System.out.println("Encontro una declaracion Char");}
	{declaracionSingleVector}	{System.out.println("Encontro un vector de una dimension");}
	{declaracionSingleVectorSimple}		{System.out.println("Encontro un vector sin tipado");}
	{stateIF}	{System.out.println("IF con OPREL");}
	{Loop}		{System.out.println("Loop encontrado");}
}