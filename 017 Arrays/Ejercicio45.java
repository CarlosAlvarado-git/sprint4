public static int banana(int[] a) { 
    int	grape =	0; //incializa el vector
    int	i =	0; //Ubica la posición del elemento en el vector. 
    while (i < a.length) { //La condición hace que el ciclo se rompa con la última ejecución del i++ (línea 6) porque se pasa del máximo. El conteo máximo es la cantidad de elementos de a (a.leght)   
        grape = grape + a[i];
    i++; //i++ nos da la ubicación del siguiente elemento en el vector que se va a sumar.
    } //Este while cumple la función de sumar todos los puntos uno por uno
    return	grape;
}
//Suma todos lo números enteros que se encuentran en vector a y los guarda en la variable acumulativa Grape 
//Al finalizar la suma de todos lo números retorna el resultado. 

public static int apple(int[] a, int p)	{ //Resive como parámetro un vector a de enteros y un entrero p. 
    int	i =	0; //i nos dice la ubicación del elemento del vector que tenemos que comparar
    int	pear =	0; //Guarda el conteo de las veces que se encuentra el número p en el vector. 
    while (i < a.length) { //a.leght retorna el tamaño o el número de elementos del vector a. Y se usa como condición para frenar al vector. 
        if	(a[i]	==	p){ 
            pear++;
            i++; //Cambia la posición. 
        } //El ciclo aumenta el contador en uno cada vez que se encuentra con un número igual a p dentro del vector a. 
    }
    return	pear;
}
//Retorna la cantidad de números p que se encuentran en el vector a. 

public static int grapefruit(int[] a, int p) { //Resive como parámetro un vector a de enteros y un entrero p. 
    for	(int i = 0; i<a.length;	i++) { //i inicializa la posición en 0,  i < a.leght le pone un alto al for para que no siga recorriendo el vector  e i++ hace el cambio de posición en el vector. 
        if (a[i] ==	p) 
        return i; //retorna las posiciones en las que los elementos de a, son iguales a p
    }
return	-1;	//indica que el vector ya se terminó de recorrer. 
}
//Este método retorna las dirrecciones donde los elementos de a son iguales a p. 