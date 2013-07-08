package arreglos;
/**
 *
 * @author JhonFx
 */
import javax.swing.JOptionPane;
public class Vocales {

    public static void main(String [] y){
        
        String [] vocal = new String[5];
        

        for(int i=0;i<vocal.length;i++){
            vocal[i]=JOptionPane.showInputDialog(null,"Teclea las vocales");
            if(vocal[i].length()>1){
            	System.out.println("debe ser solo 1 letra!");
            	i--;
            }
        }
        for(String list : vocal){
            System.out.println(list);            
        }
        System.out.println("Total de vocales " +vocal.length);
    }

}
