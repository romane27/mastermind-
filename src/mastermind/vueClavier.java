package mastermind;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class vueClavier extends Panel {
	Modele m;
	private JButton bout1,but2; 

	public vueClavier(Modele m, ActionListener l ) {
		super();
		
		
		JButton bouton=new JButton();
		for(int i = 0; i < m.couleur.length; i++)
		{
			
			bout1 = new JButton();
			bout1.setBackground(m.couleur[i]);
			this.add(bout1);
			bout1.setVisible(true);
			// pour avoir un controle sur le clic 
			
			
		}
		
	
}}
