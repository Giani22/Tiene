package me_gusta_el_flan;


public class Pintura extends obraArte{
	
	private String elementos;
	
	public Pintura (String proposito, String autor,String tecnica, String elementos) {
		super (proposito, autor, tecnica);
		this.elementos = elementos;
		
	}

	public String getElementos() {
		return elementos;
	}

	public void setElementos(String elementos) {
		this.elementos = elementos;
	}

	@Override
	public String toString() {
		return "Elementos de la pintura: " + elementos + ", el proposito es: " + getProposito() + ", autor: " + getAutor()
				+ ", tecnica utilizada:" + getTecnica() ;
	}
}

	