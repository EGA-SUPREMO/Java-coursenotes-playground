package yasaves;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class h extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		h hc = new h();
		hc.setVisible(true);
	}
	
	public h() {
		
		setSize(500,450);
		
		JPanel CP = new JPanel();
		JTextField txt = new JTextField();
		JButton bl = new JButton("Boton Loco");
		
		setContentPane(CP);
		setTitle("Juego");
		
		bl.setBounds(20,20,200,29);
		txt.setBounds(20,53,200,29);
		
		CP.add(bl);
		CP.add(txt);
		
		setLayout(null);
		
		bl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
	
				
				
			}
			
		});
	}

}
