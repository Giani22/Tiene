package practico;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame{
	
	public ventana() {
		
		   this.setTitle("Registrar Usuario");
	       this.setSize(300, 400);
	       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       this.setLocationRelativeTo(null);
	       this.setLayout(new GridLayout(2,1));
	      // this.setResizable(false);
	       
	       
	       JPanel p1 = new JPanel();
	       p1.setLayout(new GridLayout(5,2));
	       
	       JPanel p2 = new JPanel();
	       p2.setLayout(new FlowLayout());

	       JLabel RNom = new JLabel("Nombre");
	       JTextField Nom = new JTextField();
	       JLabel RApe = new JLabel("Apellido");
	       JTextField Ape = new JTextField();
	       JLabel RCed = new JLabel("Cédula");
	       JTextField Ced = new JTextField();
	       JLabel RTCed = new JLabel("Edad");
	       JTextField TRCed = new JTextField();
	       
	       
	       JLabel TRol = new JLabel("Rol");
	       
	       String [] rol = {"Cosa 1", "Cosa 2", "El Gato Ensombrerado"};

	       JComboBox Rol = new JComboBox(rol);
	       
	       JButton coso2= new JButton("Aceptar");
	       
	       p1.add(RNom);
	       p1.add(Nom);
	       p1.add(RApe);
	       p1.add(Ape);
	       p1.add(RCed);
	       p1.add(Ced);
	       p1.add(RTCed);
	       p1.add(TRCed);
	       p1.add(TRol);
	       p1.add(Rol);
	       
	       p2.add(coso2);
	       
	       this.add(p1);
	       this.add(p2);

	       
	      
	}
}
