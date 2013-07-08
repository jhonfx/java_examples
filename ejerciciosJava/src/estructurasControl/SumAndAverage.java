package estructurasControl;

public class SumAndAverage extends Object{
	
	public static void main (String [] s) {
		int sum = 0;
		double average;
		int lowerbound = 100;
		int upperbound = 100;
		
		for ( int number = lowerbound; number <= upperbound; number++) {
			sum += number;
		}		
		System.out.println("number=>" + sum);
		SumAndAverage.numberWhileDo();
		SumAndAverage.numberDoWhile();
	}
	
	public static void numberWhileDo() {
		int number = 1;
		int sum = 0;
		int upperbound = 100;
		
		while (number <= upperbound) {
			sum += number;
			number++;			
		}
		System.out.println("numberEnMetodo=>" + sum);
	}
	
	public static void numberDoWhile() {
		int number = 1;
		int sum = 0;
		int upperbound = 100;
		
		do {
			sum += number;
			number++;
		} while (number <= upperbound);
		
		System.out.println("numberEnMetodo=>" + sum);
	}
	

}
