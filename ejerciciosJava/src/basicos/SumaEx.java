/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class SumaEx {
    public static void main(String d [] ){
        boolean x = true;
        boolean y = false;
        int z = 42;
        int j = 34;

        if((j == z) && (y = true))  z++;
        if((y == true) || (++z == 44)) z++;

        System.out.println("z = " + z);
    }


}
