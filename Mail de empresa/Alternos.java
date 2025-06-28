package cosa1;
import java.util.Scanner;
public class Alternos extends Personal implements coso{
	Scanner M =new Scanner(System.in);
	private String sustituye;
	
	public Alternos (int ci, String name, int year, String sustituye) {
		super(ci, name, year);
		this.sustituye= "Martin";
	}

	public String getSustituye() {
		return sustituye;
	}

	public void setSustituye(String sustituye) {
		this.sustituye = sustituye;
	}
	
	@Override
	public void enviar() {
		System.out.println("enviar mesaje:");
		String mensaje =M.next();
	System.out.println("Enviado");	
		
	}
	
}
