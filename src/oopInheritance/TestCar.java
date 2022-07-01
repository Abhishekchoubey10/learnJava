package oopInheritance;

public class TestCar {

	public static void main(String[] args) {

		// reference type check is always applied we it pass when object reference type
		// and object type are matched
		BMW b = new BMW();
		b.start();// overridden
		b.stop();// inherited
		b.refuel();// inherited
		b.autoParking();// individual
		b.engine();

		BMW.speed();
		Car.speed();

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();

		// child class object can be referred by parent class ref variable
		// top casting
		Car c1 = new BMW();// all BMW are car
		c1.start();// it call bmw start method because actual object is bmw
		c1.stop();
		c1.refuel();
		// c1.autoParking();//ref type check is failed here
		// while accessing the individual method of
		// the child class from parent class reference class variable, java will ask
		// object reference where we are coming, what is type of object reference
		// variable is this same class of object class(BMW) or not if object reference
		// type and object class are mismatch than it not allow to access that method

		// child class object can be referred by grand parent class ref variable
		Vehicle v1 = new BMW();
		v1.engine();

		// down casting:
		// BMW b1 = new Car// it is not allowed in java, we get error at compile
		// time

		// car object is converted in BMW
//		BMW b1 = (BMW)new Car();//ClassCastException// it is not allowed in java // this error we get at run time not at compile time 
//		b1.start();

		// BMW b2 = (BMW)new Vehicle();//ClassCastException

		Audi a = new Audi();
		a.stop();
		a.start();
		a.refuel();
		a.theftSafety();
		a.engine();
	}

}
