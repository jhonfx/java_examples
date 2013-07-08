package arreglos;

/**
 *
 * @author JhonFx
 * @version 23-abril-2011
 * @version 1
 * Programa donde se muestra todos los tipos de datos primitivos en forma de arreglos
 * con datos dummy, se barren y se ejecutan dentro de try-catch  con intervalos de 2
 * segundos cada uno
 * 
 */

public class AllPrimitives extends Thread{

    private int intvalue;
    private String stringvalue;
    private char charvalue;
    private double doublevalue;
    protected boolean booleanvalue;
    public static float floatvalue;
    public static long longvalue;
    public static short shortvalue;
    public static byte bytevalue;

    public final String SALTO = "\n";


    public static void main(String [] y){

        AllPrimitives ap = new AllPrimitives();      
        
        try{
            System.out.println("Array de Enteros");
            sleep(2000);            
            ap.intArray();
            System.out.print(ap.SALTO);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        try{
            System.out.println("Array de Strings");
            sleep(2000);
            ap.stringArray();
            System.out.print(ap.SALTO);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        try{
            System.out.println("Array de Chars");
            sleep(2000);
            ap.charArray();
            System.out.print(ap.SALTO);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        try{
            System.out.println("Array de Dobles");
            sleep(2000);
            ap.doubleArray();
            System.out.print(ap.SALTO);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        try{
            System.out.println("Array de Booleanos");
            sleep(2000);
            ap.booleanArray();
            System.out.print(ap.SALTO);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        try{
            System.out.println("Array de Flotantes");
            sleep(2000);
            ap.floatArray();
            System.out.print(ap.SALTO);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        try{
            System.out.println("Array de Longs");
            sleep(2000);
            ap.longArray();
            System.out.print(ap.SALTO);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        try{
            System.out.println("Array de Shorts");
            sleep(2000);
            ap.shortArray();
            System.out.print(ap.SALTO);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        try{
            System.out.println("Array de Bytes");
            sleep(2000);
            ap.byteArray();
            System.out.print(ap.SALTO);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }


    public int intArray() throws InterruptedException{
        int [] i = {1323432434,298765467,398767912};

        for(int intvalue : i){
            System.out.println(intvalue);            
        }
        return intvalue;
    }

    public String stringArray(){
        String [] s = {"Maleni","Juan","Jose","Ricardo"};

        for(String stringvalue : s){
            System.out.println(stringvalue);
        }

        return stringvalue;

    }

    protected char charArray(){
        char [] c = {'A','B',120,'\u006E','\u005B'};

        for(char charvalue : c){
            System.out.println(charvalue);
        }

        return charvalue;
    }

    private double doubleArray(){
        double [] d = {30.0,50.0,60.0};

        for(double doublevalue: d){
            System.out.println(doublevalue);
        }

        return doublevalue;
    }

    public boolean booleanArray(){

        boolean [] b = {true,false};

        for(boolean booleanvalue: b){
            System.out.println(booleanvalue);
        }

        return booleanvalue;
    }

    protected float floatArray(){
        float [] f = {124234881231231231231231234353766978926.0123f,15.0f,22.0f};

        for(float floatvalue: f){
            System.out.println(floatvalue);
        }

        return floatvalue;
    }

    private long longArray(){
        long [] l = {2323134634441231231L,2468978969876543223L,2876432389909876564L};

        for(long longvalue : l){
            System.out.println(longvalue);
         }

        return longvalue;
    }

    public short shortArray(){
        short [] sh = {3434,15765,19922,9999};

        for( short shortvalue : sh){
            System.out.println(shortvalue);
        }

        return shortvalue;
    }

    public byte byteArray(){
        byte [] by = {13,14,0117,98,88};

        for(byte bytevalue : by){
            System.out.println(bytevalue);
        }

        return bytevalue;
    }

}
