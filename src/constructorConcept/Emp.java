package constructorConcept;

public class Emp {

	String name;
	int age;
	String city;
	double sal;
	boolean isPerm;

	public void getSalary(String empName) {
		// buss logic
	}

	// const.. will help us to design the object
	//example 
	// constructor will be use as backend API, where we want to fill a form than
	// using this below constructor we need name and age to submit that form as required 
	public Emp(String name, int age) {
		System.out.println("emp const...");
		// 'this' is a keyword is pointing to a current class object, we can write like
		// this.class variable name = local variable name
		this.name = name;
		this.age = age;
	}

	public Emp(String name, int age, String city) {
		System.out.println("emp const...");
		this.name = name;
		this.age = age;
		this.city = city;
	}
	// how to create a constructor based on class variable, when we have more
	// variable than we have write that class variable, to help out this we can use
	// (shortcut)
	// right click-->source... >Generate Constructor using fields>Select a class
	// variable that we need in particular constructor> click on generate
	// then constructor got created automatically

	public Emp(String name, int age, String city, double sal, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.sal = sal;
		this.isPerm = isPerm;
	}

	public Emp(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Emp e1 = new Emp("Tom", 25);// for 1st employee
		System.out.println(e1.name);// here .name is class variable
		System.out.println(e1.age);

		// to choose the constructor we use ctrl + Space , that shows a different
		// available constructor that we have created earlier
		Emp e2 = new Emp("Peter", 30, "LA");
		System.out.println(e2.name + " " + e2.age + " " + e2.city);

		Emp e3 = new Emp("Lisa", 24, "Pune", 12.33, true);

		Emp e4 = new Emp("Ravi");
		
		// Advantage of constructor
		// we are restricting creating of unnecessary object, otherwise what we do we
		// create 100s of object and then keep assigning the value like e1.name= tom,
		// e1.age= 23 etc
		// by using constructor we are defining a template of class(some logic in that
		// case), whenever we are creating a class, than we are not allow to create any
		// random object, we have define a restrict define object creation policy(so
		// these template we have created using constructor is called object
		// construction policy,
		// constructor will help us to design a object

	}

}
