package programadorCertificado;

public class PracticaOrdenarArray {
	
	
	public static void main(String [] args) {
		int [] numeros = {1,6,9,2,3,11,8,4,7,5};
		ordenarNumeros(numeros);
		//mostrar(numeros);
		
	}
	
	public static void ordenarNumeros(int [] numeros) {
		int aux;
		String salida = "";
		//Recorre el arreglo
		for( int i = 0; i<numeros.length; i++) {
			//Si la validacion de cumple, se encarga del intercambio de las posiciones del array
			for(int j = i+1; j<numeros.length; j++) {
				if( numeros[j] < numeros[i]) {
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
		
//		for(int k = 0; k < numeros.length; k++) {
//			System.out.print(numeros[k] + ",");
//		}
	}
	
	public static void mostrar(int [] numeros) {
		for(int n : numeros) {
			System.out.print(n + ",");
		}
	}
	

}
