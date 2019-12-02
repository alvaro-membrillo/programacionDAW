Algoritmo sin_titulo
	//calcula el sueldo semanal de un trabajador. Su sueldo para las primeras 40 horas es de 10euros, a partir de la 41 incluida e trabajador cobra 15
	//Euros la hora
	definir horas, sueldo, sueldoFinal Como Entero
	Escribir sin saltar "Introduce el número de horas trabajadas durante la semana "
	leer horas
	
	sueldoFinal=horas*10
	si horas>=41 Entonces
		sueldo=horas*10
		horas=horas-40
		sueldoFinal=sueldo+(horas*15)
	FinSi
	Escribir "El sueldo que le corresponde es de ",sueldoFinal," Euros"
	
FinAlgoritmo
