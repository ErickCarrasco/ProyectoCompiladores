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
asignacion = ["->"]
espacios = [ \n\r\t]+
OPREL=[>,<,===,~=, >=, <=]
OPARITM=[+, -, *, /, %]
simbolosEsp=[-,_]
ID={letras}+{numeros}*

declaracionInt = (int){espacios}{ID}{espacios}{asignacion}{espacios}*{numeros}+ {espacios}* {puntocoma}
declaracionChar= (bool){espacios}{ID}{espacios}{asignacion}{espacios}*(true|false){espacios}*{puntocoma}

%%



<YYINITIAL>{
	{declaracionInt} 	{System.out.println("Encontro una declaracion Int");}
	{declaracionChar} 	{System.out.println("Encontro una declaracion Char");}
}