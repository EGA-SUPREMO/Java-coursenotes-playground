package yasaves;

public class popoggg {
	
	static final boolean[] a = {false,false,false};
	static boolean[] b = {true,true};
	
	
	public static void main(String[] args) {
		
		System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + b[0] + " " + b[1]);
		b = a;
		System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + b[0] + " " + b[1] + " " + b[2]);
		
	}

}
