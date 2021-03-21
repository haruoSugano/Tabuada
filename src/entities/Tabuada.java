package entities;

import javax.swing.JOptionPane;

public class Tabuada {
	
	private Integer n;

	public Tabuada(Integer n) {
		this.n = n;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}
	
	public void Multiplica(int n) {
		int m = 0;
		
		for(int i=0; i<10; i++) {
			m = n*i;
			JOptionPane.showMessageDialog(null, "Tabuada de " + n + "\n"+ n + " x " + i + " =" + m);
		}
	}

}
