/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class ScopeExample {
    private int i = 1;

    public void firstMethod(){
        int i = 4, j = 5;
        this.i = i + j;
        secondMethod(7);
    }

    public void secondMethod(int i){
        int j = 8;
        this.i = i + j;
    }    
}
