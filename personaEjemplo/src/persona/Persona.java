package persona;

public class Persona {

	/**
	 * @param args
	 */
	private String nombre;
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		p1.setNombre("@jhonFx");
		p2.setNombre("pekeMale");
		
		System.out.println("Persona 1 =>" + p1.getNombre());
		System.out.println("Persona 2 =>" + p2.getNombre());
	}

}
