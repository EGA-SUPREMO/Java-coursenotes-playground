package javajavajava;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class date {
	
	public static void main(String[] args) {
		Date d = new Date();
		Calendar c = new GregorianCalendar(); 
		c.setTime(d);

		String dia, mes, a�o, hora, minuto, segundo;

		dia = Integer.toString(c.get(Calendar.DATE));
		mes = Integer.toString(c.get(Calendar.MONTH));
		a�o = Integer.toString(c.get(Calendar.YEAR));
		hora = Integer.toString(c.get(Calendar.HOUR_OF_DAY));
		minuto = Integer.toString(c.get(Calendar.MINUTE));
		segundo = Integer.toString(c.get(Calendar.SECOND));

		System.out.println (hora + ":" + minuto + ":" + segundo + " " + dia + "/" + mes +"/" + a�o);
	}

}
