/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listas;

/**
 *
 * @author JhonFx
 */
import java.util.*;

public class Listas {

    public static void main(String [] z){
        List list = new ArrayList();
        list.add("Este");
        list.add("es");
        list.add("un");
        list.add("ejercio");
        list.add("de");
        list.add("listas");
        System.out.println(list);

        Listas l = new Listas();
        l.usarSplit();
    }

    public void usarSplit(){
        String cadena = "Esta,es,una,cadena,con,comas";
        String [] c = cadena.split(",");

        for(int i=0; i<c.length; i++){
            System.out.println(c[i]);
        }
    }
}
