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
	valores[0]=15;
	valores[valores.length-1]=15;
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
	//calcular valor medio
	double suma=0;
	for (double d : valores) {
		suma+=d;
		
	}
	double media = suma/TAMANO;
	System.out.printf("%nEl valor medio es %.2f\n",media);
	
	//numeros de elemento que esta por debajo de la media
	int contador=0;
	for (int i = 0; i < valores.length; i++) {
		if (valores[i] <media)
			contador++;
		
	}
	System.out.println("Numero de valores por debajo de la media: "+contador);
	in.close();	
}
	
	
	}


