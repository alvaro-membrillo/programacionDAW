Funcion encontrado <- contiene ( nums,num )
	definir encontrado Como Logico
	para i <- 0 hasta 19 Hacer
		si num = nums[i] Entonces
			encontrado=verdadero
		SiNo
			encontrado=falso
		FinSi
	FinPara
Fin Funcion

Funcion ocurrencia <- ocurrencias( nums,num )
	definir ocurrencia como entero
	para i <- 0 hasta 19 Hacer
		si nums[i] = num Entonces
			ocurrencia=ocurrencia+1
		FinSi
	FinPara
Fin Funcion



Algoritmo sin_titulo
	//Algoritmo que tenga dos funciones para trabajar con vectores (arrays)
	// contiene --> recibirá dos parametros, un array de enteros y un entero que buscar, devolverá verdaderos si el entero está en
	//              el vector y falso en caso contrario
	// ocurrencias --> recibirá dos parámetros, un array de enteros y un entero a buscar. Devolverá el número de ocurrencias de este
	//                 entero en el vector
	//El cuerpo del algoritmo llamara al menos dos veces a cada una de las funciones
	
	//Vamos a generar un array de enteros con valores aleatorios
	dimension nums[20]
	
	para i<-0 hasta 19 Hacer //Se va rellenando de valores aleatorios el array
		nums[i] <- aleatorio(0,500)
	FinPara
	
	definir opt Como entero
	Escribir "Escoge una opcion"
	definir encontrado como logico
	definir num Como Entero
	
	repetir
		Segun opt Hacer
			1:
				contiene(nums, 15);
			2:
				
			De Otro Modo:
				Escribir "Esa opción no existe"
		Fin Segun
	hasta que opt=1 o opt=2
	
	
FinAlgoritmo
