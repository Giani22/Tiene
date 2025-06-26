package bob_contruye;

public class casa extends edificio{
	
	private boolean patio = true;
	
	public casa (int id, double costo, String direccion, boolean patio) {
		super(id, costo, direccion);
		this.patio =patio;
	}

	public boolean getPatio() {
		return patio;
	}

	public void setPatio(boolean patio) {
		this.patio = patio;
	}

	@Override
	public String toString() {
		return "La casa tiene patio?: " + patio + ", costo: " + getCosto() + ", direccion:" + getDireccion() ;
	}

	
	}
	
	