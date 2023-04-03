package s1t5n1exercici1;

import java.io.*;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//Donem un directori predeterminat		
		
		File directori = new File(JOptionPane.showInputDialog("Introdueix el nom d'un directori: "));
		
		
		//Creem un array d'strings i cridem al mètode
		String[] llista = Alfabet.alfabet(directori);
		
		//Imprimim el contingut que rebem
		for (int i = 0; i < llista.length; i++) {
			System.out.println(llista[i]);
		}
	}
}