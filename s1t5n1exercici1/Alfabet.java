package s1t5n1exercici1;

import java.io.*;
import java.util.Arrays;

public class Alfabet {
	
	//M�tode que rep per par�metre un directori	
	public static String[] alfabet(File fitxer) {
		
		//Cridem al m�tode .list() que ens obt� tots els fitxers
		String[] llista = fitxer.list();
		
		//Ordenem la llista amb el m�tode .sort()
		Arrays.sort(llista);
		
		return llista;
	}
}