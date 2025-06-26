package ejercicio2;

public class revista extends publicacion {

	private String d1;
	
	public revista (int id, String titulo, String fecha, double precio, String d1){
		super(id, titulo, fecha, precio);
		this.d1=d1;
		
		
	}

	public String getD1() {
		return d1;
	}

	public void setD1(String d1) {
		this.d1 = d1;
	}

	@Override
	public String toString() {
		return "Editorial: " + d1 + ", Fecha:" + getFecha() + ", Titulo:" + getTitulo() + ", Precio:"
				+ getPrecio() + ", ID: " + getId();
	}}
	
	
		
		
	
	

