package yasaves;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

public class Ludo extends Canvas implements WindowFocusListener, Runnable {
	
	private static final long serialVersionUID = 1L;
	
	private int x = 0, y = 0;
	private static final int LARGXO = 1000, ALTECO = 600;
	private static int fps = 0, aps = 0;
	
	final int LIM = 1024;//Limo de la array kvant
	final double[] kvant = new double[LIM];
	
	private volatile static boolean cxsxaltas = false;// por ke du "thread"-oj ne ŝanĝu ĝin samtempe
	
	private final static String TITOLO = "La atakoj de tankoj";
	private final static String TITOLO1 = "Esperanto estas la plej bona lingvo en la tuta mondo, eĉ pli bona ol Ido!";
	private static String APS = "", FPS = "";
	
	public static JFrame f;
	private static Thread thr;
	
	public static void main(String[] args) {
		Ludo e = new Ludo();
		e.eki();
	}
	
	private Ludo() {
		
		addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()){
					case KeyEvent.VK_A:
						x--;
						break;
					case KeyEvent.VK_D:
						x++;
						break;
					case KeyEvent.VK_W:
						y--;
						break;
					case KeyEvent.VK_S:
						y++;
						break;
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		setPreferredSize(new Dimension(LARGXO, ALTECO));
		
/*		for(int i = 0; i<LIM;i++)
			kvant[i] = Math.sqrt(i);*/
		
		setKvant(kvant, 0);
		
		f = new JFrame(TITOLO);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.addWindowFocusListener(this);
		f.setLayout(new BorderLayout());
		f.add(this, BorderLayout.CENTER);
		f.pack();
		
		f.setLocationRelativeTo(null);
		
		f.setVisible(true);
		
	}
	
	private synchronized void eki() {
		cxsxaltas = true;
		thr = new Thread(this, "Grafikoj");
		
		thr.start();
	}
	
	@SuppressWarnings("unused")
	private synchronized void fini() {
		
		cxsxaltas = false;
		
		try {
			thr.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	private void montri() {//tio ĝisdatigas la varieblojn, faras operaciojn, ktp.
		
		BufferStrategy estrategia = getBufferStrategy();
		
		if (estrategia == null) {
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = estrategia.getDrawGraphics();
		g.fillRect(0, 0, LARGXO, ALTECO);
		
		g.setColor(Color.BLACK);
		
		for(int i = 0;i<kvant.length;i++)
			g.drawLine(i + x, (int)Math.round(kvant[i]) + y, 0 + x, 0 + y);
		
		g.dispose();
		
		estrategia.show();
		
		fps++;
		
	}
	
	private void setKvant(double[] kvant, int i) {
		if(i >= LIM)
			return;
		
		kvant[i] = Math.sqrt(i);
		setKvant(kvant, i + 1);
	}
	
	private void gxisdatig() {//tio re-"paint"-as la fenestron
		
		
		aps++;
		
	}
	
	@Override
	public void run() {
		
		final int NS_POR_SEGUNDO = 1000000000;
		final byte APS_OBJETO = 60;
		final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETO;
		
		long referenciaActualizacion = System.nanoTime();
		long referenciaContador = System.nanoTime();
		
		double tiempoTranscurrido;
		double delta = 0;
		
		requestFocus();
		
		while (cxsxaltas) {
			
			final long inicioBucle = System.nanoTime();
			
			tiempoTranscurrido = inicioBucle - referenciaActualizacion;
			referenciaActualizacion = inicioBucle;
			
			delta += tiempoTranscurrido / NS_POR_ACTUALIZACION;
			
			while (delta >= 1) {
				gxisdatig();
				
				delta--;
			}
			
			montri();
			
			if ((System.nanoTime() - referenciaContador) > NS_POR_SEGUNDO) {
				APS = "APS: " + aps;
				FPS = "FPS: " + fps;
				aps = 0;
				fps = 0;
				referenciaContador = System.nanoTime();
				
			}
		}
	}
	
	@Override
	public void windowGainedFocus(WindowEvent arg0) {
		f.setTitle(TITOLO);
	}
	
	@Override
	public void windowLostFocus(WindowEvent arg0) {
		f.setTitle(TITOLO1);
	}
	
}