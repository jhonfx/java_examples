/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author jhonfx
 */
public class Ejemplo {   
	//Suma la variable statica usuarios cada que se crea un nuevo objeto de la clase Usuario
    public static void main(String []f){
        Usuario uno = new Usuario();
        Usuario dos = new Usuario();
        System.out.println("Hay " + uno.usuarios + " usuarios" );
    }

}
