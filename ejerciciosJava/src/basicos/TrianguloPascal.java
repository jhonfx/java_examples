package basicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrianguloPascal {
	public static void main(String[] args) throws IOException {
        System.out.println("Enter the number of rows for which the Pascal Triangle is requird: ");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        int numRow = Integer.parseInt(bf.readLine());
    	int vuelta = 1;
        for (int i = 1; i <= numRow; i++) {
            // Prints the blank spaces
        	System.out.println("i: "+i);
        	System.out.println("vuelta: " + vuelta);
            for (int j = 1; j <= numRow - i; j++) {
            	System.out.println("j: "+j);
            	System.out.println("vuelta: " + vuelta);
            	//System.out.print("+");
            }
            // Prints the value of the number
            for (int k = 1; k <= i; k++) {            	
                //System.out.println(i + "|");
            	System.out.println(k <= i ? "SI" : "NO");
            	System.out.println("k: "+k);
            	System.out.println("vuelta: " + vuelta);
            }
            vuelta++;
            System.out.println("fin for principal");
            
            //System.out.println("aqui salta!");
        }
    }

}
