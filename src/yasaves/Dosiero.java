package yasaves;

import java.io.File;
import java.io.IOException;

public class Dosiero {
	
	public static void main(String[] args) throws IOException {
		
		File h = new File("");
		System.out.println(h.getAbsolutePath());
		
		if(h.delete())
			System.out.println("Se borró.");
		else 
			System.out.println("No se borró.");
		
		h.exists();
		h.mkdir();//para crear un directorio
		h.deleteOnExit();
		System.out.println(h.getCanonicalPath());
		System.out.println(System.getProperty("hho"));
		
	}
	
}