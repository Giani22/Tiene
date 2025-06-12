package supermercado;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner M = new Scanner(System.in);
		
		//El usuario elije la opcion 
		int opcion;
		do {
		System.out.println("Bienvenido");
		System.out.println("Elija su opcion");
		System.out.println("1- Electronica");
		System.out.println("2- Ropa");
		System.out.println("3- Alimento");
		System.out.println("4- Salir");
		opcion =M.nextInt();
		
		switch(opcion) {
		
		
		case 1://de acurdo a su elexion se le mostrar un caso distinto donde de de alta, baja o listar
				menuElectronica(M);
			case 2:
				menuRopa(M);
				break;	
			case 3:	
				menuAlimento(M);
				break;
			case 4:
				System.out.println("Finished");
				break;
			
				
			default:
				System.out.println("Opcion no disponible");
				break;
				}
			} while (opcion!=4);
			}
			
		
			public static void menuElectronica(Scanner M) {
				int opcion;
				electronica[] arreglo = new electronica[10];

		do {
			
			System.out.println("Electronica:");
			System.out.println("1- Ingresar producto");
			System.out.println("2- Mostrar lista");
			System.out.println("3- Borrar producto");
			System.out.println("4- Modificar producto");
			System.out.println("5- Salir");
			opcion =M.nextInt();
			
		
			switch (opcion) {	// elije mostrar, listar, borrar un producto 
			case 1:
				altaElectronica(M, arreglo);
				break;	
			case 2:	
				listaElectronica(arreglo);
				break;
			case 3:
				bajaElectronica(arreglo, M);
				break;
			case 4:
				modificarElectronica(arreglo, M);
				break;
			default:
				System.out.println("Opcion no disponible");
				break;
				}
			} while (opcion!=5);
			
		
			
			}	

		public static void altaElectronica (Scanner M, electronica[] arreglo) {
			
			System.out.println("ID: ");
			int id = M.nextInt();
			System.out.print("Nombre: ");
	        String nombre = M.next();
	        System.out.print("Precio: ");
	        double precio = M.nextDouble();
	        M.nextLine();
	        System.out.print("Marca: ");
	        String marca = M.next();
	        
	        for (int i = 0; i < arreglo.length; i++) {
	            if (arreglo[i] == null) {
	                arreglo[i] = new electronica(id, nombre, precio, marca);
	                System.out.println("Producto de electronica agregado.");
	                break;
	        
	            }
	        }
	            
		}
	
		public static void listaElectronica (electronica[] arreglo) {
			
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i] != null) {
					System.out.print("ID del producto"+ i + arreglo[i].getId());
					System.out.print("Nombre: " + arreglo[i].getNombre());
					System.out.println("Precio: " + arreglo[i].getPrecio());
					System.out.println("Marca: " + arreglo[i].getModelo());
				}else {
					System.out.println("Posicio " + i + "esta vacia");
				}
				}
			}
		
		public static void bajaElectronica (electronica[] arreglo, Scanner M) {
			
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
		
		public static void modificarElectronica (electronica[] arreglo, Scanner M) {
			
			System.out.println("Ingrese el ID del producto a modificar: ");
			int id = M.nextInt();
			
			for (int i = 0; i < arreglo.length; i++) {
	            if (arreglo[i] != null && arreglo[i].getId() == id) {
	   
	                System.out.print("Nuevo precio: ");
	                double nuevoPrecio = M.nextDouble();
	                
	                arreglo[i].setPrecio(nuevoPrecio);
	              
	                System.out.println("Producto modificado.");
			  return;
		}
	           
	            }
			
			System.out.println("Algo salio mal:(");	 
			System.out.println("Intentnalo mas tarde :)");
		}	
			
		public static void menuRopa(Scanner M) {
			ropa[] arreglo1 =new ropa[10];
			int opcion;
			do {
				
				System.out.println("Ropa:");
				System.out.println("1- Ingresar producto");
				System.out.println("2- Mostrar lista");
				System.out.println("3- Borrar producto");
				System.out.println("4- Modificar producto");
				System.out.println("5- Salir");
				opcion =M.nextInt();
				

		        switch (opcion) { // elije mostrar, listar, borrar un producto 
		            case 1:
		                altaRopa(M, arreglo1);
		                break;
		            case 2:
		            	listarRopa (arreglo1);
		                break;
		            case 3:
		               bajarRopa (M, arreglo1);
		                break;
		            case 4:
		                modificarRopa(arreglo1, M);
		                break;
		            case 5:
		                System.out.println("Saliendo...");
		                break;
		            default:
		                System.out.println("Opción inválida.");
		        }
			 } while (opcion != 5);
		}
		public static void altaRopa (Scanner M, ropa[] arreglo1) {
			
			
			System.out.println("ID del producto: ");
			int id = M.nextInt();
			System.out.print("Nombre: ");
	        String  nombre = M.next();
	        System.out.print("Precio: ");
	        double precio = M.nextDouble();
	        M.nextLine();
	        System.out.print("Talla: ");
	        String talla = M.next();
	        
	        for (int i = 0; i < arreglo1.length; i++) {
	            if (arreglo1[i] == null) {
	                arreglo1[i] = new ropa(id, nombre, precio, talla);
	                System.out.println("Producto de electronica agregado.");
	            
	                break;
		}
	            }
	        }
		
	   public static void listarRopa (ropa[] arreglo1) {
		   
		   for(int i=0; i<arreglo1.length; i++) {
				if(arreglo1[i] != null) {
					System.out.print("ID del producto"+ i + arreglo1[i].getId());
					System.out.print("Nombre: " + arreglo1[i].getNombre());
					System.out.println("Precio: " + arreglo1[i].getPrecio());
					System.out.println("Talla: " + arreglo1[i].getTalla());
				}else {
					System.out.println("Posicio " + i + "esta vacia");
				}
				}
		   }
	   
	   public static void bajarRopa (Scanner M, ropa[] arreglo1) {
		   
		   System.out.print("Ingrese el ID del producto a eliminar: ");
	        int id = M.nextInt();
	        for (int i = 0; i < arreglo1.length; i++) {
	            if (arreglo1[i] != null && arreglo1[i].getId() == id) {
	                arreglo1[i] = null;
	                System.out.println("Producto eliminado.");
}
	            }
		   
	   }
	   
	   public static void modificarRopa (ropa[] arreglo1, Scanner M) {
		   
				
				System.out.println("Ingrese el ID del producto a modificar: ");
				int id = M.nextInt();
				
				for (int i = 0; i < arreglo1.length; i++) {
		            if (arreglo1[i] != null && arreglo1[i].getId() == id) {
		   
		                System.out.print("Nuevo precio: ");
		                double nuevoPrecio = M.nextDouble();
		                
		                arreglo1[i].setPrecio(nuevoPrecio);
		              
		                System.out.println("Producto modificado.");
		                
		            }
		            }
				}
	        
		public static void menuAlimento(Scanner M) {
			alimento [] arreglo2 =new alimento[10];
			int opcion;
			do {
				
				System.out.println("Alimento:");
				System.out.println("1- Ingresar producto");
				System.out.println("2- Mostrar lista");
				System.out.println("3- Borrar producto");
				System.out.println("4- Modificar producto");
				System.out.println("5- Salir");
				opcion =M.nextInt();
				
				 switch (opcion) { // elije mostrar, listar, borrar un producto 
		            case 1:
		                altaAlimento(arreglo2, M);
		                break;
		            case 2:
		                listarAlimento(arreglo2);
		                break;
		            case 3:
		                bajarAlimento(arreglo2, M);
		                break;
		            case 4:
		                modificarAlimento(arreglo2, M);
		                break;
		            case 5:
		                System.out.println("Saliendo...");
		                break;
		            default:
		                System.out.println("Opción inválida.");
		        }
			 } while (opcion != 5);
		}
		
		public static void altaAlimento (alimento [] arreglo2, Scanner M) {
			
			System.out.println("ID del producto: ");
			int id = M.nextInt();
			System.out.print("Nombre: ");
	        String  nombre = M.next();
	        System.out.print("Precio: ");
	        double precio = M.nextDouble();
	        M.nextLine();
	        System.out.print("Vencimiento: ");
	        String vencimiento = M.next();
	        
	        for (int i = 0; i < arreglo2.length; i++) {
	            if (arreglo2[i] == null) {
	                arreglo2[i] = new alimento(id, nombre, precio, vencimiento);
	                System.out.println("Producto de electronica agregado.");
	                
	                break;
	            }
	            }
	        }
		
		public static void listarAlimento (alimento [] arreglo2) {
			
			 for(int i=0; i<arreglo2.length; i++) {
					if(arreglo2[i] != null) {
						System.out.print("ID del producto"+ i + arreglo2[i].getId());
						System.out.print("Nombre: " + arreglo2[i].getNombre());
						System.out.println("Precio: " + arreglo2[i].getPrecio());
						System.out.println("Vencimiento: " + arreglo2[i].getVencimiento());
					}else {
						System.out.println("Posicio " + i + "esta vacia");
					}
					}
			 }
		
		
		public static void bajarAlimento (alimento [] arreglo2, Scanner M) {
			
			 System.out.print("Ingrese el ID del producto a eliminar: ");
		        int id = M.nextInt();
		        for (int i = 0; i < arreglo2.length; i++) {
		            if (arreglo2[i] != null && arreglo2[i].getId() == id) {
		                arreglo2[i] = null;
		                System.out.println("Producto eliminado.");
	}
		            }
		        }
		
		
		public static void modificarAlimento (alimento [] arreglo2, Scanner M) {
			
			
			
			System.out.println("Ingrese el ID del producto a modificar: ");
			int id = M.nextInt();
			
			for (int i = 0; i < arreglo2.length; i++) {
	            if (arreglo2[i] != null && arreglo2[i].getId() == id) {
	   
	                System.out.print("Nuevo precio: ");
	                double nuevoPrecio = M.nextDouble();
	                
	                arreglo2[i].setPrecio(nuevoPrecio);
	              
	                System.out.println("Producto modificado.");
	                
	            }
	            }
			}
		}
		
