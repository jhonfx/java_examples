package itarator;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
			arrayList.add("1");
			arrayList.add("2");
			arrayList.add("3");
			arrayList.add("4");
			arrayList.add("5");
			arrayList.add("6");
			
		Iterator<String> i = arrayList.iterator();
		
		while(i.hasNext()) {
			System.out.println("Elemento del arreglo: " + i.next());
		}
		
			arrayList.add("7");
			arrayList.add("8");
			arrayList.add("9");
		
		for (String recorrer : arrayList) {
			System.out.println("Elemento del arreglo con un for-each: " + recorrer);
		}
	}

}
