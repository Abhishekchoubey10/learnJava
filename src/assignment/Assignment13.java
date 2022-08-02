package assignment;

public class Assignment13 {

	public static void main(String[] args) {
		
		/**
		 * @author Abhishek kumar
		 * Print 1 to 10 and break the loop once you find multiplication of 7 with a message "bye see you tomorrow"
		 */

		for(int i =1; i<=10; i++) {
			System.out.println(i);
			if(i % 7 == 0) {
				System.out.println("bye See you tomorrow");
				break;
			}
		}
	}

}
