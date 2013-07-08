package programadorCertificado;

public class MostatValoresEnum {
	
	enum Direcciones {
		NORTE(4), SUR(2), ESTE(2), OESTE(3);		
		int distancia;
		
		Direcciones (int d) {
			distancia  = d;
		}
		
		int getDistancia(){
			return distancia;
		}
	}
		
	public static void main(String[] args) {
		
		System.out.println(Direcciones.NORTE);
		System.out.println(Direcciones.NORTE.distancia);
	}

}
