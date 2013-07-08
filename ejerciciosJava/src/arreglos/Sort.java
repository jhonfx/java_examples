package arreglos;
/**
 *
 * @author JhonFx
 */

import java.util.Arrays;
public class Sort {

        public static void main(String [] u){
            int marks [] = {15,77,88,95,4,7,21};

            System.out.println("Antes del sorting: " + Arrays.toString(marks));
            Arrays.sort(marks);
            System.out.println("Despues del sorting: " + Arrays.toString(marks));
            System.out.println(Arrays.hashCode(marks));
            System.out.println("Despues otro sorting: " + Arrays.toString(marks));
        }
}
