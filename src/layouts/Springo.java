package layouts;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class Springo extends JFrame implements WindowFocusListener {
	
	public static void main(String[] args) {
		new Springo().setVisible(true);
	}
	
	public Springo() {
		
		JButton c = new JButton("Mi treege deziras esti pli proksima al butono 2!!! :D.");
		JButton l = new JButton("Mi petas, ke vi proksimigu la franezan butonon de mi! D:.");
		JButton f = new JButton("Mi estas fida n_n.");
		JButton m = new JButton("Mi tuj ekhelpos la butonon 2 |:<.");
		
		SpringLayout h = new SpringLayout();
		Spring m1 = Spring.constant(0, 10, 100);
		
		h.putConstraint(SpringLayout.WEST, this, Spring.constant(0, 1, 10), SpringLayout.WEST, c);
		h.putConstraint(SpringLayout.WEST, l, m1, SpringLayout.EAST, c);
		h.putConstraint(SpringLayout.WEST, f, m1, SpringLayout.EAST, l);
		h.putConstraint(SpringLayout.WEST, m, m1, SpringLayout.EAST, f);
		h.putConstraint(SpringLayout.EAST, this, Spring.constant(0, 1, 10), SpringLayout.EAST, m);
		
		add(c);
		add(l);
		add(f);
		add(m);
		
		setTitle("El layout spring");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addWindowFocusListener(this);
		setLayout(h);
		
	}
	
	@Override
	public void windowGainedFocus(WindowEvent e) {
		setTitle("El layout spring");
	}
	
	@Override
	public void windowLostFocus(WindowEvent e) {
		setTitle("Esperanto estas la plej bona lingvo en la tuta mondo, eĉ pli bona ol Ido!");
	}
	
}
