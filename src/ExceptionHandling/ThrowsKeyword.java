package ExceptionHandling;

public class ThrowsKeyword {

	//throws keyword is just pass the exception from one method to another method, it not handle the exception 
	public void m1() {
		m2();
	}

	public void m2() {
		m3();
	}

	public void m3() {
		try {
			m4();
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("AE is coming...");
		}
	}

	public void m4() throws ArithmeticException {
		int i = 9 / 0;
	}

	public static void main(String[] args) {

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();

		System.out.println("Bye");
		// it not a good practice to write exception handling inside a main method, we
		// should write exception handling inside the particular method, where we are
		// think, we get any exception
	}

}
