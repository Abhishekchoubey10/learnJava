package oop_Abstract;

public abstract class Page {
	
	//abstract method cannot have any method body 

	// abstract methods + non abstract methods
		// can not create the object of abstract class
		// but can create the constructor of abstract class
		// and this constructor will be called when you create object of child class
		
		//can have  no abstract method --means 0% abstraction
		//can have only abstract methods --means 100% abstraction
		//abstract methods + non abstract methods -- means partial abstraction
	
	    //Before JDK 1.8 java follow 100% abstraction in interface

         //constructor	
		public Page() {
			System.out.println("page const...");
		} 

		public Page(int a) {
			System.out.println("page const..." + a);
		} 

		public abstract void title();

		public abstract void url();

		public void timeOut() {
			System.out.println("page time out is 10 secs");
		}

		public final void logo() {
			System.out.println("page logo");
		}
}
