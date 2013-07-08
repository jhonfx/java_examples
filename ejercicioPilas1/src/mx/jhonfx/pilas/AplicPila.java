package mx.jhonfx.pilas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maleni
 */
import java.util.Scanner;

public class AplicPila {
    public static void main(String []args){
        Scanner ent = new Scanner(System.in);
        Pila miPila = new Pila();
        int k=1;

        try{
            for(int i=0; i<5; i++){
                System.out.println("Dame el elemnto"+k+";");
                //miPila.meter();
                miPila.meter(ent.nextInt());
                k++;
            }
            System.out.println("Los elementos en la pila son:");
            for(int i=0; i<5; i++){
                System.out.println(miPila.sacar());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Adios... Amigos");

        }
    }

}
