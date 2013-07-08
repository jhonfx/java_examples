/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package estructurasControl;

/**
 *
 * @author JhonFx
 */
import java.awt.*;
import java.util.*;
import javax.swing.JOptionPane;
public class Ventas {

    public static void main(String [] args){
        int [] ventas = new int [5];
        int menor = 0;
        int medio = 0;
        int mayor = 0;

        for(int i=0;i<ventas.length;i++){
        ventas[i]=Integer.parseInt(JOptionPane.showInputDialog(ventas[i]));
            if(ventas[i] <= 200){
                menor++;
            }if(ventas[i] > 200 && ventas[i] < 400){
                medio++;
            }if(ventas[i] > 400){
                mayor++;
            }
        }
            System.out.println("Ventas menores a 200: " +menor);
            System.out.println("Ventas entre 200 y 400: " +medio);
            System.out.println("Ventas mayores a 400: " +mayor);






    }
}
