/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class SobrecargaConstructores {

        int x, y;

        SobrecargaConstructores(int a, int b){
            a = x;
            b= y;
        }
        SobrecargaConstructores(){
            this(0, 0);
        }

        public static void main(String [] t){
            int a = 0;
            int b = 0;
            SobrecargaConstructores sc = new SobrecargaConstructores(a ,b);            
        }
}
