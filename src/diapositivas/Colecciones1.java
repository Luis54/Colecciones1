package diapositivas;

import java.util.Arrays;


public class Colecciones1 {
	private int[] Numero;

	public Colecciones1() {
		Numero = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
	}

	public int[] getNumero() {
		return Numero;
	}

	public void setNumero(int[] numero) {
		Numero = numero;
	}

	@Override
	public String toString() {
		return "Colecciones1 [Numero=" + Arrays.toString(Numero) + "]";
	}

	
}

