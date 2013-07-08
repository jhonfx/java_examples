/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package collection;

/**
 *
 * @author JhonFx
 */

import java.util.HashMap;
import java.util.Map;

public class TypeErasure {

    public TypeErasure(){

    }

    public static void main(String [] f){
        Map<String, String> map = new HashMap<String, String>();
        map.put("1954", "FORTRAN");
        map.put("1958", "LIPS");
        map.put("1959", "COBOL");
        String lenguage = map.get("1958");
        System.out.println("Tu lenguaje favorito es: " +lenguage);

        TypeErasure te = new TypeErasure();
        te.firstHashMap();
    }

    public static void firstHashMap(){
        Map map = new HashMap();
        map.put("1954", "FORTRAN");
        map.put("1958", "LIPS");
        map.put("1959", "COBOL");
        String lenguage = (String)map.get("1954");
        System.out.println((new StringBuilder("Tu lenguaje favorito es: ")).append(lenguage).toString());
    }

}
