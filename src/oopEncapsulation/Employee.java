package oopEncapsulation;

public class Employee {

	public String name;
	public int age;
	private double salary;

	// public getter and setter methods: to get and set the method

	// setter-- means if we want to access a salary in another class than give me a
	// salary, another class cannot access this salary directly, but you give me to
	// this public layer
	public void setSalary(double salary) {
		this.salary = salary;
	}

	// getter method-- to return that salary, that particular have assign to
	// class variable(salary), where we return a same salary
	public double getSalary() {
		return salary;
	}
	// in getter and setter method we can write method name is anything but
	// according to industries standard in java we have use getname and setname

	// if we have 10 private property and we want to access those property in some
	// another class than we have to define 10 getter and 10 setter method of class
	// shortcut
	// Right click--select source --click on the Generate getter and setter> select
	// a class variable for which we want to generate getter and setter-- select
	// public layer and click on generate

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "tom";
		e1.age = 20;
		e1.salary = 34.55;

	}

}
