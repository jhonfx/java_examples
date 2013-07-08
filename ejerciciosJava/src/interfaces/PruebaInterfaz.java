/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

/**
 *
 * @author JhonFx
 */
public class PruebaInterfaz {
    
    public static void main(String []g){
        Figura figura = new Cuadrado(5);        
        
        System.out.println(figura.tipoFigura());
        System.out.println("Area: " + figura.area());
        System.out.println("Perimetro: " + figura.perimetro());
    }
}
