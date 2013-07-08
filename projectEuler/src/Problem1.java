
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		String multiplos = "";
		for(int x = 1; x < 1000; x++){
			if(x%3 == 0){
				total+= x;
				multiplos += x + "\n";
			}
			if(x%5 == 0){
				total+= x;
				multiplos += x + "\n";
			}
			System.out.println("Total de 10 numeros es:" + total);			
		}
		//System.out.print("Numeros que son multiplos: \n" + multiplos);
		
	}

}
