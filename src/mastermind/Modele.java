package mastermind;

import java.awt.Color;

public class Modele {
	public Color [] couleur = {Color.YELLOW, Color.GREEN,Color.BLUE,Color.MAGENTA, Color.RED, Color.ORANGE,Color.WHITE, Color.BLACK};
	public int N_TENTATIVES = 10;
	public int difficulte = 4;
	public enum etats {EN_COURS, GAGNE, PERDU};
	/*public Modele (Color[] coul, int tentatives, int diffi, enum etat) {
		this.couleur = coul;
		this.N_TENTATIVES= tentatives;
		this.difficulte= diffi;
		this.etats=etat;
		
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
