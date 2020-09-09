Pérez
float promedio(struct lista *entrada) {
	//Para recorrer la lista con un ciclo
	int ultimo = fin(entrada);
	//Para dividir la suma de los datos
	float ultimo_div = (float)ultimo;
	//Para realizar un ciclo For
	int i;
	//Para guardar la suma de los datos
	float suma = 0;
	//Para retornar el promedio
	float salida = 0;

	//Para recorrer la lista y sumar cada dato
	for (i = 0; i < ultimo; i++) {

		//Se suma cada dato
		suma += (float)recuperar(i, entrada);

	}

	//Se divide la suma con el numero total de datos
	salida = suma / ultimo_div;

	//Se retornara el promedio
	return salida;
}