/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

import javax.swing.JOptionPane;

/**
 *
 * @author JhonFx
 */
public class MayorMenor {

    public static void main(String [] a){
        int numeros [] = new int[3];
        for(int i=0;i<numeros.length;i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Dame un numero"));
        }  
        
            if(numeros[0] > numeros[1] && numeros[0] > numeros[2]){
                System.out.print(numeros[0] +" "+  numeros [1] +" "+ numeros [2]);          
            }else if(numeros[0] > numeros[1] && numeros[0] < numeros[2]){
                System.out.print(numeros[2] +" "+ numeros[0] +" "+ numeros[1]);
            }

               
    }

}
