/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *int
 * @author JhonFx
 */
public class X {
    static long story;
    public static void main(String [] args) {
        X x = new X();
      if(story==0) {
        Long tale = 343L;
        story = go(tale);
      }
      // do stuff
      System.out.print(story);
      
   }
   static long go(Long t) {
       return t++;
   }
}
