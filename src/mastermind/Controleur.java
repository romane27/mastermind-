package mastermind;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import java.util.Observable;
import java.util.Observer;



public class Controleur implements ActionListener,Observer { 
	
	Modele modele;
	vuePropositions vp;
	
	public Controleur (Modele m, vuePropositions vp, ActionListener l) {
		this.modele= m;
		this.vp=vp;
		
	}
	
	
	

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void update(Observable o, Object arg) {
	// TODO Auto-generated method stub
	
}
}


	
