package application;

import javax.swing.JOptionPane;

import entities.Tabuada;

public class Program {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Tabuada de 0 a "));
		for(int n=0; n<x; n++) {
		Tabuada tab = new Tabuada(n);
		tab.Multiplica(n);
		}
	}

}
