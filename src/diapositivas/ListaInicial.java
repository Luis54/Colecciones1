package diapositivas;

import java.util.ArrayList;

public class ListaInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos una lista vacio
		ArrayList list = new ArrayList ();
		//miramos el tamaño de la lista
		System.out.println("Tamaño de la lista es : "+list.size());
		//añadimos objetos a la lista
		list.add("madrid");
		list.add("jaen");
		list.add("granada");
		list.add("sevilla");
		list.add("cordoba");
		//miramos los objetos de la lista
		System.out.println("La lista contiene : "+list.toString());
		//miramos si esta el objeto en la lista
		System.out.println("¿Esta madrid? " +list.contains("jaen"));
		//miramos si el tamoño de la lista a cambiado
		System.out.println("Tamaño de la lista es : "+list.size());
		//añadimos otra ciudad a la posicion 3
		list.add(3,"Almeria");
		//miramos la posicion del obejto en la lista
		System.out.println("Posicion de Almeria en la lista : "+list.indexOf("Almeria"));
		//volvemos a mirar el tamaño de la lista 
		System.out.println("Tamado de la lista es : "+list.size());
		//borramos un objeto de la lista
		list.remove("sevilla");
		System.out.println("La Lista contiene : "+list.toString());
		//imprimimos la lista sin necesidad del toString
		System.out.println(list);
		//borramos la lista
		list.clear();
		//mostramos la lista vacia
		System.out.println("Lista vacia: " +list);
	}

}
