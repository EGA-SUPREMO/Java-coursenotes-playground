package eraroj;

public class Erarego {
	
	
	public static void main(String[] args) throws Exception {/*Quiero avisar a los programadores que mi programa puede
		crear una excepci�n.*/
		try {
			throw new Exception();//Quiero crear un excepci�n :D
		}catch (Exception e) {
			System.out.println("Me ejecuto en caso de que el programa no pueda crear una excepci�n");
		}finally {
			System.out.println("Siempre me ejecuto, soy la ultima esperanza... :D");
		}
	}
	
}
