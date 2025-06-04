package supermercado;

public class alimento extends producto{
	
	String vencimiento;
	
	public alimento (String nombre,int precio , String vencimiento){
		super (nombre, precio);
		this.vencimiento = vencimiento ;
	}

	public String getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}

	
	}

