package diapositivas;

import java.util.Scanner;

public class Inicial {

	public static void main(String[] args) {
	final int TAMANO = 5;
	double[] valores = new double [TAMANO];
	Scanner in = new Scanner (System.in);
	//inicializar los valores del array
	for (int i = 0; i < valores.length; i++) {
		System.out.println("introduce valor: "+i);
		valores[i] = in.nextDouble();
		
	}
	System.out.println("Mostrando los valores del array opcion 1");
	//mostrar los valores del array opcion 1
	for (int i = 0; i < valores.length; i++) {
		System.out.print(valores[i]+"\t");
		
	}
	//mostar los valores del array opcion 2
	System.out.println("\n");
	System.out.println("Mostrando los valores del array opcion 2");
	for (double d : valores) {
		System.out.print(d+"\t");
		
	}
	in.close();	
}

	}


