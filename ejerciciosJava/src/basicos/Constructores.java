/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class Constructores {

    public Constructores(){
        System.out.println("Contructor generico");
    }

    public Constructores(String tipo){
        System.out.println("Constructor con una variable tipo [" + tipo + "]");
    }

    public Constructores(int otrotipo){
        System.out.println("Constructor con otra variable de otro tipo int [" + otrotipo + "]");
    }

    public Constructores(int otrotipo, String tipo){
        System.out.println("Constructor con 2 variables una de tipo int [" + otrotipo + "] y la otra de tipo [" + tipo + "]");
    }

    public static void main(String []i){
        Constructores c1 = new Constructores();
        Constructores c2 = new Constructores("String");
        Constructores c3 = new Constructores(10);
        Constructores c4 = new Constructores(10, "String");

    }

}
