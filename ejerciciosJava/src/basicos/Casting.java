/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class Casting {

    public static void main(String [] o){
        int x = 15;
        double y , pi = 3.1416;
        x = (int)pi;
        System.out.println(x);


        int a;
        double b,PI = 3.1416;
        a = 5;
        b = a + PI;
        System.out.println(b);
        
        int c;
        float gf,Pi = 3.1416f;
        c = 10;
        gf = c + Pi;
        System.out.println(gf);

    }

}
