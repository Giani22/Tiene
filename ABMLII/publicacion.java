package ejercicio2;

public class publicacion {

	private int id;
	private String titulo;
	private String fecha; //fecha de publicacion
	private double precio;
	
	
	public publicacion (int id, String titulo, String fecha,  double precio) {
		super();
		this.id=id;
		this.titulo=titulo;
		this.fecha=fecha;
		this.precio=precio;
		
		
		
	}	
	
		
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	}
