package ejercicio2;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner M = new Scanner(System.in);
		
		//El usuario elije la opcion 
				int opcion;
				do {
				System.out.println("Bienvenido");
				System.out.println("Elija su opcion");
				System.out.println("1- Libro");
				System.out.println("2- Revista");
				System.out.println("3- Articulo Cientifico");
				System.out.println("4- Salir");
				opcion =M.nextInt();
				
				switch(opcion) {
				
				
				case 1://de acurdo a su elexion se le mostrar un caso distinto donde de de alta, baja o listar
						menuLibro(M);
					case 2:
						menuRevista(M);
						break;	
					case 3:	
						menuArticuloCientifico(M);
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
	

		public static void menuLibro(Scanner M) {
			int opcion;
			libro[] arreglo = new libro[10];

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
					altaLibro(M, arreglo);
					break;	
				case 2:	
					listaLibro(arreglo);
					break;
				case 3:
					bajaLibro(arreglo, M);
					break;
				case 4:
					modificarLibro(arreglo, M);
					break;
				default:
					System.out.println("Opcion no disponible");
					break;
				}
			} while (opcion!=5);
			
		}	

		public static void altaLibro (Scanner M, libro[] arreglo) {
			
			System.out.println("ID: ");
			int id = M.nextInt();
			System.out.print("Titulo: ");
	        String titulo = M.next();
	        System.out.print("Fecha de publicacion: ");
	        double fecha = M.nextDouble();
	        M.nextLine();
	        System.out.print("Precio: ");
	        String precio = M.next();
	        System.out.print("Cantidad de paginas: ");
	        int  paginas = M.nextInt();
	        
	        for (int i = 0; i < arreglo.length; i++) {
	            if (arreglo[i] == null) {
	                arreglo[i] = new libro (id, titulo, precio, fecha, paginas);
	                System.out.println("Producto de electronica agregado.");
	            
	                break;
		}
	            }
	        }
	
		public static void listaLibro (libro[] arreglo) {
			
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i] != null) {
					System.out.print("ID del producto: "+ i + arreglo[i].getId());
					System.out.print("Titulo: " + arreglo[i].getTitulo());
					System.out.println("Fecha: " + arreglo[i].getFecha());
					System.out.println("Precio: " + arreglo[i].getPrecio());
					System.out.println("Paginas: " + arreglo[i].getPaginas());
				}else {
					System.out.println("Posicio" + i + "esta vacia");
				}
				}
			}
		
		public static void bajaLibro (libro[] arreglo, Scanner M) {
			
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
		
		public static void modificarLibro (libro[] arreglo, Scanner M) {
			
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
	
		public static void menuRevista(Scanner M) {
			revista[] arreglo1 =new revista[10];
			int opcion;
			do {
				
				System.out.println("Revista:");
				System.out.println("1- Ingresar producto");
				System.out.println("2- Mostrar lista");
				System.out.println("3- Borrar producto");
				System.out.println("4- Modificar producto");
				System.out.println("5- Salir");
				opcion =M.nextInt();
				

		        switch (opcion) { // elije mostrar, listar, borrar un producto 
		            case 1:
		                altaRevista(M, arreglo1);
		                break;
		            case 2:
		            	listarRevista (arreglo1);
		                break;
		            case 3:
		               bajarRevista (M, arreglo1);
		                break;
		            case 4:
		                modificarRevista(arreglo1, M);
		                break;
		            case 5:
		                System.out.println("Saliendo...");
		                break;
		            default:
		                System.out.println("Opción inválida.");
		        }
			 } while (opcion != 5);
		}
		public static void altaRevista (Scanner M, revista[] arreglo1) {
			
			
			System.out.println("ID del producto: ");
			int id = M.nextInt();
			System.out.print("Titulo: ");
	        String  titulo = M.next();
	        System.out.print("Fecha: ");
	        String fecha = M.next();
	        M.nextLine();
	        System.out.print("Precio: ");
	        double precio = M.nextDouble();
	        System.out.println("Editorial: ");
	        String d1 =M.next();
	        
	        
	        for (int i = 0; i < arreglo1.length; i++) {
	            if (arreglo1[i] == null) {
	                arreglo1[i] = new revista(id, titulo, fecha, precio, d1);
	                System.out.println("Producto de electronica agregado.");
	            
	                break;
		}
	            }
	        }
		
	   public static void listarRevista (revista[] arreglo1) {
				
				for(int i=0; i<arreglo1.length; i++) {
					if(arreglo1[i] != null) {
						System.out.print("ID del producto: "+ i + arreglo1[i].getId());
						System.out.print("Titulo: " + arreglo1[i].getTitulo());
						System.out.println("Fecha: " + arreglo1[i].getFecha());
						System.out.println("Precio: " + arreglo1[i].getPrecio());
						System.out.println("Editorial: " + arreglo1[i].getId());
					}else {
						System.out.println("Posicio" + i + "esta vacia");
					}
					}
				}
	   
	   public static void bajarRevista (Scanner M, revista[] arreglo1) {
		   
		   System.out.print("Ingrese el ID del producto a eliminar: ");
	        int id = M.nextInt();
	        for (int i = 0; i < arreglo1.length; i++) {
	            if (arreglo1[i] != null && arreglo1[i].getId() == id) {
	                arreglo1[i] = null;
	                System.out.println("Producto eliminado.");
}
	            }
		   
	   }
	   
	   public static void modificarRevista (revista[] arreglo1, Scanner M) {
		   
				
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
	        
		
	   public static void menuArticuloCientifico(Scanner M) {
		   articuloCientifico [] arreglo2 =new articuloCientifico [10];
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
		                altaArticuloCientifico(arreglo2, M);
		                break;
		            case 2:
		                listarArticuloCientifico(arreglo2);
		                break;
		            case 3:
		                bajarArticuloCientifico(arreglo2, M);
		                break;
		            case 4:
		                modificarArticuloCientifico(arreglo2, M);
		                break;
		            case 5:
		                System.out.println("Saliendo...");
		                break;
		            default:
		                System.out.println("Opción inválida.");
		        }
			 } while (opcion != 5);
		}
		
		public static void altaArticuloCientifico (articuloCientifico [] arreglo2, Scanner M) {
			
			System.out.println("ID del producto: ");
			int id = M.nextInt();
			System.out.print("Titulo: ");
	        String  titulo = M.next();
	        System.out.print("Fecha: ");
	        String fecha = M.next();
	        M.nextLine();
	        System.out.print("Precio: ");
	        double precio = M.nextDouble();
	        System.out.println("Nro de participantes: ");
	        int c1 =M.nextInt();
	        
	        for (int i = 0; i < arreglo2.length; i++) {
	            if (arreglo2[i] == null) {
	            	arreglo2[i] = new  articuloCientifico (fecha, titulo, precio, id, c1);
	                System.out.println("Producto de electronica agregado.");
	                
	                break;
	            }
	            }
	        }
		
		public static void listarArticuloCientifico ( articuloCientifico[] arreglo2) {
			
			 for(int i=0; i<arreglo2.length; i++) {
					if(arreglo2[i] != null) {
						System.out.print("ID del producto"+ i + arreglo2[i].getId());
						System.out.print("Titulo: " + arreglo2[i].getTitulo());
						System.out.println("Fecha: " + arreglo2[i].getFecha());
						System.out.println("Precio: " + arreglo2[i].getPrecio());
						System.out.println("Participantes: " + arreglo2[i].getC1());
					}else {
						System.out.println("Posicio" + i + "esta vacia");
					}
					}
			 }
		
		
		public static void bajarArticuloCientifico (articuloCientifico [] arreglo2, Scanner M) {
			
			 System.out.print("Ingrese el ID del producto a eliminar: ");
		        int id = M.nextInt();
		        for (int i = 0; i < arreglo2.length; i++) {
		            if (arreglo2[i] != null && arreglo2[i].getId() == id) {
		                arreglo2[i] = null;
		                System.out.println("Producto eliminado.");
	}
		            }
		        }
		
		
		public static void modificarArticuloCientifico (articuloCientifico [] arreglo2, Scanner M) {
			
			
			
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


