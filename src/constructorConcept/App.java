package constructorConcept;

public class App {

	//Method chaining concept--where we have calling method inside one method 
	public void t1() {
		System.out.println("this is a 1st method");
		t2();
	}
	public void t2() {
		System.out.println("this is a 2st method");
		t3();
	}
	public void t3() {
		System.out.println("this is a 3st method");
		//t1();//StackoverflowError
	}

	
	public static void m1() {
		System.out.println("m1");
		m2();
	}
	public static void m2() {
		System.out.println("m2");
		m3();
	}
	public static void m3() {
		System.out.println("m3");
	}
	
	public static void main(String[] args) {
		
		App test = new App();
		test.t1();
		
		//to call static method 
		App.m1();// classname.method 
	}

}
