/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class VariablesOcultas {
    
    String x = "Variable miembro";

    public static void main(String []i){
        VariablesOcultas v = new VariablesOcultas();
        v.variableOculta();
        v.asignacionVaribles();
    }

    void variableOculta(){
        System.out.println(x);
        {
            String x = "Variable local";
            System.out.println(x);
            System.out.println(this.x);
        }
        System.out.println(x);
    }

    void asignacionVaribles(){
        int i = 300;
        long l = i;

        int il = (int)30000000000L;
        long ll = 30000000000L;

        float f = 4000000.00000F;
        double d = 40000000000.00;


        System.out.println(l);
        System.out.println(il);
        System.out.println(ll);
        System.out.println(f);
        System.out.println(d);
    }

}
