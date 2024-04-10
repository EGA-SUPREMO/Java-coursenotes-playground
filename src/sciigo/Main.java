package sciigo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends JFrame implements WindowFocusListener {
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
	
	public Main() {
		
		gg hh = new gg();
		
		JButton h = new JButton("Timi");
		JButton j = new JButton("Mi volas koni vin");
		JButton k = new JButton("Ankaŭ mi volas koni vin");
		JButton u = new JButton("Eĉ mi volas koni vin");
		
		setTitle("Sciigoj");
		setSize(850, 850);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addWindowFocusListener(this);
		setLayout(new FlowLayout());
		
		add(h);
		add(j);
		add(k);
		add(u);
		
		h.addActionListener(hh);
		j.addActionListener(hh);
		k.addActionListener(hh);
		u.addActionListener(hh);
		
	}
	
	@Override
	public void windowGainedFocus(WindowEvent e) {
		setTitle("Sciigoj");
	}
	
	@Override
	public void windowLostFocus(WindowEvent e) {
		setTitle("Esperanto estas la plej bona lingvo de la mondo tuta, eĉ pli bona ol Ido!");
	}
	
	private class gg implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getActionCommand()=="Timi") {
				
				JOptionPane.showMessageDialog(Main.this,
						"Vi havas tre gravan problemon... Kaj estas ke vi havas tre dan�?eran viruson, �?i tuj ekdestruos vian komputilon",
						"Mi havas kanceron D:", 2);
				
			}else if(e.getActionCommand()=="Mi volas koni vin") {
				
				JOptionPane.showInputDialog(Main.this, "Kia, kiel, en kie kaj pri kio kaj kiu vi dormas?",
						"Vi estas tre interesa", 0);
				
			}else if(e.getActionCommand()=="Ankaŭ mi volas koni vin") {
				
				JOptionPane.showConfirmDialog(Main.this, "Ĉu amas vi min???", "Vi estas tre bela... MI AMAS CIN!",
						0, 0);
				
			}else {
				
				JOptionPane.showOptionDialog(Main.this, "Ĉu vi estas infano?", "Mi ne dormos �?is vi respondos min",
						1, 2, null, new String[] {"JES", "Ne, Infanemo", "Kun ne malmulta honto mi diras jes."}, null);
				
			}
			
		}
		
	}
	
}