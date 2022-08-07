package assignment;

import java.util.ArrayList;

public class Assignment20 {

	public static void main(String[] args) {
		/**
		 * Write a java program to search an element in ArrayList
		 * 
		 * @author Abhishek kumar
		 */

		Assignment20 e = new Assignment20();
		boolean flag = e.search("Ram");
		if(flag) {
			System.out.println("Person selected in list");
		}
		else
			System.out.println("Person is not selected in list");
			
		
	}
	
	public boolean search(String name) {
		ArrayList List = new ArrayList();
		
		if(List.contains(name)) {
		List.add("mohan");
		List.add("Abhishek");
		List.add("Prakash");
		List.add("Nishant");
		return true;
		}
		else
			return false;
	}

}
