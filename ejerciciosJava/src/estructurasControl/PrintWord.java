package estructurasControl;

public class PrintWord {
	
	public static void main(String [] l) {
		int number = 5;
		
		if (number == 1) {
			System.out.println("ONE");
		} else 
		if (number == 2) {
			System.out.println("TWO");
		} else
		if (number == 3) {
			System.out.println("THREE");
		} else
		if (number == 4) {
			System.out.println("FOUR");
		} else
		if (number == 5) {
			System.out.println("FIVE");
		}
		
		
		switch(number) {
		case 1: System.out.println("ONE");
				break;
		case 2: System.out.println("TWO");
				break;
		case 3: System.out.println("THREE");
				break;
		case 4: System.out.println("FOUR");
				break;
		case 5: System.out.println("F1V3");
				break;
		default: System.out.println("OTHER");
		}
		
		
	}
}
