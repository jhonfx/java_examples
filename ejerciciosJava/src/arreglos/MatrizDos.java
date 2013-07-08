package arreglos;

/**
 *
 * @author jhonfx
 */
import java.util.Scanner;
public class MatrizDos {
static final int fil=3;
static final int col=3;

public static void main(String args[]){
    Scanner ent= new Scanner(System.in);
    int [][] arr1=new int [fil][col];
    int [][] arr2=new int [fil][col];

    for(int i=0; i<arr1.length; i++){
     for(int j=0; j<arr1[i].length; j++){
         System.out.println("El numero es: ");
         arr1[i][j]=ent.nextInt();
        }
    }


     for(int i=0; i<arr1.length; i++){
     for(int j=0; j<arr1[i].length; j++){
         arr2[j][i]=arr1[i][j];
        }
    }

    System.out.print(" - Matriz 1 - ");

    for(int i=0; i<arr1.length; i++){
     for(int j=0; j<arr1[i].length; j++){
         System.out.print(arr1[i][j]+ "  ");
        }
     System.out.println("");
    }


    System.out.print("\n - Matriz 2 -");

    for(int i=0; i<arr2.length; i++){
     for(int j=0; j<arr2[i].length; j++){
        System.out.print(arr2[i][j]+ "  ");
        }
     System.out.println("");
    }



    }
}