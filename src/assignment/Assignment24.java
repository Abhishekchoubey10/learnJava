package assignment;

import java.util.ArrayList;

public class Assignment24 {

	public static void main(String[] args) {
		/**
		 * Write a Java Program to empty an arrayList
		 * 
		 * @author Abhishek kumar
		 */
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(700);
		System.out.println(ar.get(1));
		ar.clear();
		//ar.removeAll(ar);-- same as clear method 
		//System.out.println(ar.get(0)); //IndexOutOfBoundsException
		
	}

}
