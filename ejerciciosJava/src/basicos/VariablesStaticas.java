/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author jhonfx
 */


public class VariablesStaticas {

    final int A = 1;
    static final int B = 2;
    public static final int C = 3;

    public void varSuma(){
        int x = 0;
        //a = 4  error ya que al ser final no puede cambiar su valor directamente
        x = A + 5; //pero si se puede usar junto a otras expresiones
        System.out.println(x);//imprime 6
    }

    public static void main(String [] u){

        VariablesStaticas vs = new VariablesStaticas();        

        vs.varSuma();//imprime el valor del metodo varSuma
        System.out.println(B);//imprime el valor de B
        System.out.println(C);// imprime el valor de C
    }

}
