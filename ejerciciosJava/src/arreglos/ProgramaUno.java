/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author JhonFx
 */
public class ProgramaUno {

    public static void main(String []g){
        int num [] = new int[5];
        int cuantos = 0;
        int suma = 0;
        int numerosBuenos = 0;
        int numerosMalos = 0;        
        String total = "";
        
        for(int i = 0; i<num.length; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Dame 5 numeros " + i));
                if(num[i] > 5 && num[i] < 500){                    
                    numerosBuenos++;
                }else{
                    numerosMalos++;
                }if((num[i]%5) == 0){
                    cuantos++;
                }
                suma = suma + num[i];
                total = total + num[i] + "\n";

            }       
        JOptionPane.showMessageDialog(null, total);
        System.out.println("La suma de todos los numeros es: " + suma);
        System.out.println("Total de numeros entre el rango [ " + numerosBuenos + " ]");
        System.out.println("Total de numeros que salen del rango [ " + numerosMalos + " ]");
        System.out.println("El total de numeros multiplos de 5 son: " + cuantos);
    }
}
