package es.studium.contadorPalabrasMVC;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class VContadorPalabras extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	JTextArea text=new JTextArea();
	JLabel lblResultado=new JLabel("Resultado:");
	JLabel lblContador=new JLabel("0");
	JButton btnContar=new JButton("Contar");
	BorderLayout borderLayout1 = new BorderLayout();
	
	//Paneles
	JPanel pnlSup=new JPanel();
	JPanel pnlInf=new JPanel();
	
	public VContadorPalabras() {
		setTitle("Contador de palabras");
		setSize(300,220);
		setVisible(true);
		
		pnlSup.setLayout(new GridLayout(1,1));
		pnlSup.add(text);
		
		pnlInf.setLayout(borderLayout1);
		pnlInf.add(lblResultado, BorderLayout.WEST);
		pnlInf.add(lblContador, BorderLayout.CENTER);
		pnlInf.add(btnContar, BorderLayout.EAST);
		
		add(pnlSup, "North");
		add(pnlInf,"South");
		borderLayout1.setVgap(20);
		borderLayout1.setHgap(20);
		setLocationRelativeTo(null);
		setLocation(480, 200);
		
	}
	public static void main(String[] args)
	{
		new VContadorPalabras();
	}

}
