package diapositivas;

import java.util.Arrays;

public class TestColecciones1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colecciones1 valores = new Colecciones1();
		System.out.println("Estos son los valores que contiene el array");
		System.out.println(valores);
		//Asigna el valor 5 al ultimo elemento
	//	valores.Numero[numero.length-1]=5;
		valores.setNumeroPosicion(valores.getNumero().length-1,5);
		System.out.println(valores);
		//Asigna el resto de valores con un bucle que el primer elemento sea 3 y los
		//restantes el doble del anterior
		int valorInicial = 3;
		for (int i = 0; i < valores.getNumero().length-1; i++) {
			valores.setNumeroPosicion(i,valorInicial);
			valorInicial *=2;
		}
		System.out.println(valores);
		//Mediante un bucle calcula la suma de todos los elementos del array
		int suma = 0;
		for (int i = 0; i < valores.getNumero().length; i++) {
			suma += valores.getNumero()[i];
			
		}
		System.out.printf("La suma de los valores es %d%n",suma);
		//Cambia el valor del array y divide por 3 todos los ultimo cinco valores
		if(valores.getNumero().length >=5){
		for (int i = valores.getNumero().length-5; i < valores.getNumero().length; i++){
			valores.setNumeroPosicion(i, valores.getNumero()[i]/3);
	}
																
		}
		System.out.println(valores);
		//Calcula ahora el valor mas pequeño almacenado en el array
		Arrays.sort(valores.getNumero());
		System.out.println("Elemeteo mas pequeño es " +valores.getNumero()[0]);
		//metodo casero
		int valorMenor = valores.getNumero()[0];
		for (int i = 1; i < valores.getNumero().length; i++) {
			if(valores.getNumero()[i] <valorMenor)
				valorMenor = valores.getNumero()[i];
			
		}
		System.out.println("Elemeteo mas pequeño es " +valorMenor);
		//Muestra todos los valores en tres filas de cuatro columnas, con una sepa-
		//racion de cinco espacios
		for (int i = 0; i < valores.getNumero().length; i++) {
			System.out.printf("%5d",valores.getNumero()[i]);
			if((i+1)%4 == 0)
			System.out.println();
			
			
		}
	}
}


