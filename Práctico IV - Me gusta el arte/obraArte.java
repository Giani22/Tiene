package me_gusta_el_flan;

public class obraArte {
	
	private String proposito;
	private String autor;
	private String tecnica;
	
	public obraArte(String proposito, String autor,String tecnica ) {
		this.autor=autor;
		this.proposito=proposito;
		this.tecnica=tecnica;
		
	}

	public String getProposito() {
		return proposito;
	}

	public void setProposito(String proposito) {
		this.proposito = proposito;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	

}
