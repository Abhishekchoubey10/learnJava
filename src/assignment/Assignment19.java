package assignment;

import java.util.ArrayList;

public class Assignment19 {

	public static void main(String[] args) {
		/**
		 * Write a Java program to remove the third  element from a array list
		 * @author Abhishek kumar
		 */
		ArrayList st = new ArrayList();
		st.add(200);
		st.add(400);
		st.add(700);
		st.add(900);
		
		System.out.println(st.get(2));
		
		st.remove(2);
		System.out.println(st.get(2));
		

	}

}
