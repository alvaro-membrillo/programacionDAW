Algoritmo sin_titulo
	//Un programa que cambie un dígito dentro de un número dando la posicion y el valor nuevo, las posiciones se cuentan de izquierda
	// a derecha empezando por el 1
	definir posicion, longNum, newCifra Como Entero
	//definir num Como Caracter
	Dimension num[posicion]
	
	Escribir "Escribe un numero entero positivo"
	leer num[posicion]

	longNum <- longitud(num[posicion])
	
	Escribir sin saltar "Inserta la posicion que quieres cambiar "
	leer posicion
	
	Escribir sin saltar "Inserta la nueva cifra"
	leer newCifra;
	
	SUBCADENA(num, posicion, posicion)
	num[posicion] = newCifra
	
FinAlgoritmo
