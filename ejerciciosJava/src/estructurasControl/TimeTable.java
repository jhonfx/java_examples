package estructurasControl;

public class TimeTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size = 9;
		
		System.out.println("");
		System.out.print("* | ");
		for( int x = 1; x <= size; x++) {
			System.out.print(x + " ");
		}
		System.out.print("\n" + "-----------------------------");
		System.out.println();
		for (int row = 1; row <= size; row ++) {			
			System.out.print(row + " | ");
			for (int col = 1; col <= size; col ++) {
				System.out.print(row * col + " ");				
			}
			System.out.println();
		}
	}
}
