/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class TestFinal extends Final{

    public static void main(String []y){
        final Final f = new Final();
        f.setNombre("Paco");
        f.setNombre("Rafa");
        final Final fn = new Final();
        fn.setNombre("x2");

        System.out.println(f.getNombre());
        System.out.println(fn.getNombre());

    }

}
