package ventanan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaSimple extends JFrame{

	public VentanaSimple() {
        setTitle("Datos");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
	
        //
        JLabel lblNom = new JLabel("Nombre completo:");
        JTextField txtNom = new JTextField();
        
        JLabel lblAño = new JLabel("Año en que nacimiento:");
        JSpinner spnAño = new JSpinner(new SpinnerNumberModel(2000, 1900, 2025, 1));
        
        //boton
        JButton btnMostrar = new JButton("Mostrar");
        
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.add(lblNom);
        panel.add(txtNom);
        panel.add(lblAño);
        panel.add(spnAño);
        panel.add(btnMostrar);

        this.add(panel);

        // Accion del boton
        btnMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNom.getText();
                int añoNacimiento = (int) spnAño.getValue();

                System.out.println("Nombre completo: " + nombre);
                System.out.println("Año de nacimiento: " + añoNacimiento);
            }
        });
    }
	
	}

