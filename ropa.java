package supermercado;

public class ropa extends producto{
	
	String talla;
	
	public ropa (String nombre,int precio, String talla) {
		super (nombre, precio);
		this.talla = talla;
		
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Talla: " + talla + ", nombre: " + getNombre() + ", precio estimado" + getPrecio() ;
	}

	
		
}

