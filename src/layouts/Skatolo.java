package layouts;

import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Skatolo extends JFrame implements WindowFocusListener {
	
	public static void main(String[] args) {
		new Skatolo().setVisible(true);
	}
	
	public Skatolo() {
		
		Box b = Box.createHorizontalBox();
		Box b1 = Box.createHorizontalBox();
		Box g = Box.createVerticalBox();
		
		JButton j = new JButton("Klaku al Ho!");
		JButton h = new JButton("Klaku al Jo!");
		
		JButton j1 = new JButton("La supraj butonoj kopiis sin el ni.");
		JButton h1 = new JButton("Jo tre pravas!");
		
		j.setToolTipText("Mi estas bela butono kaj mi nomiĝas Jo.");
		h.setToolTipText("Mi estas bona butono kaj mi nomiĝas Ho.");
		
		j1.setToolTipText("Mi havas laboron.");
		h1.setToolTipText("Ankaŭ mi.");
		
		b.add(j);
		b.add(Box.createGlue());
		b.add(h);
		add(g, BorderLayout.CENTER);
		
		b1.add(j1);
		b1.add(Box.createHorizontalStrut(25));
		b1.add(h1);
		
		g.add(b);
		g.add(b1);
		
		setTitle("El layout box");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addWindowFocusListener(this);
		
	}
	
	@Override
	public void windowGainedFocus(WindowEvent e) {
		setTitle("El layout box");
	}
	@Override
	public void windowLostFocus(WindowEvent e) {
		setTitle("Esperanto estas la plej bona lingvo en la tuta mondo, eĉ pli bona ol Ido!");
	}
	
}
