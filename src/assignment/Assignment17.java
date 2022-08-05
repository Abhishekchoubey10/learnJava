package assignment;

import java.util.ArrayList;

public class Assignment17 {

	public static void main(String[] args) {
		/**
		 * Write a Java program to insert
		 * an element into the array list at the first and last positions
		 * 
		 * @author Abhishek kumar
		 */
		ArrayList ar = new ArrayList();
		ar.add(0, 90);
		ar.add(9, "Selenium");//Because when create dynamic array list then then virtual size of array list is 10
		
		//System.out.println(ar.get(0));
	    //System.out.println(ar.get(9));//IndexOutOfBoundsException

	}

}
