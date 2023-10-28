package part2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones extends JFrame {
    private JButton botonRojo;
    private JButton botonVerde;
    private JButton botonAzul;

    public Botones() {
        setTitle("Cambio de Fondo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        botonRojo = new JButton("Rojo");
        botonVerde = new JButton("Verde");
        botonAzul = new JButton("Azul");

        add(botonRojo);
        add(botonVerde);
        add(botonAzul);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = ((JButton) e.getSource()).getText();
                cambiarFondo(color);
            }
        };

        botonRojo.addActionListener(actionListener);
        botonVerde.addActionListener(actionListener);
        botonAzul.addActionListener(actionListener);
    }

    public void cambiarFondo(String color) {
        Color nuevoColor = Color.WHITE; // Color predeterminado (blanco)

        if (color.equals("Rojo")) {
            nuevoColor = Color.RED;
        } else if (color.equals("Verde")) {
            nuevoColor = Color.GREEN;
        } else if (color.equals("Azul")) {
            nuevoColor = Color.BLUE;
        }

        getContentPane().setBackground(nuevoColor);
       // System.out.println("Cambiando color de fondo a: " + color);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Botones ventana = new Botones();
                ventana.setVisible(true);
            }
        });
    }
}