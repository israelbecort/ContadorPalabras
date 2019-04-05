package es.studium.contadorPalabrasMVC;


public class MainContadorPalabras
{
	public static void main(String[] args)
	{
		VContadorPalabras Vista = new VContadorPalabras();
		MContadorPalabras Modelo = new MContadorPalabras();
		
		/* Instanciamos un objeto de la clase Controlador */
		new CContadorPalabras(Vista, Modelo); 

	}
}
