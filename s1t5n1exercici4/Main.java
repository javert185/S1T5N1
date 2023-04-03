package s1t5n1exercici4;

import java.io.File;

import javax.swing.JOptionPane;

import java.io.*;

public class Main {

	public static void main(String[] args) {
				
		//Creem un fitxer
		try {
		File llista_txt = new File("Llista.txt");
		if (llista_txt.createNewFile()) {
	        System.out.println("Arxiu creat: " + llista_txt.getName());
		} else {
			System.out.println("Arxiu no creat"); 
		} 
		} catch (IOException e) {
		      System.out.println("Hi ha hagut algun error");
		}
		
		//Donem un directori predeterminat		
		File directori = new File(JOptionPane.showInputDialog("Introdueix el nom d'un directori: "));
			
		//Creem un array d'strings i cridem al mètode
		Alfabet.alfabet(directori);
		
		//Afegim la funcionalitat de llegir qualsevol fitxer TXT i mostrem el seu contingut per consola
		String nom_fitxer = JOptionPane.showInputDialog("Introdueix el nom d'un fitxer si vols llegir-lo: ");
		
		if (!nom_fitxer.isEmpty()) {
			
			Llegir_fitxer.llegir(nom_fitxer);
		}	
	}
}