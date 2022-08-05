package assignment;

import java.util.ArrayList;

public class Assignment18 {

	public static void main(String[] args) {
		/**
		 * Write a Java program to update specific array element by given element
		 * @author Abhishek kumar
		 */

		ArrayList at = new ArrayList();
		at.add("Abhishek");
		at.add("Prakash");
		System.out.println(at.get(1));
		
		at.add(1, "Amit");
		System.out.println(at.get(1));
		
		at.set(1, "Naveen");
		System.out.println(at.get(1));
	}

}
