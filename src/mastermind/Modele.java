package mastermind;

import java.awt.Color;
import java.util.Random;

public class Modele {
	public Color [] couleur = {Color.YELLOW, Color.GREEN,Color.BLUE,Color.MAGENTA, Color.RED, Color.ORANGE,Color.WHITE, Color.BLACK};
	public static int N_TENTATIVES = 10;
	public static int difficulte = 4;
	
	static public enum Etat {EN_COURS, GAGNE, PERDU} ;
	
	Etat etat;
	Rangee combinaison;
	Rangee[] proposition;
	int tentative;
	
	Random r = new Random();
	
	
	
	public Modele () {
	this.etat = Etat.EN_COURS;
	this.combinaison = new Rangee();
	/*for (int i = 0; i<this.difficulte;i++) {
		combinaison.jetons[i-1] = couleur[r.nextInt(couleur.length)];
		
	}*/
	this.proposition = new Rangee[N_TENTATIVES];
	this.tentative = -1;
	
	
	
	}





	

}
