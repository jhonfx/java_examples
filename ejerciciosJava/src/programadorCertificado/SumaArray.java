package programadorCertificado;

public class SumaArray {
	public static void main(String [] s) {
		int mayor, menor, suma;
		int [] nums = {3,4,8,2};
		suma = 0;
		menor = nums[0];
		mayor = nums[0];
		
		for (int i=0; i<nums.length; i++) {
			if(nums[i] > mayor) {
				mayor = nums[i];
			}
			if(nums[i] < menor) {
				menor = nums[i];
			}
			
			suma = nums[i];
		}
		System.out.println("El mayor es " + mayor);
		System.out.println("El menor es " + menor);
		System.out.println("La suma es " + suma);
	}

}
