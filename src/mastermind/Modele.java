package mastermind;

import java.awt.Color;

public class Modele {
	public Color [] couleur = {Color.YELLOW, Color.GREEN,Color.BLUE,Color.MAGENTA, Color.RED, Color.ORANGE,Color.WHITE, Color.BLACK};
	public int N_TENTATIVES = 10;
	public int difficulte = 4;
	
	static public enum Etat {EN_COURS, GAGNE, PERDU} ;
	
	Etat etat;
	Rangee combinaison;
	Rangee[] proposition;
	int tentative;
	
	
	public Modele (Color[] coul, int tentatives, int diffi, Etat etat) {
		
	}

	

}
