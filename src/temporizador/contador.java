package temporizador;
import java.io.*;
public class contador {

	String tiempoc = "";
	String tiempo = tiempoc;

	
	public void main(String[] args) {

		System.out.println("Escriba cada cuantos minutos de apaga la computadora:");

		int tn=0;
		InputStreamReader in = new InputStreamReader (System.in);
		BufferedReader buffer = new BufferedReader (in);
		
		try {
			tiempoc = buffer.readLine();
			tn = Integer.parseInt(tiempoc);
		}catch (Exception e) {
			System.out.println("Deves escribir un numero .-. o el numero deve ser mayor a 0");
		};

        if (tn > 0){
        	 System.out.println("En "+tn+" minutos se apaga la computadora");
        	} else {
        	if (tn < 0) {
        		System.out.println("");
        	} else {

        	}
        	}
		}

}
