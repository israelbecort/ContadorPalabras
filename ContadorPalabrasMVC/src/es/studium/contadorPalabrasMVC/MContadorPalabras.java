package es.studium.contadorPalabrasMVC;

public class MContadorPalabras
{
	public static int cuentaPalabras(String s){    
	    int conteoPalabras = 0;    
	    boolean palabra = false;
	    int finDeLinea = s.length() - 1;

	    for (int i = 0; i < s.length(); i++) {
	        // Si el char is una letra, word = true.
	        if (Character.isLetter(s.charAt(i)) && i != finDeLinea) {
	            palabra = true;
	            // Si el char no es una letra y a�n hay m�s letras,
	            // el contador continua.
	        } else if (!Character.isLetter(s.charAt(i)) && palabra) {
	            conteoPalabras++;
	            palabra = false;
	            // �ltima palabra de la cadena; si no termina con una no letra ,
	        } else if (Character.isLetter(s.charAt(i)) && i == finDeLinea) {
	            conteoPalabras++;
	        }
	    }
	    return conteoPalabras;
	}
}
