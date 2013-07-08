/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package estructurasControl;

import javax.swing.JOptionPane;

/**
 *
 * @author JhonFx
 */
import javax.swing.*;
public class DiasSemana {
    public static void main(String [] s){
        int dia = 0;
    
        dia=Integer.parseInt(JOptionPane.showInputDialog(null,"Dame un numero"));
        if(dia<0 && dia >7){
            JOptionPane.showMessageDialog(null,"Numero fuera del rango de dias de la semana" );
        }else if(dia == 1){
            JOptionPane.showMessageDialog(null,"Lunes" );
        }else if(dia == 2){
            JOptionPane.showMessageDialog(null,"Martes" );
        }else if(dia == 3){
            JOptionPane.showMessageDialog(null,"Miercoles" );
        }else if(dia == 4){
            JOptionPane.showMessageDialog(null,"Jueves" );
        }else if(dia == 5){
            JOptionPane.showMessageDialog(null,"Viernes" );
        }else if(dia == 6){
            JOptionPane.showMessageDialog(null,"Sabado" );
        }else if(dia == 7){
            JOptionPane.showMessageDialog(null,"Domingo" );
        }
        
    }






}
