/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.jhonfx.interfaces;

/**
 *
 * @author JhonFx
 */
public class InterfaceComoEjemplo {
    public static void main(String [] a){
        Persona p = new Persona();
        p.dormir();
        p.correr();
        p.recibeInterfaz(p);
    }

}
