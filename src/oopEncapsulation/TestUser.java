package oopEncapsulation;

public class TestUser {

	public static void main(String[] args) {

		// Here constructor is also behaving like getter and setter
		// here pass some value to constructor and get value
		User u1 = new User("Kiran", "Jadeja", 909090, true);

		System.out.println(u1.isPrime());
		System.out.println(u1.getPhone());

		// but when we want to update a value than constructor would not help, that time
		// we must use setter method to update a value, constructor is only one time
		// activity, we pass the value for first time, but when we want to update a
		// value, than we must use setter method
		// constructor only set a value first time when we creating a object of class
		// for time time

		// update--use case
		u1.setPhone(80809090);
		u1.setPrime(false);

		System.out.println(u1.isPrime());
		System.out.println(u1.getPhone());

		//calling function 
		u1.getUserProfile();

		u1.setPrime(true);

		u1.getUserProfile();
	}

}
