package accessModifier1;

import accessModifier.Car;

public class Cycle {

// different package non-subclass
	public static void main(String[] args) {

		Car c = new Car();// Car line is giving error to ask from which package you want to import car
							// class
		c.name = "Audi";
		

	}

}
