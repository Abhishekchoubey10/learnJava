package javaBasic;

public class CarType {
	// In this class we will learn static and non static method

	String name;
	int price;
	String color;
	static final int wheels = 4;// static variable is also called instance variable, global variable is wrong
								// term
	// if create any new object the template that share to that object should not
	// contain any static variable/method, because object cannot hold any static
	// variable/method
	// static value will give a common value, that we can define, by static property
	// doesnot mean, its a common value, final keyword is used to provide a constant value 

	public static void start() {
		System.out.println("car -- start");
	}

	public void stop() {
		System.out.println("car -- stop");
	}

	// main method is store inside a metaspace
	// if main method is non static than JVM will create a object a call a main
	// method unnecessary, create a object is always a programmer responsibility and
	// user responsibility
	// JVM is only help to create a object but JVM never create a object by its own

	public static void main(String[] args) {

		CarType c1 = new CarType();
		c1.name = "Honda";
		c1.price = 10;
		c1.color = "white";
		// CarType.wheels = 5;// it is a common property value, because every cars has
		// four wheels, if we create 100 object than this wheels is unneccesary take 1
		// byte in every object, in that case this property should be written with
		// static keywords
		// never call static variable with object reference name
		c1.stop();

		// to call static methods:
		start();
		CarType.start();

		CarType c2 = new CarType();
		c2.name = "Audi";
		c2.price = 50;
		c2.color = "Red";

		CarType c3 = new CarType();
		c3.name = "BMW";
		c3.price = 60;
		c3.color = "Black";

		// 1. directly:
		System.out.println(wheels);
		// 2. class name:
		System.out.println(CarType.wheels);

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 3) {
				System.out.println("I am a batman");
			}
		}

	}

}
