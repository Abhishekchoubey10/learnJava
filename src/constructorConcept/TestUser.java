package constructorConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class TestUser {

	public static void main(String[] args) {

		ArrayList<String> tomList = new ArrayList<String>();
		tomList.add("iph12");
		tomList.add("iph13");
		tomList.add("imac");

		User u1 = new User("Tom", 25, tomList);

		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.deviceList);

		String orders[] = { "samsung 10, macbook pro", "shoes" };
		System.out.println(Arrays.toString(orders));// to print static array we have to use this or use for loop or
													// foreach loop
	
		//print static array using for loop 
		System.out.println("print static array using forloop");
		for(int r = 0; r<orders.length; r++) {
			System.out.println(orders[r]);
		}
		
		System.out.println("Print static array using eachloop");
		for(String t: orders) {
			System.out.println(t);
		}
		
		System.out.println(tomList);

		User u2 = new User("Tom", 30, tomList, orders);
		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.deviceList);
		System.out.println(Arrays.toString(u2.orders));// to print static array we have to use this or use for loop or
														// foreach loop

		// Q---can we create a object of person class?
		// Person p = new Person();
		// No, because person class have private constructor we cannot create object of
		// this person class from the outside of the person class
		// if we have main method in person class than we will create object of person
		// class outside the class
		//but from this class we can call static method 
		Person.getmail();

	}

}
