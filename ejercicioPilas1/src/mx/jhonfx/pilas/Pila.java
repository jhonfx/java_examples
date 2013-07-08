package mx.jhonfx.pilas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maleni
 */
import java.util.*;

public class Pila extends Exception {
    //int [] elem= {1,2,3,4,5,6,7};
    //int [] elemento = {1,2,3,4,5,6,7};
	int [] elemento  = new int[5];
	int [] elem  = new int[5];
    int tope=0;

    public void meter(int i) throws DesbrdamientoPila{
        if(i>=5){
            try{
                throw new DesbrdamientoPila();
            }catch(Exception e){
                System.out.println("Error en la pila");
            }
        }else{
                //elem[tope++]=elemento[0]++;
        		elem[tope++] = elemento[0]++;
                
            }

    }
  
    public int sacar() throws PilaVacia{
        if(tope<=0){
            throw new PilaVacia();
        }else{
            return elem[--tope];
        }
    }

}










