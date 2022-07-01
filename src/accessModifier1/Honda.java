package accessModifier1;

import accessModifier.Car;

//Different package subclass
public class Honda extends Car {// Car line is giving error to ask from which package you want to import car
								// class

	public static void main(String[] args) {

		Honda h = new Honda();
		h.licNumber = 1200;
		h.name = "civic";
		

	}

}
