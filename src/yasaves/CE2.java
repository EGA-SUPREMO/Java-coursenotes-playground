package yasaves;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.*;

@SuppressWarnings("serial")
public class CE2 extends JFrame {//Carpetas Estrutura
	/*Internal*/
	static int x = 0;
	static int y = 750;
	static int x2 = 100;
	static int y2 = 0;
	static int x3 = 50;
	static int xa = 100;
	static int ya = 100;
	

		private static void moveBall() {
			if (x + xa < 0)
				xa = 10;
			if (x + xa > 1350 - 700)
				xa = -10;
			if (y + ya < 0)
				ya = 10;
			if (y + ya > 850 - 50)
				ya = -10;
			
			x = x + xa;
			y = y + ya;
		}
	

	
	public static void  main(String[] args) throws InterruptedException {
//modo facil
/*cb=carpetas buenas cm=carpetas malas*/
		CE2 frame = new CE2();
		frame.setVisible(true);
		
		while (true) {
			moveBall();
			x2 = x2+1;
			y2 = y2+1;
			x3 = x3+1;
			
			Thread.sleep(1);
		}

		

	}




	

		/**
		 * Create the frame.
		 */
	
	public void paint(Graphics g) {
		//Object Graphics2D;
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(83, 179, 204));
		g2d.fillOval(x2, y2, 100, 100);
		Graphics2D G2d = (Graphics2D) g;
		G2d.setColor(new Color(0, 137,0 ));
		G2d.fillRect(x, y, 700, 50);
		
		Graphics2D G3d = (Graphics2D) g;
		G3d.setColor(Color.pink);
		G3d.fillOval(x3, y2, 100, 400);
		G3d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		G3d.dispose();
		g2d.dispose();
		G2d.dispose();
		repaint();
	}
	
	public CE2() {
		setBounds(0, 0, 1350, 850);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel CP = new JPanel();
		
		}	
	}




		
		
	
	
