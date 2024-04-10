package yasaves;

public class jhhhhhhhh {

	public static void main(String[] args) {
		
		int y = 6;
		String s = y + "";
		int d = Integer.valueOf(s);
		System.out.println(y+s+d);
		
		popo(true);
		
	}
	
	protected static void popo(String string) {
		System.out.println(string);
	}

	public static void popo() {
		System.out.println("Me dejaste sin argumentos D:");
	}
	
	public static void popo(int y) {
		System.out.println(y);
	}
	
	public static void popo(boolean x) {
		if(x) {
			System.out.println("Soy verdadero :DD");
		}else{
			System.out.println("Soy falso D:");
		}
	}
	
}
