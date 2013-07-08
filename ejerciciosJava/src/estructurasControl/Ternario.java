package estructurasControl;

public class Ternario {
	
	public static void main(String[] args){
		String n = "No";
        String s = "Si";

        int cambio = 150;
        String respuesta;

        respuesta = cambio > 10 ? s : n;
        System.out.println(respuesta);
	}
}
