/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fechas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author jhonfx
 */
public class Fechas {

    public Fechas(){
        /**
         * Objeto Calendar para el manejo de fechas
         */
        Calendar calendar = new GregorianCalendar();
        String dia = Integer.toString(calendar.get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(calendar.get(Calendar.MONTH) + 1);
        String anho = Integer.toString(calendar.get(Calendar.YEAR));
        System.out.println(dia +"-"+ mes +"-"+ anho);
    }

    public static void main(String  [] a) throws Exception{
        /**
         * Ejecución del Constructor 
         */
        new Fechas();
        /**
         * Clase Date para el manejo de fechas
         */
        Date date = new Date();
        String finalDate = date.toLocaleString().substring(0, 10);
        System.out.println(finalDate);

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String cadenaFecha = formato.format(date);

        DateFormat dataformat = DateFormat.getDateInstance(DateFormat.LONG);
        String s4 = dataformat.format(date);

        //Valor de la fecha en long
        long longDate = date.getTime();
        //System.out.println(longDate);
        
        //Valor de 1 día en long
        long dia = 1 *(24*60*60*1000);
        //System.out.println(dia);
        
        Date anotherDate = new Date(longDate + dia);
        String formatFecha = formato.format(anotherDate);
        System.out.println(formatFecha);
        
    }

}
