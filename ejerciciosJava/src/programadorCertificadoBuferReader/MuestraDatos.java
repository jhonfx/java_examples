package programadorCertificadoBuferReader;

import java.util.Scanner;

public class MuestraDatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nom;
		int cod;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre:");
		nom = sc.next();
		System.out.println("Introduzca su n�mero de personal: ");
		cod = sc.nextInt();
		System.out.println(nom + ":" + cod);
		
	}

}
