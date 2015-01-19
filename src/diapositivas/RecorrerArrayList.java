package diapositivas;


import java.util.ArrayList;
import java.util.List;

public class RecorrerArrayList {
	public static void main(String[] args){
		//creamos lista de Interger vacia
		ArrayList <Integer> list = new ArrayList <Integer>();
		int[] arrayEnteros={1,2,3,4,5,6,7,8,9};
		//recorro el array y lo añado a la lista
		for (int i = 0; i < arrayEnteros.length; i++) {
			list.add(arrayEnteros[+i]);
		}
		System.out.println(list);
		Integer numero = new Integer(10);
		list.add(0,numero); //añado el numero 10 a la poscion cero
		System.out.println(list);
		Integer numero2 = new Integer(100);
		list.set(0,numero2);//set machaca el 10 y introduce el 0
		System.out.println(list);
		//vamos a descubrir cuantos elementos son pares
		int contadorPares=0;
		for (int i = 0; i < list.size(); i++) {
			if((list.get(i) %2==0))
				contadorPares++;
			
			
		}
		System.out.println("Los numero para son : "+contadorPares);
		//vamos a encontrar numero impares y añadirlos a una nueva lista
		List <Integer> listaimpares= new ArrayList<Integer>();
		for (Integer integer : list) {
			if((integer %2) != 0)
				listaimpares.add(integer);
			
			
		}
		System.out.println("Lista impares "+listaimpares);
		
	}

}
