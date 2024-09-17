package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
		int tall = Integer.parseInt(showInputDialog("Skriv inn et tall større enn 0:"));
		
		if (tall <= 0) {
			 showMessageDialog(null, "n må være større enn 0.");
			 tall = Integer.parseInt(showInputDialog("Skriv inn et tall større enn 0:"));
			 return;
		}
		
		long fakultet = 1;
		
		for (int i = 1; i <= tall; i++) {
			fakultet *= i;
		}
		
		System.out.println(tall + "! = " + fakultet);

	}

}
