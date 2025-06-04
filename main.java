package supermercado;

import java.util.Scanner;
public class main  {

	public static void main (String[] args ) {
		Scanner M = new Scanner(System.in);
		
		
		//electronica
		
		 System.out.println("Ingrese producto electrónico:");
		 
	        System.out.print("Nombre: ");
	        String nombre1 = M.nextLine();
	        
	        System.out.print("Precio: ");
	        double precio1 = M.nextDouble();
	       
	        System.out.print("Marca: ");
	        String marca = M.nextLine();
	        
	        electronica elec = new electronica(nombre1, precio1, marca);
	
	        //ropa
	
	        System.out.println("\nIngrese producto de ropa:");
	        
	        System.out.print("Nombre: ");
	        String nombre2 = M.nextLine();
	        
	        System.out.print("Precio: ");
	        double precio2 = M.nextDouble();
	       
	        System.out.print("Talla: ");
	        String talla = M.nextLine();
	        ropa ropa = new ropa(nombre2, precio2, talla);

	        // Datos para alimento
	        System.out.println("\nIngrese producto alimenticio:");
	        System.out.print("Nombre: ");
	        String nombre3 = M.nextLine();
	        
	        System.out.print("Precio: ");
	        double precio3 = M.nextDouble();
	      
	        System.out.print("Fecha de caducidad (dd/mm/yyyy): ");
	        String fecha = M.nextLine();
	        alimento ali = new alimento(nombre3, precio3, fecha);
	        
	        
	        //productos
	        elec.toString();
	        ropa.toString();
	        ali.toString();

	
}
	
	
}
