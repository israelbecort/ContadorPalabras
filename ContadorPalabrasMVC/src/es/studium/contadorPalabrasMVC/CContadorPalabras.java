package es.studium.contadorPalabrasMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CContadorPalabras implements WindowListener, ActionListener, KeyListener
{
	VContadorPalabras objVista=null;
	MContadorPalabras objModelo=null;
	
	public CContadorPalabras(VContadorPalabras objVista, MContadorPalabras objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 

		/* Añadimos los escuchadores */
		objVista.btnContar.addActionListener(this);
		objVista.addWindowListener(this); 
		objVista.text.addKeyListener(this);
		objVista.text.requestFocus();
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		/*if(objVista.btnContar.equals(arg0.getSource())) {
			try {
				String contador= null;
				String str=null;
				int res=0;
				
					contador =objVista.text.getText();
					res = objModelo.cuentaPalabras(contador);
					str=Integer.toString(res);
					objVista.lblContador.setText(str);
					
			}catch(Exception e) {
				e.printStackTrace(); 
			}
		
		}*/
	}

	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
			
				String contador= null;
				String str=null;
				int res=0;
			try {
					contador =objVista.text.getText();
					res = objModelo.cuentaPalabras(contador);
					str=Integer.toString(res);
					objVista.lblContador.setText(str);
					
			}catch(Exception a) {
				a.printStackTrace(); 
			}	
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}

}
