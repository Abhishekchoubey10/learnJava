package assignment;

import java.util.ArrayList;

public class Assignment25 {

	public static void main(String[] args) {
		/**
		 * Write a Java Program to trim the virtual capacity of an array list the current list size
		 * 
		 * @author Abhishek kumar
		 */

		ArrayList <String> list = new ArrayList<String>(20);
		
		list.add("Abhishek");
		list.add("Prakash");
		list.add("Mohan");
		list.add("Ram");
		list.add("Shudha");
		
		list.trimToSize();
		
	}

}
