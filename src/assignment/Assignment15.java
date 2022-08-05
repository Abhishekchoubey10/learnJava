package assignment;

public class Assignment15 {

	public static void main(String[] args) {
		/**
		 * @author Abhishek kumar Write code of Data type assignment
		 */

		System.out.println("Write a code to divide two number");
		int i = 50;
		int j = 3;
		System.out.println(i / j);

		System.out.println("Write a code to divide expression");
		float a = (float) 25.5;
		float b = 3.5f;
		float c = 40.5f;
		float d = 4.5f;
		System.out.println((a * b - b * b) / (c - d));

		/*
		 * Try to concat "Hello Selenium" with a character 't'.
		 */
		System.out.println("Try to concat \"Hello Selenium\" with a character 't'");
		String s = "Hello Selenium";
		char e = 't';
		String r = String.valueOf(e);
		System.out.println(s + r);

		/*
		 * Create three int variables having values like : 100, 200, 3400. Add them and
		 * concatenate and generate this output String :
		 * "Your Total amount is. 3700".
		 */
		
		System.out.println("**********");
		int f = 100;
		int g = 200;
		int h = 3400;
		System.out.println("Your Total amount is." +(f+g+h));
		
		
		
	}

}
