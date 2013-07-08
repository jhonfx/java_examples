package carro;

public class Carro {
	
	private String modelo;
	
	public Carro(String modelo){
		this.modelo = modelo;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public static void main(String[] args){
		Carro c = new Carro("Seat");
		System.out.println("Modelo: " + c.getModelo());
		c.setModelo("Ford");
		System.out.println("Modelo: " + c.getModelo());
	}

}
