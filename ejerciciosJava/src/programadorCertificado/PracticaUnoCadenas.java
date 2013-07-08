package programadorCertificado;

public class PracticaUnoCadenas {
	public static void main(String [] args) {
		String cadena = "Esta es una super cadena";
		String nuevaCadena = "";
		for( int x = cadena.length() - 1; x>=0; x--) {
			nuevaCadena = nuevaCadena + cadena.charAt(x);
		}
		System.out.println(nuevaCadena);
}
	}
