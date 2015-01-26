package diapositivas;

import java.util.Scanner;

public class TestTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tienda tienda = new Tienda();
		tienda.addProductos(new Producto(0,"CD",3));
		//otra forma de hacerlo
		Producto p1 = new Producto(2, "DVD",6);
		tienda.addProductos(p1);
		tienda.addProductos(new Producto(3,"Lector CD",3));
		Producto p2 = new Producto(4, "Lecto Dvd",6);
		tienda.addProductos(p2);
		System.out.println(tienda);
		System.out.println("Prodcuto mas barato" +tienda.productoMasBarato());
		System.out.println("Prodcuto mas Caro " +tienda.productoMasCaro());
		Scanner in = new Scanner (System.in);
		while(true){
			String nombreProducto = in.nextLine();
			if(nombreProducto.equals(""))
				break;
			double precioProducto = in.nextDouble();
			tienda.addProductos(new Producto(5, nombreProducto, precioProducto));
		}
		System.out.println(tienda);
	}

}
