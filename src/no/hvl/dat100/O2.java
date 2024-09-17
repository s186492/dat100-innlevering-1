package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		int bruttolønn = Integer.parseInt(showInputDialog("Skriv inn din bruttolønn:"));
		int rest = 0;
		double trinnskatt = 0;
		
		double trinnskatt1 = (292850 - 208051) * 0.017;
		double trinnskatt2 = (670000 - 292851) * 0.04;
		double trinnskatt3 = (937900 - 670001) * 0.136;
		double trinnskatt4 = (1350000 - 937901) * 0.166;
		
		if (bruttolønn >= 0 && bruttolønn <= 208050) {
			System.out.println("Du betaler ingen trinnskatt siden du tjener mindre enn 208 050kr.");
		}
		else if (bruttolønn >= 208051 && bruttolønn <= 292850 ) {
			rest = bruttolønn - 208051;
			trinnskatt = rest * 0.017;
			System.out.println("Du ligger på trinnskatt 1 og må betale " + trinnskatt + " kr");
		}
		else if (bruttolønn >= 292851 && bruttolønn <= 670000 ) {
			rest = bruttolønn - 292851;
			trinnskatt = rest * 0.04;
			trinnskatt = trinnskatt + trinnskatt1;
			System.out.println("Du ligger på trinnskatt 2 og må betale " + trinnskatt + " kr");
		}	
		else if (bruttolønn >= 670001 && bruttolønn <= 937900 ) {
			rest = bruttolønn - 670001;
			trinnskatt = rest * 0.0136;
			trinnskatt = trinnskatt + trinnskatt1 + trinnskatt2;
			System.out.println("Du ligger på trinnskatt 3 og må betale " + trinnskatt + " kr");
		}	
		else if (bruttolønn >= 937901 && bruttolønn <= 1350000 ) {
			rest = bruttolønn - 937901;
			trinnskatt = rest * 0.166;
			trinnskatt = trinnskatt + trinnskatt1 + trinnskatt2 + trinnskatt3;
			System.out.println("Du ligger på trinnskatt 4 og må betale " + trinnskatt + " kr");	
		}
		else if (bruttolønn >= 1350001 ) {
			rest = bruttolønn - 1350001;
			trinnskatt = rest * 0.176;
			trinnskatt = trinnskatt + trinnskatt1 + trinnskatt2 + trinnskatt3 + trinnskatt4;
			System.out.println("Du ligger på trinnskatt 5 og må betale " + trinnskatt + " kr");	
		}
		
		else {
			System.out.println("Dette er ikke en inntekt");
		}
		
	}

}
