package yasaves;

public class proseso extends Thread {
	
	public proseso (String msg) {
		super(msg);
	}
	
	public void run () {
		while (true) {
			System.out.println(this.getName());
		}
	}
	
}
