package programadorCertificado;

import java.util.Calendar;

public class PruebaCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		String fecha = "";
		fecha += cal.get(Calendar.DAY_OF_MONTH) + "/";
		fecha += cal.get(Calendar.MONTH) + 1 + "/";
		fecha += cal.get(Calendar.YEAR);
		System.out.println("hoy es " + fecha);

	}

}
