package Biblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame {

    private JTextField txtISBN, txtAutor, txtTitulo;
    private JLabel lblMensaje;
    private JTextArea Listado;

    private Libro[] libros = new Libro[10];

    public Ventana() {

        setTitle("Registro de Libros");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        //Panel de entrada
        JPanel panelDatos = new JPanel(new GridLayout(4, 2, 5, 5));
        panelDatos.add(new JLabel("ISBN:"));
        txtISBN = new JTextField();
        panelDatos.add(txtISBN);

        panelDatos.add(new JLabel("Autor:"));
        txtAutor = new JTextField();
        panelDatos.add(txtAutor);

        panelDatos.add(new JLabel("Título:"));
        txtTitulo = new JTextField();
        panelDatos.add(txtTitulo);

        lblMensaje = new JLabel("");
        lblMensaje.setForeground(Color.BLUE);
        panelDatos.add(lblMensaje);

        add(panelDatos, BorderLayout.NORTH);

        //Listado
        Listado = new JTextArea();
        Listado.setEditable(false);
        JScrollPane scroll = new JScrollPane(Listado);
        add(scroll, BorderLayout.CENTER);

        //Botones
        JPanel panelBotones = new JPanel();
        JButton btnRegistrar = new JButton("Registrar Libro");
        JButton btnListar = new JButton("Listar Libros");
        panelBotones.add(btnRegistrar);
        panelBotones.add(btnListar);
        add(panelBotones, BorderLayout.SOUTH);

        //Registrar
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String isbn = txtISBN.getText().trim();
                String autor = txtAutor.getText().trim();
                String titulo = txtTitulo.getText().trim();

                if (isbn.isEmpty() || autor.isEmpty() || titulo.isEmpty()) {
                    lblMensaje.setText("Complete todos los campos");
                    return;
                }

                boolean registrado = false;
                for (int i = 0; i < libros.length; i++) {
                    if (libros[i] == null) {
                        libros[i] = new Libro(isbn, autor, titulo);
                        lblMensaje.setText("Registro exitoso ");
                        registrado = true;
                        break;
                    }
                }

                if (!registrado) {
                    lblMensaje.setText("No hay espacio para mas libros");
                }
                	//limpia
                txtISBN.setText("");
                txtAutor.setText("");
                txtTitulo.setText("");
            }
        });

        //Listar
        btnListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Listado.setText("LIBROS\n");
                for (Libro libro : libros) {
                    if (libro != null) {
                        Listado.append("ISBN: " + libro.isbn +
                                ", Autor: " + libro.autor +
                                ", Título: " + libro.titulo + "\n");
                    }
                }
            }
        });
    }


}
