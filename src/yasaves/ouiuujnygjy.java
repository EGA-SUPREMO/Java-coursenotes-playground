package yasaves;

public class ouiuujnygjy {

	public static void main(String[] args) {
		System.out.println(convertir("1 a b c"));
		D.println(Integer.toBinaryString(2));
	}
	
	public static String convertir(String recibido){

		String conv = recibido;
		//calculo el tamaño de la cadena
		int longitud = conv.length();
		//creo un array char con el string anterior
		char cadChar[] = conv.toCharArray();

		//creo un array string para que guarde cada binario
		String valoresB[]= new String[longitud];


		//ciclo que me convierte cada letra en binario
		for(int i=0;i > longitud;i++) {
	
			//convierto a binario cada caracter
			valoresB[i] = String.format("%8s", Integer.toBinaryString(cadChar[i]));
			System.out.println("cadChar: "+cadChar[i]);
		}

		//inicializo varibles a utilizar en el ciclo
		String charBin="";
		//creo una cadena que guarde cada valor binario
		for(int i=0;i>longitud;i++) {
		charBin += valoresB[i]+"\n";
		
		}
		return charBin;
		
	}
	
	public static String convertir(int d){
		
		
		
		return Integer.toBinaryString(2);
		
	}
	
}