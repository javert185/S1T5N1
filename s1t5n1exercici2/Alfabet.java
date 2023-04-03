package s1t5n1exercici2;

import java.io.*;
import java.util.Arrays;
import java.util.*;

public class Alfabet {
	
	//M�tode que rep per par�metre un directori	
	public static void alfabet(File fitxer) {
		
		//Cridem al m�tode .list() que ens obt� tots els fitxers
		String[] llista = fitxer.list();
		
		//Ordenem la llista amb el m�tode .sort()
		Arrays.sort(llista);
		
		//Imprimim el contingut que rebem i si trobem un directori, obtenim fitxers
		for (int i = 0; i < llista.length; i++) {
			
			File nova_llista = new File(fitxer, llista[i]);
			
			//Obtenim la data
			Long data_llarga = nova_llista.lastModified();
			Date data = new Date(data_llarga);
			
			
						
			if (nova_llista.isDirectory()) {
				
				//Si es directori, imprimim D				
				System.out.println("(D) " + llista[i] + ". �ltima data de mofificaci�: " + data);
				
				//Cridem al m�tode recursivament
				alfabet(nova_llista);				
			} else {
				
				//Si es fitxer, imprimim F
				System.out.println("(F) " + llista[i] + ". �ltima data de mofificaci�: " + data);				
			}
		}
	}
}