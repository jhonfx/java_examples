package programadorCertificadoBuferReader;

import javax.swing.JOptionPane;

public class FactorialVDos {
	
	public static void main(String [] args){
		int numero;
		int resultado = 1;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
		for(int x = 1; x <= numero; x++) {
			resultado = resultado * x;
		}
		System.out.println("El factorial es: " + resultado);
	}
	
	

}
