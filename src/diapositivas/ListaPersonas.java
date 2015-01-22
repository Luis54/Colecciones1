package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {
		private List<Persona> listaPersonas;
		public ListaPersonas(){
			this.listaPersonas = new ArrayList<Persona>();	
		}
		public void addPersona(Persona p){
			listaPersonas.add(p);
		}

		public void eliminarPersona(Persona p){
			if (listaPersonas.contains(p))
			listaPersonas.remove(p);
		}
		public boolean existePersona(Persona p){
			return this.listaPersonas.contains(p);
		}
		public void modificarPersona(Persona p,String nuevonombre){
			if(listaPersonas.contains(p))
				p.setNombre(nuevonombre);
		}
		
		public String toString(){
			return listaPersonas.toString();
		}
}
