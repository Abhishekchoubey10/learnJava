package oopInheritance;

public class BMW extends Car {// extend keywords is used for inherit, where Bmw(child class or sub class),
								// Car(parent class or super class)

	// method overriding: poly+morphism(morphism means form) -- dynamic polymorphism(run time)
	// when you have a method in parent class as well as in child class
	// with the same name
	// and same number of parameters
	// and same return type

	//Both method overriding and method overloading is called polymorphism 
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}

	// private method from parent class cannot be overridden
	private void price() {
		System.out.println("BMW price");
	}

	// static method of same signature(same return type and same number of
	// parameter)from parent class cannot be overridden, this feature is called
	// by another name---
	// method hiding
	public static void speed() {
		System.out.println("BMW -- speed");
	}
	// we can overload a static and private method but not override these method

	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}
}
