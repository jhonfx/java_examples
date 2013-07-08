/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.jhonfx.interfaces;

/**
 *
 * @author JhonFx
 */
public class Persona implements CapacidadesHumanas {
    

    void recibeInterfaz( CapacidadesHumanas ch){
        ch.caminar();
        ch.correr();
    }

    void dormir(){
        System.out.println("durmiendo... como persona");
    }

    public void correr(){
        System.out.println("corriendo");
    }

    public void caminar(){
        System.out.println("caminando...");
    }


}
