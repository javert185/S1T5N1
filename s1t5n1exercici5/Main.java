package s1t5n1exercici5;

import java.io.File;

import javax.swing.JOptionPane;

import java.io.*;

public class Main {

	public static void main(String[] args) {
				
		//Creem un objecte 
		Objecte llibre = new Objecte("Vermell");
		
		//El serialitzem
		try {
			
			ObjectOutputStream escriure_fitxer = new ObjectOutputStream(new FileOutputStream("C:\\Users\\sergi\\eclipse-workspace\\s1t5n1exercici5\\prova.ser"));
			
			escriure_fitxer.writeObject(llibre);
			
			escriure_fitxer.close();
			
			//El desserialitzem
			
			ObjectInputStream tornar_fitxer = new ObjectInputStream(new FileInputStream("C:\\Users\\sergi\\eclipse-workspace\\s1t5n1exercici5\\prova.ser"));
			
			Objecte llibreta = (Objecte)tornar_fitxer.readObject();
			
			tornar_fitxer.close();
			
			System.out.println(llibreta.getColor());
			
		} catch (Exception e) {
			
		}		
	}	
}