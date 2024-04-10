package yasaves;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class Grafiko extends JFrame {
	
	final double[] kvant;
	final int LIM;//Limo de la array kvant
	Canvas c = new Canvas();
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		//new JFrame().setVisible(true);
		new Grafiko().setVisible(true);
	}
	
	public Grafiko() {
		LIM = 1024;
		kvant = new double[LIM];
/*		for(int i = 0; i<LIM;i++)
			kvant[i] = Math.sqrt(i);*/
		
		setKvant(kvant, 0);
		
		for(double i:kvant)
			System.out.println(i);
		
		if(AgordFenestrn())
			AgordFenestrn();
	}
	
	private boolean AgordFenestrn() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		c.setPreferredSize(new Dimension(700, 1000));
		add(c, BorderLayout.CENTER);
		c.addKeyListener(null);
		c.requestFocus();
		c.paint(null);
		montr(null);
		pack();
		setLocationRelativeTo(null);
		
		return false;
		
	}
	
	private void montr(Graphics g) {if(g !=null)
		for(int i = 0; i<LIM;i++)
			g.drawLine((int) kvant[i], i, (int) kvant[i], i);
		//g.dispose();
	}
	
	private void setKvant(double[] kvant, int i) {
		if(i >= LIM)
			return;
		
		kvant[i] = Math.sqrt(i);
		setKvant(kvant, i + 1);
	}
	
}