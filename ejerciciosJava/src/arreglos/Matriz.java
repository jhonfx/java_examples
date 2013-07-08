package arreglos;

/**
 *
 * @author jhonfx
 */
public class Matriz {

    public static void main(String [] args){
        int matriz [][] = new int [3][3];
        int matriz2 [][] = new int [3][3];
        for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]  = i + 1;
                matriz2[i][j] = j + 1;
            }
        }

            System.out.println(" - Matriz 1 - ");
            
            for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz.length;j++){
                    System.out.print(matriz[i][j] + "  ");                    
                }
                 System.out.println("");
            }

            System.out.println("\n - Matriz 2 - ");

            for(int i=0; i<matriz2.length; i++){
                for(int j=0; j<matriz2.length; j++){
                    System.out.print(matriz2[i][j] + "  ");
                }
                System.out.println("");
            }

            int suma [][] = new int [3][3];
            for(int i=0; i<suma.length; i++){
                for(int j=0; j<suma.length; j++){
                    suma[i][j] = matriz[i][j] + matriz2 [i][j];
                }
            }

            System.out.println("\n - Suma de Matriz - ");

            for(int i=0; i<suma.length; i++){
                for(int j=0; j<suma.length; j++){
                    System.out.print(suma[i][j] + "  ");
                }
                System.out.println("");
            }


    }

}
