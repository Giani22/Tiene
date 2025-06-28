package cosa1;
import java.util.Scanner;
public class Encargados extends Personal implements coso{
	Scanner M =new Scanner(System.in);
	private String area;//años de esperiensia
	
	public Encargados (int ci, String name, int year, String area){
		super(ci, name, year);
		this.area=area;
		
		
	
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	

	@Override
	public void enviar() {
		System.out.println("enviar mesaje:");
		String mensaje =M.next();
	System.out.println("Enviado");	
	}
	
	
}
