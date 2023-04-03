package s1t5n1exercici31;


import java.io.FileWriter;
import java.io.IOException;

public class Escriure_fitxer {
	
	public static void escriure(String text) {
	
	try {
		      FileWriter myWriter = new FileWriter("Llista.txt" ,true);
		      myWriter.write(text);
		      myWriter.close();
		 	} catch (IOException e) {
		      System.out.println("Hi ha hagut algun error");
		      e.printStackTrace();
			}		
	}
}