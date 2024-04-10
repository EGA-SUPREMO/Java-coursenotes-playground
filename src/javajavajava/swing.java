package javajavajava;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import yasaves.D;

public class swing extends JFrame implements WindowListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7284304672637062323L;

	public static void main(String[] args) {
		
		swing s = new swing();
		s.setVisible(true);
		
	}
	
	public swing() {
		
		setLocationRelativeTo(null);
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		graficos g = new graficos();
		g.setBackground(Color.BLUE);
		add(g);
		addWindowListener(this);
		
	}
	

	@Override
	public void windowActivated(WindowEvent arg0) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		D.println("cerrado");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}
	
}

class graficos extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	Image I;
	
	JButton f = new JButton("Soy bien caga palos");
	JButton d = new JButton("Soy bien caga palos PUTOS");
	
	public graficos() {
		
		f.addActionListener(this);
		d.addActionListener(this);
		//this.addWindowListener(this);
		
		add(f);
		add(d);
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		try {
			I = ImageIO.read(new File("src/IP/Sin título.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("mierda" + e.getMessage());
			e.printStackTrace();
		}
		
		g.drawImage(I, 0, 0, null);
		
		for(int i = 0;i<400;i++) {
			
			for(int y = 0;y<600;y++) {
				
				g.copyArea(0, 0, 200, 200, y*I.getHeight(null), i*I.getWidth(null));
				
			}
		
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == f) {
			
			setBackground(Color.RED);
			
		}else{
			
			setBackground(Color.BLUE);
			
		}
		
	}
	
}