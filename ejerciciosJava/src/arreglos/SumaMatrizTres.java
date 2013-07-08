package arreglos;
import javax.swing.JOptionPane;

public class SumaMatrizTres {

    public static void main(String [] args){
        //int a [][] = {{1,2,3},{1,2,3},{1,2,3}};
        //int b [][] = {{4,5,6},{4,5,6},{4,5,6}};
        int a [][] = new int [3][3];
        int b [][] = new int [3][3];
        int c [][] = new int [3][3];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Fila "+i +"\nColumna"+ j,0));
                b[j][i] = a[i][j];
               }
        }
        
        System.out.println("Arreglo 1 ");

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Arreglo 2 ");

         for(int i=0; i<b.length; i++){
            for(int j=0; j<b.length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("La Suma ");

        for(int fila=0; fila<3; fila++){
            for(int column=0; column<a[fila].length; column++){
                c[fila][column] = 0;
                
                  for(int filab=0; filab<3;filab++){
                      c[fila][column] += a[fila][column] + b[filab][column];
                  }
                System.out.print(c[fila][column] + " ");
            }
            System.out.println(" ");
        }


    }

}
