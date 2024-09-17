package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {	
			int poengsum = -1;	
			
			while (poengsum < 0 || poengsum > 100) {
				poengsum = parseInt(showInputDialog("Skriv inn poengsummen fra prøven: "));

				if (poengsum < 0 || poengsum > 100) {
					System.out.println("Ugyldig poengsum! Skriv inn et tall mellom 0 og 100.");
				}
			}
			
			if (poengsum >= 0 && poengsum < 40){
				System.out.println("F");
			} else if (poengsum >= 40 && poengsum < 50) {
				System.out.println("E");
			} else if (poengsum >= 50 && poengsum < 60) {
				System.out.println("D");
			} else if (poengsum >= 60 && poengsum < 80) {
				System.out.println("C");
			} else if (poengsum >= 80 && poengsum < 90) {
				System.out.println("B");
			} else if (poengsum >= 90 && poengsum <= 100) {
				System.out.println("A");
			}
			
					
		}	
	}
}
	

