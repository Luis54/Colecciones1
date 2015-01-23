package diapositivas;

import java.util.ArrayList;

public class TestDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Double> temperatura = new ArrayList <Double>();
		//tamaño que tiene el arraylist sin añadir datos
		System.out.println("Tamaño de la lista es : "+temperatura.size());
		
		temperatura.add(5.5);
		temperatura.add(25.5);
		temperatura.add(50.9);
		temperatura.add(15.3);
		temperatura.add(15.1);
		temperatura.add(20.1);
		temperatura.add(5.0);
		
		
		//valores que contiene el ArrayList
		System.out.println("Los valores que contiene dicho ArrayList son "+temperatura);
		
		
		
		double[] array = new double[temperatura.size()];
		for (int i = 0; i < temperatura.size(); i++) {
			array[i] = temperatura.get(i);		
		}
		Datos datos = new Datos(array);
		System.out.printf("El valor medio de la temperatura es : "+datos.valorMedio());
		System.out.printf("\nLa Desviacion Tipica de la temperatura es : "+datos.desviacionTipica());
		System.out.printf("\nLos datos que se encuentra por debajo de la media son :"+datos.numeropordebajodelamedia());
		System.out.printf("\nEL valor maximo de la temperatura es : "+datos.valorMaximo());
		System.out.printf("\nEL valor minimo de la temperatura es : "+datos.valorMinimo());
		

	
		
		
		
		
	}

}
