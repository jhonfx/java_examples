/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package basicos;

/**
 *
 * @author JhonFx
 */
public class MetodosStatic {
		
		//Permitido
        static{
                System.out.print("6");
        }
        
    	//Permitido
        static{
		System.out.print("5");
	}
        
        //Fail 
        {
		System.out.print("4");
	}

        static{
		System.out.print("3");
	}

        {
                System.out.println(7);

        }

        static/*
		System.out.print("7");
            */
    
        public void main(String ... d){
		System.out.print("1");
                int _hi=6;

                System.out.print(_hi);
	}

        static{
		System.out.print("2");
	}

        void doStuff(int [] intArgs){

        }
}
