package mastermind;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ItemListener;

public class vueClavier extends Panel {
	Modele m;
	Checkbox[] boutons = new Checkbox[m.couleur.length];

	public vueClavier() {
		this.setLayout(new FlowLayout());
		CheckboxGroup cg=new CheckboxGroup();
		for(int i = 0; i < m.couleur.length; i++)
		{
			this.boutons[i] = new Checkbox();
			// pour avoir un controle sur le clic 
			this.boutons[i].addItemListener(l);
			this.add(this.boutons[i]);
		}
	
}}
