/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class MetodosEstaticos {

    int x ,y;
    static int numMetodos = 0;

    public static void main(String [] c){
        MetodosEstaticos m = new MetodosEstaticos(10, 30);
        //Cuando se invoca al metodo el valor de numMetodos es de 1 por lo tanto el valor final
        //de numMetodos depende del valor actual mas la suma de los ciclos que tenga el for
        System.out.println(m.cuantosMetodos());
    }
    //numMetodos = 1
    MetodosEstaticos(int a, int b){
        x=a;
        y=b;
        numMetodos++;
    }
    
    static int cuantosMetodos(){
        for(int i=0; i<5; i++){
            numMetodos++;
        }
        return numMetodos;
    }



}
