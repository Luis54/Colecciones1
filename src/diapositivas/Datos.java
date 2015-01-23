package diapositivas;

import java.util.Arrays;

public class Datos {
	private double [] array;

	 
	public Datos(double[] array) {
		this.array = array;
	}
	//El valor medio de dichos datos.
	public double valorMedio(){
		double suma= 0;
		for (int i = 0; i < array.length; i++) {
			suma+=array[i];
		}	
		return suma/this.array.length;
	}
	//La desviacion tipica
	public double desviacionTipica(){
		double sumaArray = 0;
		for (int i = 0; i < array.length; i++) {
			sumaArray+=Math.sqrt(Math.pow(array[i]-this.valorMedio(),2));	
		}
		return Math.sqrt(sumaArray/this.array.length);
	}
	//Numero de datos que se encuentran por debajo de la media
	public double numeropordebajodelamedia(){
		double contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < this.valorMedio()) {
			contador++;	
		}
	}
		return contador;
}
	//El valor minimo.
	public double valorMinimo(){
		Arrays.sort(array);
		return this.array[0];
	}
	//El valor maximo.
	public double valorMaximo(){
		Arrays.sort(array);
		return this.array[array.length-1];
	}	
}