package Calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculadora3000 extends JFrame{

	public Calculadora3000() {
        setTitle("Calculadora 3000");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //Numeros
        JLabel Nro1 = new JLabel("Numero 1");
        JTextField txtNro1 = new JTextField();
        
        JLabel Nro2 = new JLabel("Numero 2");
        JTextField txtNro2 = new JTextField();
        
        //boton
        JButton btnSumar = new JButton("+");
        JButton btnRestar = new JButton("-");
        JButton btnMultiplicar = new JButton("x");
        JButton btnDividir = new JButton("%");
        
        //Resultado
        JLabel lblResultado = new JLabel("Resultado: ");
        lblResultado.setFont(new Font("Arial", Font.BOLD, 14));
        
        //
        JPanel panel1 = new JPanel(new GridLayout(3, 2, 10, 10));
        panel1.add(Nro1);
        panel1.add(txtNro1);
        panel1.add(Nro2);
        panel1.add(txtNro2);
        
        JPanel panel2 = new JPanel(new GridLayout(1, 4, 10, 10));
        panel2.add(btnSumar);
        panel2.add(btnRestar);
        panel2.add(btnMultiplicar);
        panel2.add(btnDividir);

          
        //Panel general
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.add(panel1, BorderLayout.NORTH);
        panel.add(panel2, BorderLayout.CENTER);
        panel.add(lblResultado, BorderLayout.SOUTH);
        
        this.add(panel); 
        
      //accion del boton  
        
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtNro1.getText());
                double num2 = Double.parseDouble(txtNro2.getText());
                lblResultado.setText("Resultado: " + (num1 + num2));
            }
        });

        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtNro1.getText());
                double num2 = Double.parseDouble(txtNro2.getText());
                lblResultado.setText("Resultado: " + (num1 - num2));
            }
        });

        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtNro1.getText());
                double num2 = Double.parseDouble(txtNro2.getText());
                lblResultado.setText("Resultado: " + (num1 * num2));
            }
        });

        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtNro1.getText());
                double num2 = Double.parseDouble(txtNro2.getText());
                lblResultado.setText("Resultado: " + (num1 / num2));
            }
        });

    }
}