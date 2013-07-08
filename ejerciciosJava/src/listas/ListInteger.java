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

public class ListInteger {

    public static void main(String[] a) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0, 25);
        list.add(0, 30);
        list.add(0, 59);
        //int total = list.get(0);
        //System.out.println(total);
        System.out.println(list);


        ListInteger li = new ListInteger();
        li.listaString();
        
    }

    public void listaString() {
        Queue<String> list = new PriorityQueue<String>();
        list.add("Ana");
        list.add("Pedro");
        list.add("Juan");
        list.add("Ricardo");
        list.add("Martin");
        list.add("Oswaldo");
        list.add("Daniel");
        //System.out.println(list.poll() + " " + list.poll() + " " + list.poll());
        System.out.println(list.remove() + " " + list.remove() + " " + list.remove());
    }

    
}
