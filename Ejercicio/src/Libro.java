
public class Libro {

	/*Libro:
 Nombre del libro
 Autor
 Editorial
 Año de publicación
 Cantidad de ejemplares
 Costo*/
	
	private String nombre,año;
	private int cantidad,costo;
	private Autor autor;
	//private Editorial editorial;
	
	
	
	
	public Libro(String nombre, String año, int cantidad, int costo, Autor autor) {
		super();
		this.nombre = nombre;
		this.año = año;
		this.cantidad = cantidad;
		this.costo = costo;
		this.autor = autor;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", año=" + año + ", cantidad=" + cantidad + ", costo=" + costo + ", autor="
				+ autor + "]";
	}
	
}
