package s1t5n1exercici4;

import java.io.*;
import java.util.Scanner;

public class Llegir_fitxer {
	
	public static void llegir(String nom) {
		
		
		try {
		      File myObj = new File(nom);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("Hi ha hagut algun error");
		      e.printStackTrace();
		    }
	}
}