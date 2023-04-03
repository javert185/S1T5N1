package s1t5n1exercici5;

import java.io.Serializable;

public class Objecte implements Serializable{
	
	private String color;
	
	public Objecte(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}