/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class Test2 {

    public static void main(String []a){

        boolean x = true;
        boolean y = false;
        short z = 42;
        short j = 34;


        if((x == true)&& (y=true)) z++;
        if((y == true) || (++z==44))z++;        

        System.out.println(y);
        System.out.println("z=" +z);
    }

    public static void comparaciones(){
        boolean x = true;
        boolean y = false;

        short z =42;
        int j=34;

        if((z == z)&&(y = true))z++;
    }
    

}
