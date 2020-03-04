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
		Dimension dimension=new Dimension(50*Modele.difficulte+30, 30*(Modele.N_TENTATIVES+1));
		this.setPreferredSize(dimension);
		//this.setBackground(Color.gray);
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
		for (int i =0 ; i<= Modele.N_TENTATIVES; i++) {
			//g.drawRoundRect(50*Modele.difficulte-40+5, i*35-20, 50, 18, 5, 5);
			for(int j = 0; j<Modele.difficulte/2; j++) {
				//g.fillOval(50*Modele.difficulte-25+j*10, i*35, 5, 5);
				//g.fillOval(50*Modele.difficulte-25+j*10, i*35-12, 2, 2);
				g.drawOval(50*Modele.difficulte-15+j*10, i*35+10, 5, 5);
				g.drawOval(50*Modele.difficulte-15+j*10, i*35+22, 5, 5);
			}
		}
		for(int i = 0; i<Modele.N_TENTATIVES; i++) {
			for(int j = 0; j<Modele.difficulte; j++) {
				if (this.propositions[i].rangee[j]!=null) {
					g.setColor(this.propositions[i].rangee[j]);
					g.fillOval(10+(j*40), (i*35 - 20), 20, 20);
					g.setColor(Color.darkGray);
					g.drawOval(10+(j*40), (i*35 - 20), 20, 20);
				} else {
					g.setColor(Color.black);
					g.fillOval(20+(j*40), 10+(i*35 - 20), 2, 2);
				
				}
					
				}
			}
		}
	}
	

		
			
			
		
		
	
	
	
	
	
	
	
	



	
	
	

	
