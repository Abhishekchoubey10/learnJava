package assignment;

public class Assigment9 {

	public static void main(String[] args) {
		/**
		 * @author Abhishek kumar
		 * Print all odd and even number between 1 to 100
		 */

		System.out.println("Print all even number between 1 to 100 using while loop");
		int j =1;
		while(j<=100) {
		if(j % 2 == 0) {
			System.out.println(j);
		}
		j++;
		}
		
		System.out.println("Print all odd numbers between 1 to 100 using while loop");
		int i = 1;
		while(i<=100) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
