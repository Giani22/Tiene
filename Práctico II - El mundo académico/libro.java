package ejercicio2;

public class libro extends publicacion{

	private int paginas;
	
	public libro (int id, String fecha,String titulo,  double precio, int paginas) {
		super(id, titulo, fecha, precio);
		this.paginas = paginas;
		
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Cantidad de paginas" + paginas + ",Fecha:" + getFecha() + ", Titulo:" + getTitulo()
				+ ", Precio:" + getPrecio() + ", ID: " + getId() ;
	}
}