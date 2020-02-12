package mastermind;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class interfacegraphique extends Frame implements WindowListener {
	public interfacegraphique() {
		super();
		this.setSize(640,360);
		this.setBackground(Color.blue);
		//this.setLayout(new BorderLayout());
		vueClavier vuecla = new vueClavier();
		this.add(vuecla);
		vuePropositions vuepropo = new vuePropositions();
		this.add(vuepropo);		
		this.addWindowListener(this);
		this.pack();
		this.setVisible(true);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new interfacegraphique();
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0); 
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}}


