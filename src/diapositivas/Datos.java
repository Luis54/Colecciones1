package diapositivas;

import java.util.Arrays;

public class Datos {
	private double [] array;

	 
	public Datos(double[] array) {
		this.array = array;
	}
	//El valor medio de dichos datos.
	//public double valorMedio(){
		//int suma= 0;
		//for (int i = 0; i < array.length-1; i++) {
			//suma+=valorMedio()[i];
		//}	System.out.println(suma);
	//}
	//La desviacion tipica
	public double[] desviacionTipica(){
		return array;
	}
	//Numero de datos que se encuentran por debajo de la media
	public double[] numeropordebajodelamedia(){
		return array;
	}
	//El valor minimo.
	public double[] valorMinimo(){
		return array;
	}
	//El valor minimo.
	public double[] valorMaximo(){
		return array;
	}
	@Override
	public String toString() {
		return "Datos [array=" + Arrays.toString(array) + "]";
	}
	
	
}