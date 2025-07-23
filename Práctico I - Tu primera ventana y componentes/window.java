package Ventana;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class window extends JFrame{
	
	public window() {
		this.setTitle("Ventana de prubea- Ramiro S");//establece el titulo de la ventana
		this.setSize(500,300);//tamaño en PX. primero el anocho y luego el alto
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//accion default al cerrar
		this.setLocationRelativeTo(null);//posicion en la que se encuentra la ventana inicial
		
		
		JLabel etiqueta = new JLabel("Bienvenido a mi programa");
		this.setLayout(new GridLayout(1, 1)); 
		etiqueta.setForeground(Color.BLACK); // Cambia el color del texto
		add(etiqueta);
		
		JLabel etiqueta1 = new JLabel("Nombre: ");
		this.setLayout(new GridLayout(2, 2)); 
		etiqueta.setForeground(Color.BLACK); // Cambia el color del texto
		add(etiqueta1);
		
		JTextField nombre1 = new JTextField();
		this.setLayout(new GridLayout(3, 3));
		add(nombre1);
		
		
		JButton botonAceptar = new JButton("Aceptar");
		this.setLayout(new GridLayout(4, 4)); 
        add(botonAceptar);

      this.setVisible(true);// Hacer visible la ventana
      
  }
		
	
	    }
	

