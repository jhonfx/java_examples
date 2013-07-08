/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class InvocaPunto {

    public static void main(String [] h){
        //numPuntos toma el valor final que se le asigno desde la clase Punto(11)
        Punto p = new Punto();
        //Se aumenta 1 mas = 12
        Punto.numPuntos++;
        //Se aumentan 4 mas = 15
        Punto.numPuntos+=4;
        System.out.println(Punto.cuantosPuntos());

    }




}
