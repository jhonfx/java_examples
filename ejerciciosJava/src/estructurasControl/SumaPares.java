/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package estructurasControl;

/**
 *
 * @author JhonFx
 */
public class SumaPares {

    public static void main(String [] args){
        SumaPares sum = new SumaPares();

        int suma = 0;
        int maximo = 50;

        System.out.println("Los numeros pares son: ");
        for(int i=10; i<maximo; i++){
            if(i%2==0){
                suma +=i;
                System.out.print(i+ "\n");
            }
        }
        System.out.print("La suma de los numeros pares es " + suma + "\n");
        System.out.print("--------"+ "\n");
        sum.sumaPares();
    }

    public void sumaPares(){
        int suma = 0;
        for(int i=10; i<=12; i++){
            if(i%2==0){
            suma += i;
            System.out.println(i + "\t");
           }
        }
        System.out.println("La suma de los pares es " + suma);
    } 

}
