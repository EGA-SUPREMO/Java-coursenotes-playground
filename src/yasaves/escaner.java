package yasaves;

import java.util.Scanner;

public class escaner {
	
	static String v = "Estos son los valores: ...";
	static String comandos = "hola: Para saludarme y sentirme feliz :D.\nayuda o ?: Para saber los comandos.\ndebut: ... \nmodo oculto: Para saber todo lo que hace el usuario.\nvalores: Para saber todos los valores del juego.\nsalir: Para salir.\n";
	static boolean w = true;
	
	public static void main(String[] args) {
		
		System.out.println("Escribe \"ayuda\" o \"?\" para saber los comandos");
		
		while(w) {
			
			lector();
		
		}
	}
	
	public static void lector() {
		
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext()) {
			
			String d = "" + s.next();
			switch (d) {
			
			case "ayuda":
				
				System.out.println(comandos);
			
				break;
				
			case "?":
				
				System.out.println(comandos);
				
				break;
				
			case "hola":
				
				System.out.println(":D ahora estoy feliz, gracias");
				
				break;
				
			case "debut":
				
				System.out.println("...");
				
				break;
				
			case "valores":
				
				System.out.println(v);
				
				break;
				
			case "salir":
				
				w = false;
				
				break;
				
			
			default:
			
				System.out.println("Escribe \"ayuda\" o \"?\" para saber los comandos");
				
				break;
			
			}
			
			break;
		}
	}
	
}
