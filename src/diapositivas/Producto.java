package diapositivas;

public class Producto {
	//atributos
	private int idProducto;
	private String nombreProducto;
	private double precioProducto;
	//constructor
	public Producto(int idProducto, String nombreProducto, double precioProducto) {
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
	}
	/**
	 * @return the idProducto
	 */
	public int getIdProducto() {
		return idProducto;
	}
	/**
	 * @return the nombreProducto
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}
	/**
	 * @return the precioProducto
	 */
	public double getPrecioProducto() {
		return precioProducto;
	}
	
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto="
				+ nombreProducto + ", precioProducto=" + precioProducto + "]";
	}
	
	
}

