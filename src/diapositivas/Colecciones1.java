package diapositivas;

import java.util.Arrays;


public class Colecciones1 {
	private int[] Numero;

	public Colecciones1() {
		this.Numero = new int[12];
	}


	public int[] getNumero() {
		return Numero;
	}



	public void setNumeroPosicion(int posicion,int valor) {
		this.Numero[posicion]=valor;
	}



	@Override
	public String toString() {
		return "Colecciones1 [Numero=" + Arrays.toString(Numero) + "]";
	}

	
}

