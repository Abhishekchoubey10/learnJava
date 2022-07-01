package javaBasic;

public class AmazonApp {

	public boolean login() {// this not a method overloading function--as the signature if
							// different(like--boolean)
		System.out.println("login is done");
		return true;
	}
	// why we are creating method overloading
	// lets backend create any feature API with different parameter than it is easy
	// for
	// frontend to call that API of any particular feature with different parameter

	// compile time polymorphism is faster than dynamic polymorphism
	// In Java most of program decide at compile time(means at time of writing a
	// code)

	// phythn is not a complier based language-- paythn will compile a code and run
	// a code at run time only

	// so java is much faster than phythn
	// pythn is used for mathematical calculation, provide really good liberay,
	// machine learning, artificial intelligence but for e-commerce application,
	// backend application, micro services, majority of thing use JAVA

	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, String role) {

	}

	public void login(String un, String pwd, int otp) {

	}

	public void login(String un, String pwd, long ph, int otp) {

	}

	public void search() {

	}

	public void search(String name) {

	}

	public void search(String name, int price) {

	}

	public void doPayment(String CC, int otp) {

	}

	public void doPayment(String CC, int cvv, String expDate, int otp) {

	}

	public void doPayment(String upi, long ph, int otp) {

	}

	public void doPayment(String paypalId) {

	}

	//
	public void booking(String car, String from, String to) {

	}

	public void booking(String from, String to) {

	}

	public int add(int a, int b) {
		System.out.println("hi");
		return a + b;
	}

//	public void add(short a, int b) {
//		System.out.println("bye");
//	}

//	public void add(int a, long b) {
//		System.out.println("hello");
//	}

	public double add(int a, double b) {
		System.out.println("hello");
		return a - b;
	}

	// Main method overloading we cannot use in real time project, but it is
	// important for interview, because main method is not defining a feature, it only a calling method 

	public static void main(String[] args) {

		AmazonApp ap = new AmazonApp();
		ap.add(10, 20);

		int a = 10;
		int b = 20;
		System.out.println(a + b);

		String s = "Hello";
		System.out.println(s + (a + b));

	}

}
