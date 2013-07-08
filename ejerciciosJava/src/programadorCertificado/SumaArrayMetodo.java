package programadorCertificado;

public class SumaArrayMetodo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int mayor,menor,suma;
		int [] nums = {3,4,8,1};
		
		suma = sumar(nums);
		menor = calculoMenor(nums);
		mayor = calculoMayor(nums);
		
		System.out.println("SUMA => " + suma);
		System.out.println("MAYOR => " + mayor);
		System.out.println("MENOR => " + menor);
		

	}
	
	static int sumar(int numeros[]) {
		int s = 0;
		for( int i = 0; i<numeros.length; i++) {
			s+=numeros[i];
		}
		return s;
	}
	
	static int calculoMayor(int numeros[]) {
		int mayor = numeros[0];
		for( int i = 0; i<numeros.length; i++) {
			if(numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		return mayor;
	}
	
	static int calculoMenor(int numeros[]) {
		int menor = numeros[0];
		for( int i = 0; i<numeros.length; i++) {
			if(numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		return menor;
	}

}
