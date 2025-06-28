package cosa1;

import java.util.Scanner;

public class Gestor {

	public static void main(String[] args) {
		Encargados E1 =new Encargados(0, null, 0, null);
		Alternos A1= new Alternos(0, null, 0, null);
		Tecnicos T1=new Tecnicos(0, null, 0, null);
			
		Scanner M =new Scanner(System.in);
		
		System.out.println("Bienvenido a enviar un correo");
		System.out.println("Ingrese opc a la cual desea enviarle un email: ");
		System.out.println("1- Encargado");
		System.out.println("2- Alternos");
		System.out.println("3- Tecnicos");
		System.out.println("4- Exit");
		int opc =M.nextInt();
		
		switch (opc) {
		case 1:
			 E1.enviar();
			break;
			
		case 2:
			A1.enviar();
			break;
			
		case 3:
			T1.enviar();
		break;
		case 4:
			System.out.println("Colta.");
				break;
				default:
					System.out.println("Error.");
					break;
		}
		
	}

	
	
}
