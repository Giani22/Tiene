package bob_contruye;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner M = new Scanner(System.in);
		
		//El usuario elije la opcion 
				int opcion;
				do {
				System.out.println("Bienvenido");
				System.out.println("Elija su opcion");
				System.out.println("1- Apartamento");
				System.out.println("2- Casa");
				System.out.println("3- Salir");
				opcion =M.nextInt();
				
				switch(opcion) {
				
				
				case 1://de acurdo a su elexion se le mostrar un caso distinto donde de de alta, baja o listar
						menuApartamento(M);
					case 2:
						menuCasa(M);
						break;	
					case 3:
						System.out.println("Finished");
						break;
					
						
					default:
						System.out.println("Opcion no disponible");
						break;
						}
					} while (opcion!=3);
					}
	

		public static void menuApartamento(Scanner M) {
			int opcion;
			apartamento[] arreglo = new apartamento[10];

			do {
	
				System.out.println("Apartamento:");
				System.out.println("1- Ingresar producto");
				System.out.println("2- Mostrar lista");
				System.out.println("3- Borrar producto");
				System.out.println("4- Modificar producto");
				System.out.println("5- Salir");
				opcion =M.nextInt();
	

				switch (opcion) {	// elije mostrar, listar, borrar un producto 
				case 1:
					altaApartamento(M, arreglo);
					break;	
				case 2:	
					listaApartamento(arreglo);
					break;
				case 3:
					bajarApartamento(arreglo, M);
					break;
				case 4:
					modificarApartamento(arreglo, M);
					break;
				default:
					System.out.println("Opcion no disponible");
					break;
				}
			} while (opcion!=5);
	

	
	}	
		public static void altaApartamento (Scanner M, apartamento[] arreglo) {
			
				System.out.println("ID: ");
				int id = M.nextInt();
				System.out.print("Costo: ");
				Double costo = M.nextDouble();
				System.out.print("Direccion: ");
				String direccion = M.next();
				M.nextLine();
				System.out.print("Piso: ");
				int piso = M.nextInt();
	        
	        for (int i = 0; i < arreglo.length; i++) {
	            if (arreglo[i] == null) {
	                arreglo[i] = new apartamento(id, costo, direccion, piso);
	                System.out.println("Producto de apartamento agregado.");
	                break;
	        
	            }
	        }
	            
		}

		public static void listaApartamento (apartamento[] arreglo) {
			
				for(int i=0; i<arreglo.length; i++) {
					if(arreglo[i] != null) {
						System.out.print("ID del producto: "+ i + arreglo[i].getId());
						System.out.print("Costo: " + arreglo[i].getCosto());
						System.out.println("Direccion: " + arreglo[i].getDireccion());
						System.out.println("Nro de piso: " + arreglo[i].getPiso());
					}else {
						System.out.println("Posicio " + i + "esta vacia");
				}
				}
			}
		
		public static void bajarApartamento (apartamento[] arreglo, Scanner M) {
			
			        System.out.print("Ingrese el ID del producto a eliminar: ");
			        int id = M.nextInt();
			        for (int i = 0; i < arreglo.length; i++) {
			            if (arreglo[i] != null && arreglo[i].getId() == id) {
			                arreglo[i] = null;
			                System.out.println("Producto eliminado.");
			                return;
		}
			            
			            }
		System.out.println("Algo salio mal:(");	 
		System.out.println("Intentnalo mas tarde :)");
		}
		
		public static void modificarApartamento (apartamento[] arreglo, Scanner M) {
			
			System.out.println("Ingrese el ID del producto a modificar: ");
			int id = M.nextInt();
			
			for (int i = 0; i < arreglo.length; i++) {
	            if (arreglo[i] != null && arreglo[i].getId() == id) {
	   
	                System.out.print("Nuevo precio: ");
	                double nuevoCosto = M.nextDouble();
	                
	                arreglo[i].setCosto(nuevoCosto);
	              
	                System.out.println("Producto modificado.");
			return;
		}
	           
	            }
			
			System.out.println("Algo salio mal:(");	 
			System.out.println("Intentnalo mas tarde :)");
		}	


	public static void menuCasa(Scanner M) {
		int opcion;
		casa [] arreglo1 = new casa[10];

		do {

			System.out.println("Casa:");
			System.out.println("1- Ingresar producto");
			System.out.println("2- Mostrar lista");
			System.out.println("3- Borrar producto");
			System.out.println("4- Modificar producto");
			System.out.println("5- Salir");
			opcion =M.nextInt();


			switch (opcion) {	// elije mostrar, listar, borrar un producto 
			case 1:
				altaCasa(M, arreglo1);
				break;	
			case 2:	
				listaCasa(arreglo1);
				break;
			case 3:
				bajarCasa(arreglo1, M);
				break;
			case 4:
				modificarCasa(arreglo1, M);
				break;
			default:
				System.out.println("Opcion no disponible");
				break;
			}
		} while (opcion!=5);



	}	
	public static void altaCasa (Scanner M, casa[] arreglo1) {
	
		
		System.out.println("ID: ");
		int id = M.nextInt();
		System.out.print("Costo: ");
		Double costo = M.nextDouble();
		System.out.print("Direccion: ");
		String direccion = M.next();
		M.nextLine();
		System.out.print("La casa tiene patio?: ");
		boolean p1 = M.nextBoolean();
		boolean patio = true;
		
		
		
		if (patio == p1) {
		    System.out.println("Verdadero la casa si tiene patio");
		}else {
		    System.out.println("Como no va a tener patio!?");
		}
    
    for (int i = 0; i < arreglo1.length; i++) {
        if (arreglo1[i] == null) {
            arreglo1[i] = new casa(id, costo, direccion, patio);
            System.out.println("Producto de casa agregado.");
            break;
    
        }
    }
        
}

	public static void listaCasa (casa[] arreglo1) {
	
		for(int i=0; i<arreglo1.length; i++) {
			if(arreglo1[i] != null) {
				System.out.print("ID del producto: "+ i + arreglo1[i].getId());
				System.out.print("Costo: " + arreglo1[i].getCosto());
				System.out.println("Direccion: " + arreglo1[i].getDireccion());
				System.out.println("Nro de piso: " + arreglo1[i].getPatio());
			}else {
				System.out.println("Posicio " + i + "esta vacia");
		}
		}
	}

	public static void bajarCasa (casa[] arreglo1, Scanner M) {
	
	        System.out.print("Ingrese el ID del producto a eliminar: ");
	        int id = M.nextInt();
	        for (int i = 0; i < arreglo1.length; i++) {
	            if (arreglo1[i] != null && arreglo1[i].getId() == id) {
	                arreglo1[i] = null;
	                System.out.println("Producto eliminado.");
	                return;
}
	            
	            }
	        System.out.println("Algo salio mal:(");	 
	        System.out.println("Intentnalo mas tarde :)");
}

	public static void modificarCasa (casa[] arreglo, Scanner M) {
	
		System.out.println("Ingrese el ID del producto a modificar: ");
		int id = M.nextInt();
	
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null && arreglo[i].getId() == id) {
        	
				System.out.print("Nuevo precio: ");
				double nuevoCosto = M.nextDouble();
            
				arreglo[i].setCosto(nuevoCosto);
          
				System.out.println("Producto modificado.");
				return;
}
       
        }
	
		System.out.println("Algo salio mal:(");	 
		System.out.println("Intentnalo mas tarde :)");
}	
}

