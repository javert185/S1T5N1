package s1t5n1exercici1;

import java.io.*;
import java.util.Arrays;

public class Alfabet {
	
	//Mètode que rep per paràmetre un directori	
	public static String[] alfabet(File fitxer) {
		
		//Cridem al mètode .list() que ens obté tots els fitxers
		String[] llista = fitxer.list();
		
		//Ordenem la llista amb el mètode .sort()
		Arrays.sort(llista);
		
		return llista;
	}
}