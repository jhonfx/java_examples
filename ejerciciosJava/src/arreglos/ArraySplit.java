package arreglos;
import javax.swing.JOptionPane;


/**
 *
 * @author JhonFx
 */
public class ArraySplit {

    public static void main(String [] args){

        String mensaje = "estes,es,un,mensaje,separado,por,comas";
        String c [] = mensaje.split(",");
        String cadena = "";
        char [] b = {'a','b','c','d'};

        cadena=JOptionPane.showInputDialog("Pon un mensaje con comas (,)");
        String a [] = cadena.split(",");

        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }

        System.out.println("---------");
        for(int i=0;i<c.length;i++){            
            System.out.println(c[i]);
        }

        System.out.println("---------");
        for(int j=0;j<b.length;j++){
            System.out.println(b[j]);
        }

    }

}
