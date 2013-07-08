package programadorCertificadoBuferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		String cad;
		long result = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca un numero:");
		cad = br.readLine();
		long num = Long.parseLong(cad);
		
		for( int i = 1; i <= num; i++) {
			result*=i;
		}
		
		System.out.println("El factorial de "+ num +" es "+ result);
		
	}
}
