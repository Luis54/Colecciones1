package diapositivas;

public class TesrPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaPersonas lista = new ListaPersonas();
		Persona p1 = new Persona(15,"Luis");
		Persona p2 = new Persona(25,"Nerea");
		Persona p3 = new Persona(35,"Antonio");
		Persona p4 = new Persona(45,"Juan");
		Persona p5 = new Persona(55,"Juanlu");
		lista.addPersona(p1);
		lista.addPersona(p2);
		lista.addPersona(p3);
		lista.addPersona(p4);
		lista.addPersona(p5);
		System.out.println("Despues de meter datos");
		System.out.println(lista);
		System.out.println("¿Existe p1 : "+lista.existePersona(p1));
		lista.addPersona(new Persona(52, "Pepe"));
		System.out.println(lista);
		lista.eliminarPersona(p3);
		System.out.println(lista);
		Persona p6 = new Persona(55,"Juanlu");
		System.out.println("¿Existe p6 : "+lista.existePersona(p6));
		
		

	}

}
