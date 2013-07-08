package estructurasControl;

import javax.swing.JOptionPane;

public class CozaLozaWoza {
	public static void main(String[] args) {
		int lowerbound = 1;
		int upperbound = 110;
		String tres = "";
		String cinco = "";
		String siete = "";
		String tresCinco = "";
		String once = "";
		
		for (int number = lowerbound; number <= upperbound; number++) {
			if (number % 3 == 0) {
				System.out.print(" Coza ");
				tres = tres + number;
			}
			if (number % 5 == 0) {				
				System.out.print(" Loza ");
				cinco = cinco + number;
			}
			if (number % 7 == 0) {
				System.out.print(" Woza ");
				siete = siete + number;
			}
			if( number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
				System.out.print(number + " ");
				tresCinco = tresCinco + number + "\n";
			}
			if( number % 11 == 0) {
				System.out.print("\n");
				once = once + number + "\n";
			}
		}
	}

}
