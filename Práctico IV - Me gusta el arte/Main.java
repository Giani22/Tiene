package me_gusta_el_flan;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner M = new Scanner(System.in);
		
		
		
		System.out.println("La Pintura");
		System.out.println("Prosposito?: ");
		String proposito = M.next();
		System.out.println("Autor: ");
		String autor =M.next();
		System.out.println("Tecnica utilizada: ");
		String tecnica =M.next();
		System.out.println("Ingrese los elemenots que se ven en la obra: ");
		String elementos =M.next();
		
		Pintura p1 =new Pintura(proposito, autor, tecnica, elementos);
		
		System.out.println("Gracias.");
		M.nextLine();
		
		System.out.println("La Escultura");
		System.out.println("Prosposito?: ");
		proposito = M.next();
		System.out.println("Autor: ");
		autor =M.next();
		System.out.println("Tecnica utilizada: ");
		tecnica =M.next();
		System.out.println("Herramientas utilizadas: ");
		String herramienta =M.next();
				
		Escultura e1 =new Escultura(proposito, autor, tecnica, herramienta);		
		System.out.println("Gracias.");
		
		
		System.out.println(p1.toString()); 
		System.out.println(e1.toString());
	}

}
