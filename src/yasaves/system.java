package yasaves;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class system extends JFrame {
	
	static vortoj[] v = new vortoj[5000];
	static Calendar c = new GregorianCalendar();
	static String dia, mes, sekundo;
	static int h = 0;
	static JLabel nv = new JLabel("Son " + h + " palabras");
	static JTextArea vv = new JTextArea();
	static JScrollPane ffff = new JScrollPane(vv);
	boolean b = true;
	
	public static void main(String[] arg) {
		
		system s = new system();
		s.setVisible(true);
		
		for(int i = 0;!(i==100);i--){
			
			c.setTime(new Date());
			
			dia = Integer.toString(c.get(Calendar.DATE));
			mes = Integer.toString(c.get(Calendar.MONTH));
			sekundo = Integer.toString(c.get(Calendar.SECOND));
			
			//System.out.println(sekundo + " " + dia + "/" + mes);
			
		}
		
	}
	
	public system() {
		
		Dimension s = new Dimension(800, 590);
		JPanel cp = new JPanel();
		JButton addvorto = new JButton("Añadir Palabra");
		JTextField hh = new JTextField("");
		
		setMinimumSize(s);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Mini Practica nº10 - Formo por Lerni pli Rapidega");
		setContentPane(cp);
		
		cp.add(nv);
		cp.add(addvorto);
		cp.add(hh);
		cp.add(ffff);
		
		vv.setColumns(69);
		vv.setRows(31);
		hh.setColumns(69);
		
		addvorto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				c.setTime(new Date());
				comprobar(hh.getText());
				v[h] = new vortoj(hh.getText(), c);
				
			}
			
		});
		
	}
	
	public static void comprobar(String s) {
		
		for(int i = 0;!(i==h);i++) {
			
			if(v[i].vorto.equalsIgnoreCase(s)) {
				
				h--;
				nv.setText("Son " + h + " palabras");
				
			}
			
		}
		
	}
	
	class vortoj {
		
		String vorto = "";
		int m, d, id;
		int forto = 0;//0 = olvidada; 5 recordada.
		
		public vortoj(String s, Calendar c) {
			
			vorto = s;
			d = c.get(Calendar.DATE);
			m = c.get(Calendar.MONTH);
			forto = 5;
			id = h;
			h++;
			nv.setText("Son " + h + " palabras");
			vv.setText(s + ". " + vv.getText());
			
			//vv.setText(forto + " " + s + "\n" + vv.getText());
			
			System.out.println(d + "/" + m + " " + vorto);
			
		}
		
		public String getvorto() {
			return vorto;
		}
		
	}
	
}