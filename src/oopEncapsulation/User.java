package oopEncapsulation;

public class User {

	// donot create main method in these class, use this user class as template, if
	// we use main method here than private property is avail;able to call by
	// anyone, irrespective of we not define constructor of setter and getter method

	// so we have to use this class as template, and create a main method in some
	// other class
	private String firstName;
	private String lastName;
	private long phone;
	private boolean isPrime;

	// constructor
	public User(String firstName, String lastName, long phone, boolean isPrime) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.isPrime = isPrime;
	}

	// getter and setter
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	// function
	public void getUserProfile() {
		System.out.println(firstName + " " + lastName + " " + phone + " " + isPrime);
	}
}
