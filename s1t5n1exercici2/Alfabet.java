package s1t5n1exercici2;

import java.io.*;
import java.util.Arrays;
import java.util.*;

public class Alfabet {
	
	//Mètode que rep per paràmetre un directori	
	public static void alfabet(File fitxer) {
		
		//Cridem al mètode .list() que ens obté tots els fitxers
		String[] llista = fitxer.list();
		
		//Ordenem la llista amb el mètode .sort()
		Arrays.sort(llista);
		
		//Imprimim el contingut que rebem i si trobem un directori, obtenim fitxers
		for (int i = 0; i < llista.length; i++) {
			
			File nova_llista = new File(fitxer, llista[i]);
			
			//Obtenim la data
			Long data_llarga = nova_llista.lastModified();
			Date data = new Date(data_llarga);
			
			
						
			if (nova_llista.isDirectory()) {
				
				//Si es directori, imprimim D				
				System.out.println("(D) " + llista[i] + ". Última data de mofificació: " + data);
				
				//Cridem al mètode recursivament
				alfabet(nova_llista);				
			} else {
				
				//Si es fitxer, imprimim F
				System.out.println("(F) " + llista[i] + ". Última data de mofificació: " + data);				
			}
		}
	}
}