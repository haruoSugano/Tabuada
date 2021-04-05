package application;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Tabuada de 0 a "));
		
		for(int n=0; n<x; n++) {
			for(int i=0; i<10; i++) {
			int m = n*i;
			JOptionPane.showMessageDialog(null, "Tabuada de " + n + "\n"+ n + " x " + i + " =" + m);
		}
		}
	}

}
