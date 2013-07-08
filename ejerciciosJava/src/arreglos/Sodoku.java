package arreglos;
/**
 *
 * @author JhonFx
 */
public class Sodoku {

    public static void main(String [] r){
        int sodoku [][] = {{1,2,3},{1,2,3},{1,2,3}};

        for(int row = 0; row < sodoku.length; row++){
            for(int col = 0; col < sodoku.length; col++){                
                System.out.print(sodoku[row][col] + "  ");
            }
            System.out.println("");
        }
    }
}
