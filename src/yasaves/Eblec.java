package yasaves;

/*import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.image.BufferStrategy;*/

import java.util.Random;

/*import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;*/

public class Eblec/* extends JFrame implements WindowFocusListener*/ {
	
//	private static final long serialVersionUID = 1L;
	
//	private static final String TITOL = "Vetoj";
	
	private Random r = new Random();
	
	private static final int LIM = 13000000;
	
	private int[] hazardnombrjDue = new int[LIM];
	private int[] hazardnombrjTrie = new int[LIM];
	
	private int[] hazardnombrjDue1 = new int[LIM];
	private int[] hazardnombrjTrie1 = new int[LIM];
	
	private double[] kvantilpocentDeIli = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	private double[] kvantilpocentDeUnu = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	
//	private JLabel pocentEgualec = new JLabel("Pocento da egueleco de du variebloj de du statoj:");
//	private JLabel pocentEgualec1 = new JLabel("Pocento da egueleco de du variebloj de tri statoj:");
	
//	private JLabel[] pocentj = new JLabel[4];
	
//	private JButton rekalkuli = new JButton("Rekalkuli");
	
//	private Canvas canvas = new Canvas();
	
	public static void main(String[] args) {
		//new Eblec().setVisible(true);
		new Eblec();
	}
	
	private Eblec() {
		
		definigad();

		komparad(hazardnombrjDue, hazardnombrjDue1, 0);
		komparad(hazardnombrjTrie1, hazardnombrjTrie, 2);
		komparad(hazardnombrjTrie, hazardnombrjTrie1, 1);
		
		komparad(hazardnombrjDue, 1, 0);
		komparad(hazardnombrjDue1, 1, 1);
		

		komparad(hazardnombrjTrie, 1, 2);
		komparad(hazardnombrjTrie1, 1, 3);
		komparad(hazardnombrjTrie, 2, 4);
		komparad(hazardnombrjTrie1, 2, 5);
		
		komparad(hazardnombrjDue, 6);
		komparad(hazardnombrjTrie, 7);
		
		//montr();

		System.out.println("Inter du hazardaj du-stataj variebloj: " + (kvantilpocentDeIli[0]/100000) + "%");
		System.out.println("Inter du hazardaj du-stataj variebloj: " + (kvantilpocentDeIli[2]/100000) + "%");
		System.out.println("Inter du hazardaj tri-stataj variebloj: " + (kvantilpocentDeIli[1]/100000) + "%");

		System.out.println("Inter unu de la unua du-stata varieblo: " + (kvantilpocentDeUnu[0]/100000) + "%");
		System.out.println("Inter du de la unua du-stata varieblo: " + (100 - (kvantilpocentDeUnu[0]/100000)) + "%");
		
		System.out.println("Inter unu de la dua du-stata varieblo: " + (kvantilpocentDeUnu[1]/100000) + "%");
		System.out.println("Inter du de la dua du-stata varieblo: " + (100 - (kvantilpocentDeUnu[1]/100000)) + "%");
		
		System.out.println("Inter unu de la unua tri-stata varieblo: " + (kvantilpocentDeUnu[2]/100000) + "%");
		System.out.println("Inter du de la unua tri-stata varieblo: " + (kvantilpocentDeUnu[3]/100000) + "%");
		System.out.println("Inter tri de la unua tri-stata varieblo: " + (100 - ((kvantilpocentDeUnu[2] + kvantilpocentDeUnu[3])/100000
				)) + "%");
		
		System.out.println("Inter unu de la dua tri-stata varieblo: " + (kvantilpocentDeUnu[4]/100000) + "%");
		System.out.println("Inter du de la dua tri-stata varieblo: " + (kvantilpocentDeUnu[5]/100000) + "%");
		System.out.println("Inter tri de la dua tri-stata varieblo: " + (100 - ((kvantilpocentDeUnu[4] + kvantilpocentDeUnu[5])/100000)
				) + "%");
		
		System.out.println();

		System.out.println("Inter antauxa nombro de la unua tri-stata varieblo: " + (kvantilpocentDeUnu[6]/100000) + "%");
		System.out.println("Inter antauxa nombro de la unua tri-stata varieblo: " + (kvantilpocentDeUnu[7]/100000) + "%");
		
	}
	
/*	private void montr() {
		
		final BufferStrategy bufer = canvas.getBufferStrategy();
		
		if(bufer==null) {
			canvas.createBufferStrategy(4);//mi havas taskon relatita al tio
			return;
		}
		
		final Graphics g = bufer.getDrawGraphics();
		
//		final int angul = kvantilpocentDeIli[0]/LIM*360;
		
//		g.fillArc(10, 10, 50, 50, 0, angul);
//		g.fillArc(10, 10, 50, 50, angul, -angul-360);
		
		
		add(rekalkuli);
		add(pocentEgualec);
		add(pocentEgualec1);
		
		g.dispose();
		
	}*/
	
	private void komparad(final int[] nombrj, final int[] nombrj1, final int indic) {
		for(int i = 0; i < nombrj.length;i++)
			if(nombrj[i] == nombrj1[i])
				kvantilpocentDeIli[indic]++;
	}

	private void komparad(final int[] nombrj, final int indic) {
		if(nombrj[0] == nombrj[0])
			kvantilpocentDeUnu[indic]++;
		for(int i = 1; i < nombrj.length;i++)
			if(nombrj[i] == nombrj[i-1])
				kvantilpocentDeUnu[indic]++;
	}
	
	private void komparad(final int[] nombrj, final int nombrPorKompari, final int indic) {
		for(int i = 0; i < nombrj.length;i++)
			if(nombrj[i] == nombrPorKompari)
				kvantilpocentDeUnu[indic]++;
	}
	
	private void definigad() {
		
/*		setTitle(TITOL);
		setSize(850, 580);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		addWindowFocusListener(this);*/
		
		for(int i = 0; i < hazardnombrjDue.length;i++)
			hazardnombrjDue[i] = r.nextInt(2);
		
		for(int i = 0; i < hazardnombrjTrie.length;i++)
			hazardnombrjTrie[i] = r.nextInt(3);
		
		for(int i = 0; i < hazardnombrjDue1.length;i++)
			hazardnombrjDue1[i] = r.nextInt(2);
		
		for(int i = 0; i < hazardnombrjTrie1.length;i++)
			hazardnombrjTrie1[i] = r.nextInt(3);
		
/*		pocentj[0] = new JLabel("Pli da pocentoj de la unua variebloj:");
		pocentj[1] = new JLabel("Pli da pocentoj de la dua variebloj:");
		pocentj[2] = new JLabel("Pli da pocentoj de la tria variebloj:");
		pocentj[3] = new JLabel("Pli da pocentoj de la kvara variebloj:");*/
		
		//canvas.setPreferredSize(new Dimension(450, 210));
		
		//add(canvas);
		
	}
	
/*	@Override
	public void windowGainedFocus(WindowEvent e) {
		setTitle(TITOL);
	}
	
	@Override
	public void windowLostFocus(WindowEvent e) {
		setTitle("Esperanto estas la plej bona lingvo de la mondo tuta, ecx pli bona ol Ido!");
	}*/
	
}