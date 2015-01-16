package diapositivas;

public class ArrayBidimensional {

	public static void main(String[] args) {
		double [][] TABLA = {{0,1,2},
							{3,4,5},
							{6,7,8},
							{9,10,11}};						
		double suma=0;
		double contador=0;
		for (int i = 0; i < TABLA.length; i++) {
			
		for (int j = 0; j < TABLA[i].length; j++) {
			System.out.print("Posicion "+i+","+j+" : " + TABLA[i][j]+"\t");
			suma+= TABLA[i][j];
			contador++;
		}
		System.out.println("");
	}
		double media=suma/contador;
		System.out.printf("\nMedia de los valores es = %.2f",media);
		//definimos una nueva matriz y los valores estan invertido
		//es decir el primero de este nuevo array es el ultimo
		//del array anterior
		double [][] NTABLA = new double [4][3];
			
	}

}
