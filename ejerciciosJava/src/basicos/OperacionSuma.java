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
public class OperacionSuma {

    public static void main(String [] ar){
        int num1 = 0;
        int num2 = 0;

        num1=Integer.parseInt(JOptionPane.showInputDialog("Dame 1 numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Dame otro numero"));

        System.out.println("La suma de los numeros es: "+ (num1 + num2));

    }
}
