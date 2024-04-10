package eraroj;

public class Erarego {
	
	
	public static void main(String[] args) throws Exception {/*Quiero avisar a los programadores que mi programa puede
		crear una excepción.*/
		try {
			throw new Exception();//Quiero crear un excepción :D
		}catch (Exception e) {
			System.out.println("Me ejecuto en caso de que el programa no pueda crear una excepción");
		}finally {
			System.out.println("Siempre me ejecuto, soy la ultima esperanza... :D");
		}
	}
	
}
