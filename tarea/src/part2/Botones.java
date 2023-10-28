package part2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Botones extends JFrame {
	 public  Botones() {
	    	//la ventana titulo ..
	        setTitle("Ventana con 3 botones ");
	        setSize(550, 320);
	        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());
	//creando botones rojo verde y azul 
	        JButton botonRojo = new JButton(" Rojo ");
	        JButton botonVerde = new JButton(" Verde ");
	        JButton botonAzul = new JButton(" Azul ");
	//creando las "acciones"
	//si se presiona el boton rojo se dira por consola eso 
	        botonRojo.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                getContentPane().setBackground(Color.RED);
	                System.out.println("Se cambio el color de fondo cambiado." +" Color :Rojo. ");
	            }
	        });
	//si se preciona el boton verde dira por consola eso
	        botonVerde.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                getContentPane().setBackground(Color.GREEN);
	                System.out.println("Se cambio el color de fondo cambiado."+ " Color :Verde.");
	            }
	        });
	//si se presiona el boton azul dira por consola eso
	        botonAzul.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                getContentPane().setBackground(Color.BLUE);
	                System.out.println("Se cambio el color de fondo cambiado."+" Color :Azul.");
	            }
	        });
	//añadiendo botones en el "root"
	        add(botonRojo);
	        add(botonVerde);
	        add(botonAzul);
	    }

	    //main ventana
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                Botones ventana = new Botones();
	                ventana.setVisible(true);
	            }
	        });
	    }
}
