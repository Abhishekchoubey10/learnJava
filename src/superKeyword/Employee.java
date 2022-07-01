package superKeyword;

public class Employee extends Company {

	int salary = 200;

	public Employee() {
		super(10);// when we are calling a parent class constructor in child class using super
					// keyword than super keyword should always be a first statement
		// we cannot have super constructor calling from parent class back to back 
		
		//constructor chaining will stop at object class constructor
		
		System.out.println("emp -- const...");
	}

	public void cafe() {
		System.out.println("Emp -- cafe");
		System.out.println(salary);
		System.out.println(super.salary);
		super.cafe();
		super.logo();

		// with the help of super keyword-- we can access parent class properties
		// variables and
		// methods(both non-static, static and final)
		//using super keywords we only allow to access parent properties variable and method 
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e.cafe();

	}

}
