package javajavajava;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class date {
	
	public static void main(String[] args) {
		Date d = new Date();
		Calendar c = new GregorianCalendar(); 
		c.setTime(d);

		String dia, mes, año, hora, minuto, segundo;

		dia = Integer.toString(c.get(Calendar.DATE));
		mes = Integer.toString(c.get(Calendar.MONTH));
		año = Integer.toString(c.get(Calendar.YEAR));
		hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
		minuto = Integer.toString(c.get(Calendar.MINUTE));
		segundo = Integer.toString(c.get(Calendar.SECOND));

		System.out.println (hora + ":" + minuto + ":" + segundo + " " + dia + "/" + mes +"/" + año);
	}

}
