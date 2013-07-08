package herencia;

public class Futbolista extends Deportista{
	
	private String posicion;
	
	public String getDatos(){
		return "Futbolista: " + nombre + ", " + posicion;
	}
	
	public void setPosicion(String posicion){
		this.posicion = posicion;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Futbolista f = new Futbolista();
		f.setNombre("Lionel Messi");
		f.setPosicion("Delantero");
		System.out.println(f.getDatos());

	}

}
