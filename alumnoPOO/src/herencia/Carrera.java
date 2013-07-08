package herencia;

public class Carrera extends Alumno{
	private String nombreCarrera;
	
	public Carrera(String nombre, String nombreCarrera){
		super(nombre);
		this.nombreCarrera = nombreCarrera;
	}
	
	public String getDatos(){
		return "Alumno: " + nombre + ", " + nombreCarrera;
	}
	
	public static void main(String[] args){
		Carrera c = new Carrera("Juan Purata", "Sistemas Informaticos");
		System.out.println(c.getDatos());
	}

}
