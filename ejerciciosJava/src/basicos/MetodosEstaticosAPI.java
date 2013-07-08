/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author jhonfx
 * @since 20/Abril/2011
 * Ejemplo del uso de métodos estáticos de la clase Math que se emplean para realizar
 * operaciones matemáticas, y la clase Thread que se emplea para retardar la ejecución del código
 * 
 */
public class MetodosEstaticosAPI {
    public static void main(String [] o){
        int num = 100;
        try{
            System.out.println("Esperando operacion......");
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("La raiz cuadrada de "+num+" es "+Math.sqrt(num) );

        try{
            System.out.println("Esperando operacion......");
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("La potencia de 2 elevado a 8 es "+Math.pow(2,8));
    }

}
