package arreglos;

public class AdvanceArrays {
	
	public static int[] demo;

    public AdvanceArrays(){

    }

    public static void main(String [] a){
                    
        demo = new int[10];
        demo[0] = 70;
        addArreglo(90);
        addArreglo(80);
        System.out.println(Integer.toString(demo.length));
    }

    public static void addArreglo(int arreglo){
        int tamano = demo.length;
        int[] n_demo = new int[tamano +1];

        for(int n=0; n< tamano; n++){
            n_demo[n] = demo[n];
        }

        n_demo[tamano] = arreglo;
        demo = n_demo;
    }

}
