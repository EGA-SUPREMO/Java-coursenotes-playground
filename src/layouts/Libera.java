package layouts;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Libera extends JFrame implements WindowFocusListener {
	
	public static void main(String[] args) {
		new Libera().setVisible(true);
	}
	
	public Libera() {
		
		JLabel j = new JLabel("1");
		j.setSize(20, 20);
		
		setTitle("El layout spring");
		setSize(850, 850);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addWindowFocusListener(this);
		setLayout(new LayoutManager() {
			
			int x;
			int y;
			
			@Override
			public void addLayoutComponent(String arg0, Component arg1) {
			}
			
			@Override
			public void layoutContainer(Container c) {
				
				for(int i = 0;i<c.getComponentCount();i++) {
					
					Component t = c.getComponent(i);
					
					int x1 = t.getSize().width;
					int y1 = t.getSize().height;
					
					x = c.getSize().width/2;
					y = c.getSize().height/2;
					
					t.setBounds(x, y, x1, y1);
					
				}
				
			}
			
			@Override
			public Dimension minimumLayoutSize(Container arg0) {
				return null;
			}
			
			@Override
			public Dimension preferredLayoutSize(Container arg0) {
				return null;
			}
			
			@Override
			public void removeLayoutComponent(Component arg0) {
			}
			
		});
		
		add(j);
		
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