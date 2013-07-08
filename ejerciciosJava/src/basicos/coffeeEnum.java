/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author jhonfx
 */
enum CoffeeSize{
    GRANDE,
    ENORME,
    IRRESSISTIBLE
}

class Coffee{
    CoffeeSize size;
}

public class coffeeEnum {

        public static void main(String [] d){

            Coffee drink = new Coffee();
            drink.size = CoffeeSize.GRANDE;
            System.out.println("Tu cafe es: " + drink.size);

            System.out.println("Los tipos de cafes son:");
            for(CoffeeSize tipos: drink.size.values()){
                System.out.println(tipos.name()+' ');
            }
        }
}
