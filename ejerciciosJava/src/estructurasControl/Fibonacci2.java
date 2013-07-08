package estructurasControl;

import javax.swing.JOptionPane;

public class Fibonacci2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n, fib;
		String n1;
		n1 = JOptionPane.showInputDialog(null, "Dame un rango de numero: ");
		n = Integer.parseInt(n1);
		fib = (n-1) + (n-2);
		JOptionPane.showMessageDialog(null, "Resultado final (Con fibonacci): " + fib);
	}

}
