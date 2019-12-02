Algoritmo sin_titulo
	//Dibuja un reloj de arena comporbando que el numero de altura que introduce el usuario es mayor que 3 y es impar
	definir altura, anchura Como Entero
	
	Repetir
		escribir sin saltar "Introduce una altura para el reloj de arena (debe ser un nº impar y mayor que 3)"
		leer altura
	Hasta Que altura%2<>0 y altura > 3
	
	anchura=altura
	
	para i=1 hasta altura Hacer
		para j=1 hasta anchura Hacer
			Escribir sin saltar "*"
		FinPara
		anchura=anchura-1
		Escribir " "		
	FinPara
	
	para i=1 hasta altura Hacer
		para j=1 hasta anchura Hacer
			Escribir sin saltar "*"
		FinPara
		anchura=anchura-1
		Escribir " "		
	FinPara
	
FinAlgoritmo
