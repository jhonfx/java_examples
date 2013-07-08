package arreglos;

/**
 *
 * @author JhonFx
 */
public class Arreglos {

    public static void main(String [] args){
    double [] v = new double[15];
    double [] w = new double[5];
    
    Arreglos arr = new Arreglos();

    System.out.println(v.length - 1);
    arr.copiaArreglos();
    arr.multidimensional();
    }

    double suma(double [] w){

        double s = 0.0;
        for(int i=0; i<w.length; i++)
            s += w[i];
        
        return s;
    }

    public void copiaArreglos(){
        final int N = 2;
        int v1 [] = new int[N];
        int v2 [] = new int[N];

        for(int j=0; j<N; j++){
            v1[j] = (int)Math.random()*199+1;
            System.out.print(v1[j] + " V1 \n" );
            for(int k=0; k<N; k++){
                v2[k] = v1[k];                
                System.out.print(v2[k] + " V2 \n");
            }
        }
    }


    public void multidimensional(){
        double [][] gr = new double [3][];
        gr[0] = new double [3];
        gr[1] = new double [6];
        gr[2] = new double [9];

        for(int i=0; i<gr.length; i++){
            System.out.print(gr[1][1]);
        }
    }

    public void bidimensional(){
        //float ventas [][] = {{0.,0.,0.},{1.0,1.0},{-1.0}};
    }
}
