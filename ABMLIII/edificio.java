package bob_contruye;

public class edificio {

	private int Id;
	private double costo;
	private String direccion;
	
	public edificio (int id, double costo, String direccion) {
		this.Id=id;
		this.costo = costo;
		this.direccion = direccion;
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	}
