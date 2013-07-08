/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package herencia;

/**
 *
 * @author JhonFx
 */
public class Middle extends Top{
	
    public Middle(){
        x+=1;
    }

    public static void main(String []u){
        Middle m = new Middle();
        System.out.println(x);

        int y = 0;
        for(; y<11;y++){
            if(y==6){
                y=8;
                break;
            }
            if(y == 3){
                y++;
                continue;
            }
            System.out.print(y + " ");
        }
    }

}
