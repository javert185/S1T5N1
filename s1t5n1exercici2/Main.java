package s1t5n1exercici2;

import java.io.File;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//Donem un directori predeterminat		
		File directori = new File(JOptionPane.showInputDialog("Introdueix el nom d'un directori: "));
			
		//Creem un array d'strings i cridem al mètode
		Alfabet.alfabet(directori);	
	}
}