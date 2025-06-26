package bob_contruye;

public class apartamento extends edificio{

	
	private int piso;
	
	public apartamento (int id,double costo, String direccion, int piso) {
		super (id, costo, direccion);
		this.piso = piso;
		
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	@Override
	public String toString() {
		return "Piso donde se encuentra el apartamento: " + piso + ", costo: " + getCosto() + ", ubicacion: " + getDireccion() ;
	}
	
}
