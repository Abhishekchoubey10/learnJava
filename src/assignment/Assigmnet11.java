package assignment;

public class Assigmnet11 {

	public static void main(String[] args) {
		/**
		 * @author Abhishek kumar
		 * Print A-Z, a-z and 0-9 with the respective ASCII number on the console
		 */
		
		//Print A-Z with the respective ASCII number on the console
		System.out.println("Print A-Z with the respective ASCII number on the console");
		char a = 'A';
		while(a<='Z') {
			System.out.println((int)a);
			a++;
		}

		//Print a-z with the respective ASCII number on the console
		System.out.println("Print a-z with the respective ASCII number on the console");
		for(char i='a'; i<='z'; i++) {
			System.out.println((int)i);
		}
		
		//Print 0-9 with the respective ASCII number on the console
		System.out.println("Print 0-9 with the respective ASCII number on the console");
		for(int r = 0; r<=9; r++) {
			int t = r+48;
			System.out.println(t);
		}
	}

}
