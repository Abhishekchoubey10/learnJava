package assignment;

import java.util.Scanner;

public class Assignment27 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first Interger Value: ");
		int x = scanner.nextInt();
		System.out.println("Enter second Interger Value: ");
		int y = scanner.nextInt();
	
		if(x>y) {
			System.out.println("First number is greatest: "+x);
		}
		else {
			System.out.println("Second number is greatest: "+y);
		}
		
		scanner.close();
	}

}

