package assignment;

import java.util.ArrayList;

public class Assignment22 {

	public static void main(String[] args) {
		/**
		 * Write a java program to extract a portion of a array list
		 * 
		 * @author Abhishek kumar
		 */

		ArrayList List = new ArrayList();
		List.add(100);
		List.add(200);
		List.add(300);
		List.add(400);
		List.add(500);
		List.add(600);
		
		for(int i = 0; i<=3; i++) {
			System.out.println(List.get(i));
		}
	}

}
