/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class Glass {

    private int result = 0;

    public static void main(String args []){

        Glass g = new Glass();
        int result = g.sumaFactores();
        System.out.println(result);

        int z =5;
        if(++z > 5 || ++z > 6)z++;
        System.out.println(z);

        int x =5;
        if(++x > 5 | ++x > 6)z++;
        System.out.println(x);
    }

    static{
        System.out.println("6");
    }

    static{
        System.out.println("5");
    }

    int sumaFactores(){
        int a = 7;
        int b = 3;
        int c = 0;
        c = a + b;
        return c;
    }



}
