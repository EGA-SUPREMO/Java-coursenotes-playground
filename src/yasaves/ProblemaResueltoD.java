package yasaves;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
//import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.awt.Component;

//import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


import java.awt.Font;
import java.awt.BorderLayout;

public class ProblemaResueltoD extends JPanel {//Chat
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8446184831470705006L;
	JScrollPane JSP;
	private JTextField txtFfff;
	public Color CAC = new Color(240, 255, 255);//Color Azul Claro
	boolean ES = false;//Esta Escribiendo
	
	/**
	 * Create the panel.
	 */
	
	public ProblemaResueltoD() {
		
		setBackground(CAC);
		
		txtFfff = new JTextField();
		txtFfff.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent arg0) {
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				ES = true;
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				ES = true;
			}
		});
		txtFfff.setBackground(Color.WHITE);
		
		/*JTextArea textArea = new JTextArea();
		JSP = new JScrollPane(textArea);
		textArea.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		textArea.setAlignmentX(Component.RIGHT_ALIGNMENT);
		textArea.setEditable(false);
		textArea.setFont(new Font(D.FD, 1,D.TLC));*/
		txtFfff.setFont(new Font(D.FD, 1,D.TLC));
		
		//JButton btnEnviar = new JButton("Enviar");
		/*btnEnviar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				if (!txtFfff.getText().equals("")) {
					
					/*if(textArea.getText().equals("")) {
						
						textArea.setText(txtFfff.getText());
						
					}else {
						
						textArea.append("\n" + txtFfff.getText());
						
					}*/
					/*D.println("\"" + txtFfff.getText() + "\"");
					txtFfff.setText("");
					
				}
				
			}
			
		});*/
		
		//textArea.setWrapStyleWord(true);
		
		//JLabel lblNewLabel = new JLabel("Si quieres saber como usar emoticonos en el chat has clic aqui.");
		/*lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				MC.main(null);
				
			}
		});
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));*/
		setLayout(new BorderLayout(0, 0));
		add(txtFfff);
		//add(btnEnviar);
		//add(lblNewLabel);
		
	}
	
}
