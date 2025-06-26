package ejercicio2;

public class articuloCientifico extends publicacion {

 private int c1;

 	public articuloCientifico (String fecha,String titulo,  double precio, int c1, int id) {
 		super(id, titulo, fecha, precio);
 		this.c1 =c1;
}

	public int getC1() {
		return c1;
	}

	public void setC1(int c1) {
		this.c1 = c1;
	}

	@Override
	public String toString() {
		return "articuloCientifico [c1=" + c1 + ", getFecha()=" + getFecha() + ", getTitulo()=" + getTitulo()
				+ ", getPrecio()=" + getPrecio() + ", ID: " + getId();
	}


}

