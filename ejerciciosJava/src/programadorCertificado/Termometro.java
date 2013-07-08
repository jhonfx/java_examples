package programadorCertificado;

public class Termometro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] temp = {25,38,12,30};
		int maxima = temp[0];
		
		for (int tp: temp) {
			maxima = Math.max(maxima, tp);
			System.out.println("Temperatura máxima: " + maxima);
		}
	}

}
