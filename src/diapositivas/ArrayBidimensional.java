package diapositivas;

public class ArrayBidimensional {

	public static void main(String[] args) {
		double [][] TABLA = {{7,5,3},{3,4,7},{8,4,8},{3,4,8}};
		double suma=0;
		double contador=0;
		for (int i = 0; i < TABLA.length; i++) {
			System.out.println("");
		for (int j = 0; j < TABLA[0].length; j++) {
			System.out.print(TABLA[i][j]+"\t");
			suma+= TABLA[i][j];
			contador++;
		}
			
	}
		double media=suma/contador;
		System.out.printf("\nMedia de los valores es = %.2f",media);
		
		

	}

}
