package assignment;

import java.util.ArrayList;

public class Assignment16 {

	public static void main(String[] args) {
		/**
		 * Write a Java program to create a new array list
		 * add some colors (string) and print out the collection
		 * 
		 * @author Abhishek kumar
		 */
		
		ArrayList color = new ArrayList();
		color.add("Red");
		color.add("Orange");
		color.add("Bule");
		color.add("Grey");
		color.add("Green");
		
		System.out.println("Print array using each loop");
		for(Object e : color) {
			System.out.println(e);
		}
		
		System.out.println("Print array using for loop");
		for(int i =0; i<color.size(); i++) {
			System.out.println(color.get(i));
		}
		

	}

}
