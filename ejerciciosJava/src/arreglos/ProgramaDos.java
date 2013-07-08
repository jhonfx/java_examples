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
public class ProgramaDos {

    static int TOTAL = 0;

    public static void main(String [] l){

        int alumnos = 5;
        int [] libros = new int[5];        
        int reprobados = 0;
        double promedio = 0.0;
        
        for( int a=0;a<alumnos;a++ ) {
            do {
                try {
                	libros[a]=Integer.parseInt(JOptionPane.showInputDialog("Libros leidos..." + "alumno "+  (a+1)));
                } catch (Exception e) {
					System.out.println(e.getMessage());
				}
                if(libros[a]<3){
                    reprobados++;
                }
                TOTAL = TOTAL + libros[a];
                promedio = TOTAL / 5;
            } while ( libros[a]<=0 || libros[a]>5 );            
        }
        System.out.println("Alumnos reprobados => " + reprobados);
        System.out.println("Total de libros leidos => " + TOTAL);
        System.out.println("Promedio de libros leidos en el grupo => " + promedio);
    }

}
