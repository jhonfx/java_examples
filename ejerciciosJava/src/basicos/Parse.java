/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class Parse {

    public static void main(String [] args){
        Parse p = new Parse();
        int uno = 1;
        String dos = "2";
        int suma = 0;

        suma = uno + Integer.parseInt(dos);
        System.out.println(suma);
        p.mensaje();

    }

    public void mensaje(){
        int sueldo = 6000;
        String mensaje = "Tengo un sueldo de ";

        mensaje = mensaje + sueldo;
        System.out.println(mensaje);

    }

}
