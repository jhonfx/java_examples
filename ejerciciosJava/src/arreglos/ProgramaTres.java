/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author jhonfx
 */
public class ProgramaTres {

    public static void main(String []i){
        double articulos [] = new double[10];
        int pMayor = 0;
        int pMenor = 0;
        String listaPrecios = "";


        for(int a=0;a<articulos.length;a++){
            articulos[a]=Double.parseDouble(JOptionPane.showInputDialog("Dame precio de los articulos...."+ " articulo No." +(a+1)));
            if(articulos[a] >= 1.00 && articulos[a] <= 500.00){
                pMenor++;
            }else{
                pMayor++;
            }
            listaPrecios = listaPrecios + articulos[a] + "\n";
        }
        JOptionPane.showMessageDialog(null,"Lista de precios....\n"
                + listaPrecios + "\nPrecios Menores\n" + pMenor
                + "\nPrecios Mayores\n" + pMayor);        
    }

}
