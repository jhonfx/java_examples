/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 * 
 *
 */
public class Cadenas {

    public static void main(String args[]){
            String base="Cadena Base";

            System.out.println(base.length());
            System.out.println(base.toUpperCase());
            System.out.println(base.toLowerCase());
            System.out.println(base.charAt(5));
            System.out.println(base.indexOf('e'));
            System.out.println(base.equals("Cadena base"));
            System.out.println(base.equalsIgnoreCase("CAdEnA bAse"));
            System.out.println(base.trim().charAt(4));
            System.out.println(base.substring(0, 5));
	}
}
