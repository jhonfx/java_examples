/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package estructurasControl;

/**
 *
 * @author JhonFx
 */
public class CicloWhile {

    public static void main(String i []){

        //int edad = 18;
        CicloWhile cw = new CicloWhile();
        int edad = cw.sumaEdad();

        while( edad >= 18){
            System.out.println("Tu edad es " + edad);
            System.out.println("Si puedes votar");
            break;
        }
        


    }

    int sumaEdad(){
        int edad = 18;

        for(int i=0; i<3; i++){
            edad--;
            System.out.println(edad);
        }
        return edad+=7;
    }

}
