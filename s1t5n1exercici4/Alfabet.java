package s1t5n1exercici4;


import java.util.Arrays;
import java.util.*;
import java.io.*;

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
			
			Long data_llarga = nova_llista.lastModified();
			Date data = new Date(data_llarga);
			
			
			//Obtenim la data			
			if (nova_llista.isDirectory()) {
				
				//Si es directori, imprimim D				
				Escriure_fitxer.escriure("(D) " + llista[i] + ". Última data de mofificació: " + data + "\n");
				
				//Cridem al mètode recursivament
				alfabet(nova_llista);				
			} else {
				
				//Si es fitxer, imprimim F
				Escriure_fitxer.escriure("(F) " + llista[i] + ". Última data de mofificació: " + data + "\n");				
			}
		}
	}
}
