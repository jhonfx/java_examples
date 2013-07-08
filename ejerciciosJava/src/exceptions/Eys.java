/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author JhonFx
 */
public class Eys {

    public static void main(String [] h){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea = null;
        try{
            linea = br.readLine();
        }catch(Exception e){
            System.out.println(e.getCause());
        }
        System.out.println(linea);
    }
}
