package assignment;

import java.util.ArrayList;

public class Assignment26 {

	public static void main(String[] args) {
		/**
		 * Write a java program to print all the elements of a ArrayList using the position of the elements
		 * 
		 * @author Abhishek kumar
		 */
		ArrayList<String> ay = new ArrayList<String>();
		ay.add("298");
		ay.add("Prakash");
		ay.add("Abhishek");
		ay.add("Ram");
		ay.add("Uttam");
		ay.add("alok ");
		
		for(int i =0; i< ay.size(); i++) {
			System.out.println(ay.get(i));
		}
		

	}

}
