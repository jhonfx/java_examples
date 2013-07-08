/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author jhonfx
 * @since 20/Abril/2011
 * Ejemplo sobre el uso de variables static, al crear una variable de tipo static en este
 * caso numHuchas la ocupamos para que esta se incremente cada vez que hacemos una instancia
 * de la clase en este caso la clase Hucha.
 */
public class Hucha {
    static int numHuchas = 0;
    double ahorros = 0.0;

    public static void main(String [] d){
        Hucha hucha1 = new Hucha();
        contarHuchas();
        hucha1.ahorros=2500;
        hucha1.modificarAhorros();

        Hucha hucha2 = new Hucha();
        contarHuchas();
        hucha2.ahorros=5000;
        hucha2.modificarAhorros();

        Hucha hucha3 = new Hucha();
        contarHuchas();
        hucha3.ahorros=6000;
        hucha3.modificarAhorros();

        System.out.println("Numero de Huchas => " +numHuchas);

    }

    public void modificarAhorros(){
        if(ahorros>4000){
            ahorros = ahorros + 1030.72;
            
        }else{
            ahorros = ahorros + 350.67;
        }
        System.out.println("Ahorros = " +ahorros);
    }

    public static int contarHuchas(){
        return numHuchas++;
    }

}
