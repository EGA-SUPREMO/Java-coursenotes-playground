package yasaves;

public class runExe {

	public static void main(String[] args) {
		
		Runtime app = Runtime.getRuntime();
		try {
			app.exec("");
		}catch(Exception e) {
			D.println(e.getMessage());
		}
		
		
	}

}
