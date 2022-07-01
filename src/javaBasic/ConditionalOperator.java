package javaBasic;

public class ConditionalOperator {

	public static void main(String[] args) {

		int a = 30; // '=' is assignment Operator
		int b = 20;

		// in if condition is always a boolean , means condition if either true or false
		if (b > a) {// false // '>' is comparison operator
			System.out.println("b is gr than a");
		} else {
			System.out.println("a is gr than b");
		}

		if (a == b) {// false // '==' is comparison operator
			System.out.println("both are eq");
		} else {
			System.out.println("not eq");
		}

		if (true) {// this is bad way to write a program
			System.out.println("Hi..");
		} else { // dead code-- because if condition is always true it never come to this else
					// line, and this case is dead(means no need)
			System.out.println("Bye..");
		}

		// this is right way to write a program
		boolean flag = false;
		if (flag) {// this if part currently become dead, but it not giving any warning, because if
					// condition is totality dependent on flag value
			System.out.println("testing...");
		} else {
			System.out.println("dev...");
		}

		// NestedIf condition
		int marks = 100;
		if (marks >= 90) {
			if (marks >= 95) {
				System.out.println("GRADE A++");
			} else {
				System.out.println("GRADE A");
			}
		} else {
			System.out.println("GRADE B");
		}

		// WAP: three different numbers
		// find out the max number:
		int x = 500;
		int y = 400;
		int z = 600;

		// if else condition
		if (x > y && x > z) {// true && false = false //&&- is called "AND" operator and Short circuit
								// operator , short circuit means if any of the condition is not satisfied it
								// gives false(or break the condition)
			System.out.println("x is the greatest");
		} else if (y > z) {// false
			System.out.println("y is the greatest");
		} else {
			System.out.println("z is the greatest");
		}

		// only multiple IFs: or sequential if
		// it not a write way to write a code, there are two error
		// 1. we have not write if condition as many times
		// 2. if one condition fail,that complier is checking every line of program
		// and program become slow
//		String browser = "chrome";
//		if(browser.equals("chrome")) {//we never use == operator in realtime programming, we only use '==' operator to 
		// compare primitive data type, to compare non-primitive data type we write like
		// '.equals'
//			System.out.println("launch chrome...");
		// break-- is not allow to use inside a 'if' without a loop, 'break' is only
		// allow for loop and switch case
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("launch ff...");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("launch safari...");
//		}
//		if(browser.equals("IE")) {
//			System.out.println("launch IE...");
//		}
//		else {
//			System.out.println("please pass the right browser....");
//		}

		// if-else if
		// Again there is one Bug in a code
		// when we run a code complier have to check every line of code to run this
		// program, this is a bad approach
		// to overcome this approach we have use switch case 
		String browser = "firefox";
		if (browser.equals("chrome")) {
			System.out.println("launch chrome...");
		} else if (browser.equals("firefox")) {
			System.out.println("launch ff...");
		} else if (browser.equals("safari")) {
			System.out.println("launch safari...");
		} else if (browser.equals("IE")) {
			System.out.println("launch IE...");
		} else {
			System.out.println("please pass the right browser....");
		}

	}

}
