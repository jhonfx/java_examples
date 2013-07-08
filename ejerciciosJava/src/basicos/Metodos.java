/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class Metodos {

    public static void main(String [] o){
        int a = 50;
        int b = 50;
        Metodos m = new Metodos();
        System.out.println(m.sumaEnteros(a, b));
    }

    int sumaEnteros(int a, int b){
       int c = a + b;
       return c;
    }
}
