package yasaves;

public class hilos {

	public static void main(String[] args) {
		
		Thread HRenderP = new proseso("RenderPrincipal");
		Thread HRenderJ = new proseso("Render de Juegos");
		
		HRenderP.start();
		HRenderJ.start();
		
	}

}
