Algoritmo sin_titulo
	//Rellenar array de 20 elementos con numeros aleatorios entre 0 y 400 ambos incluidos. Después se muestra el array y se le
	// preguntará al usuario si quiere resaltar los múltiplos de 5 o los múltiplos de 7. Después se volverá a mostrar el array pero
	// con los números que se quieren resaltar entre corchetes
	Dimension nums[20]
	Definir num, i, opc Como Entero
	
	para i<-0 hasta 19 Hacer
		num <- ALEATORIO(0,400)
		nums[i]<-num
		escribir sin saltar nums[i]," "
	FinPara
	Escribir " "
	
	Repetir
		Escribir "Selecciona una opcion dentro del menú"
		Escribir "1- Resaltar los múltiplos de 5"
		Escribir "2- Resaltar los múltiplos de 7"
		
		leer opc
		Segun opc Hacer
			1:
				para i<-0 hasta 19 Hacer
					si nums[i]%5==0 Entonces
						escribir sin saltar "[",nums[i],"] "
					SiNo
						escribir sin saltar nums[i]," "
					FinSi
				FinPara 
			2:
				para i<-0 hasta 19 Hacer
					si nums[i]%7==0 Entonces
						escribir sin saltar "[",nums[i],"] "
					SiNo
						escribir sin saltar nums[i]," "
					FinSi
				FinPara
				
			De Otro Modo:
				Escribir "Esa opcion no existe"
		Fin Segun
	Hasta Que opc=1 o opc=2
	
	
FinAlgoritmo
