package constructorConcept;

public class Car {

	String name;
	int price;
	String color;
	String model;
	static final int wheels = 4;// it not given to constructor because it is static in nature 

//	public Car() {
//		
//	}

//	public Car(int wheels) {
//		Car.wheels = wheels;
//	}

	public Car(String name, int price, String color, String model) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.model = model;
	}

	public Car(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}

	// if we create a constructor using same data type irrespective of different
	// class
	// variable we use it display as duplicate constructor
	// for example if we remove price class variable from below constructor than
	// that below constructor will behave like duplicate of above constructor 
	public Car(String name, String model, int price) {
		this.name = name;
		this.model = model;
		this.price = price;
	}
}
