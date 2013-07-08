package estructurasControl;

public class Fibonacci {
		
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int var = 1;
		
		for (int i = 0; i < 40000; i++) {
			System.out.print(var + ",");
			a = b;
			b = var;
			var = a + b;
		}
	}
	
	

}
