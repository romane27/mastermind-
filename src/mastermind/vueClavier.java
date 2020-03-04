package mastermind;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;

import tp.ImageModèle;

public class vueClavier extends Panel implements Observer{
	//Modele m;
	public JButton bout1,but2; 

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
		
	
}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
		Integer etat = (Integer)arg;
	}
	}
