/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class Punto {

	int x ,y ;
    static int numPuntos;
    //Inica en 9
    static {
        numPuntos = 9;
    }
    
    //Le aumentamos +1 por el operador ++ = 10
    Punto(){
        numPuntos++;
    }

    static int cuantosPuntos(){
        return numPuntos;
    }

}
