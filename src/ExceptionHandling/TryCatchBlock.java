package ExceptionHandling;

public class TryCatchBlock {

	int age;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		int a[] = new int[3];
		TryCatchBlock obj = new TryCatchBlock();
		obj = null;

		try {
			int i = 9 / 3;// AE
			a[2] = 10;// AIOB
			obj.age = 10;// NPE //it written like null.age, as we refer object to null
			System.out.println("Hello");// After exception is coming, it immediately jump to catch block and never
										// execute
										// the line write below the exception
			System.out.println("Hello");
		} catch (ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundException is class in java that are already
														// in build, we just give reference of class, java will
														// automatically create a object of this exception class
			System.out.println("AIOB exception is coming...");
			e.printStackTrace();// printStackTrace is a in-build method in java, that provides what exactly the
								// a this exception is --on which line/method/class/package exception is coming,
		} catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		} catch (NullPointerException e) {
			try {
				int i = 9 / 0;
			} catch (ArithmeticException ex) {
				System.out.println("AE is coming...");
				ex.printStackTrace();

			}
			System.out.println("NPE is coming");
			e.printStackTrace();
		} catch (Exception e) {// Exception is a super class of all the exception class
			System.out.println("some exception is coming");
			e.printStackTrace();
		}
// it always better to write multiple catch block for different exception
		// in catch block , we never write object class inside the catch block, we
		// always write exception (and allow to write up to throwable class)
		System.out.println("Bye");

	}

}
