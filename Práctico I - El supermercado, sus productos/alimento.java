package supermercado;

public class alimento extends producto{
	
	String vencimiento;
	
	public alimento (int id, String nombre,double precio , String vencimiento){
		super (id, nombre, precio);
		this.vencimiento = vencimiento ;
	}

	public String getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}

	
	}

