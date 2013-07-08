/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class Statics2 {

        static int j =4;
        static int k=2;
        static int m=2;

        {
            k=3;
        }

        static{
            m=k%j;
        }

        public static void main(String d[]){
            System.out.printf("%d %% %d = %d",k,j,m);
        }

        static{
            j=4;
        }
}
