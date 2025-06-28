package cosa1;

import java.util.Scanner;

public class Tecnicos extends Personal implements coso{
	Scanner M =new Scanner(System.in);
	private String especialidad;
	
	public Tecnicos (int ci, String name, int year,String especialidad) {
		super(ci, name, year);
		this.especialidad= "hardware";
		
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	@Override
	public void enviar() {
		
		System.out.println("enviar mesaje:");
		String mensaje =M.next();
	System.out.println("Enviado");	
		
	}
	
}
