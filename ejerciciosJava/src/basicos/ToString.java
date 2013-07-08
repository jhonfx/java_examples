/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

import java.util.Date;

/**
 *
 * @author JhonFx
 */
public class ToString {

    public static void main(String []i){
        Date now = new Date();
        int x = 87;
        String y = "13";
        int total;

        System.out.println(now);
        System.out.println(now.toString());
        total = x + Integer.parseInt(y);
        System.out.println(total);


        //Autoboxing de datos primitivos
        int pInt = 420;
        System.out.println(pInt);
        Integer wInt = pInt;
        System.out.println(wInt);
        int p2 = wInt;
        System.out.println(p2);

        ToString ts = new ToString();
        ts.valorIgual();
    }



    public ToString(){

        String a = "1";
        String b = "2";
        String c = "3";
        String d = "1";


        if(a.equals(b)){
            System.out.println("A y B Son iguales");
        }else if(a.equals(c)){
            System.out.println("A y C Son iguales");
        }else if(a.equals(d)){
            System.out.println("A y D Son iguales");
        }
    }

    public void valorIgual(){
        
        String a = "1";
        String b = "2";
        String c = "3";
        String d = "1";


        if(a.equals(b)){
            System.out.println("A y B Son iguales");
        }else if(a.equals(c)){
            System.out.println("A y C Son iguales");
        }else if(a.equals(d)){
            System.out.println("A y D Son iguales");
        }
    }

}
