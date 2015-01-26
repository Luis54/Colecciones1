package diapositivas;

import java.util.ArrayList;
import java.util.List;



public class Tienda {
	//atributos es una lista de Producto
	private List <Producto> listaTienda;
	//Constructor 
	public Tienda() {
		this.listaTienda = new ArrayList<Producto>();
	}
	public List<Producto> getListaTienda() {
		return listaTienda;
	}
	//añadimos productos a nuestra lista
	public void addProductos(Producto p){
		this.listaTienda.add(p);
		
	}
	public void eliminarProducto(Producto p){
		//hacemos programcion segura
		if(this.listaTienda.contains(p))
		this.listaTienda.remove(p);
	}
	public Producto productoMasCaro(){
		//double caro = listaTienda.get(0).getPrecioProducto();
		//como interesa empezar por un producto barato y no puede ser cero
		double caro = 0;
		Producto productoMasCaro= null;
		//otra opcion a igual que antes,es que empiece en
		//el primer producto
		//Producto productoMasCaro= listaTienda.get(0);
		for (Producto producto : listaTienda) {
			if(producto.getPrecioProducto() > caro){
				caro = producto.getPrecioProducto();
				productoMasCaro = producto;
			}
		}
		//recorremos el buvle de forma clasica
		/*for (int i = 1; i < listaTienda.size(); i++) {
			if (listaTienda.get(i).getPrecioProducto() > caro){
				caro = listaTienda.get(i).getPrecioProducto();
				productoMasCaro = listaTienda.get(i);
			}
			
		}*/
		return productoMasCaro;
		
	}
	public Producto productoMasBarato(){
		double barato = listaTienda.get(0).getPrecioProducto();
		//Producto productoMasBarato=null; no es viable porque ese prodcuto tendria
		//como atributo double precioproducto su valor por defeto que es 0
		Producto productoMasBarato =listaTienda.get(0);
		for (Producto producto : listaTienda) {
			if (producto.getPrecioProducto() < barato) {
				barato = producto.getPrecioProducto();
				productoMasBarato = producto;
				
			}
		}
		return productoMasBarato;
	}
	@Override
	public String toString() {
		return "Tienda [" + listaTienda + "]";
	}
	
}
