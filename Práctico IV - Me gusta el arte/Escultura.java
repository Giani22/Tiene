package me_gusta_el_flan;

public class Escultura extends obraArte{
	
	private String herramienta;
	
	public Escultura (String proposito, String autor,String tecnica, String herramienta) {
		super (proposito, autor, tecnica);
		this.herramienta=herramienta;
		
	}

	public String getHerramienta() {
		return herramienta;
	}

	public void setHerramienta(String herramienta) {
		this.herramienta = herramienta;
	}

	@Override
	public String toString() {
		return "La herramientas utilizadas son: " + herramienta + ", el proposito es:" + getProposito() + ", autor:"
				+ getAutor() + ", tecnica utilizada:" + getTecnica() ;
	}

}
