package mastermind;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.PopupMenu;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JButton;



public class vuePropositions extends Canvas   {
	//Modele m;
	Rangee[] propositions;
	public vuePropositions(Rangee [] proposition) {
		super();
		Dimension dimension=new Dimension(50*Modele.difficulte+20, 30*(Modele.N_TENTATIVES+1));
		this.setPreferredSize(dimension);
		this.setBackground(Color.gray);
		this.propositions = propositions;
		
		
		}
		//c.paint(c.getGraphics());
		
		
		// TODO Auto-generated constructor stub
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawRect(0, 0, 50*Modele.difficulte-40, this.getHeight()-2);
		g.drawRect(1, 1, 50*Modele.difficulte-40, this.getHeight()-2);
		g.drawRect(50*Modele.difficulte-40+1, 0, 58, this.getHeight()-2);
		g.drawRect(50*Modele.difficulte-40, 1, 58, this.getHeight()-2);
		
	}
	

		
			
			
		
		
	}
	
	
	
	
	
	
	



	
	
	

	
