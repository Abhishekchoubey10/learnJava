package constructorConcept;

public class Person {

	// Q-- Can we create private constructor?
	// yes
	private Person() {
		System.out.println("private const----");
	}

	// public void getmail() {
	// System.out.println("getmail method----");
	// we not able to call this method from other class because private constructor

	// but we can call static method from this class
	public static void getmail() {
		System.out.println("getmail method----");
	}
	// when we want to strict that no one can create object of that particular class

	// when to use static method or when to use non-static method?
	// example
	// when we want to create a utility and we donot want to create object of that
	// particular class, than we simply say all the method are static in nature, no
	// one can create object of that particular class , so we simply create one
	// private constructor in that class, that will restrict to create object of
	// that particular class outside of that class, because that class has not any
	// non-static method

	// real time example in java related to this
	// System-- is class that has private constructor in-build in java, so no one
	// can create object of System class and all System class method and variable
	// are static in nature
}
