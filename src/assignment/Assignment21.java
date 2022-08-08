package assignment;

import java.util.ArrayList;

public class Assignment21 {

	public static void main(String[] args) {
		/**
		 * Write a java program to reverse elements is an arrayList
		 * 
		 * @author Abhishek kumar
		 */

		ArrayList ap = new ArrayList();
		ap.add(100);
		ap.add(200);
		ap.add(300);
		ap.add(400);
		ap.add(500);
		
		for(int i =(ap.size()-1);i>=0;i-- ) {
			System.out.println(ap.get(i));
		}
	}

}
