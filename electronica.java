package supermercado;

public class electronica extends producto {
	
	String modelo;
	
	public electronica (String nombre,int precio, String modelo){
		super (nombre, precio);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Modelo" + modelo + ", nombre: " + getNombre() + ", precio estimado: " + getPrecio() ;
	}
		
		
	}
	

