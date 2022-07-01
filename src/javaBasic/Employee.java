package javaBasic;

public class Employee {

	// class vars:
	String name;// this name is class properties
	int age; // this age is class properties
	String city;// this city is class properties
	double salary;// this salary is class properties
	char gender;// this gender is class properties
	boolean isActive;// this isActive is class properties

	public static void main(String[] args) {

		// class - blueprint/template/category--with the help of this we can create
		// multiple objects
		// Class is very high level category
		// like Laptop is class/category, from which we can create multiple object like
		// dell, HP, Lenovo, apple, etc
		// Object - a physical entity

		Employee e1 = new Employee(); // Employee--is class
		// e1-- is object reference/object name
		// new Employee---- is object
		// if any one ask --what is a object in this line, then we have to say RHS not a
		// new employee
		// type of 'e1' is--- Employee, like int, char etc
		// when we create any object than JAVA will create copy of Class variable and
		// that copy is given to that newly created object

		// to access the class property we can write "object reference.class property"
		// like e1.name
		e1.name = "Tom";
		e1.age = 20;
		e1.city = "Bangalore";
		e1.salary = 12.33;
		e1.gender = 'm';
		e1.isActive = true;
		System.out.println(e1.name + " " + e1.age + " " + e1.isActive);

		Employee e2 = new Employee();
		// when we are creating object and we not given any value for that object and no
		// properties is define and we try to fetch a value than default value will
		// display
		// or in simple words
		// if we try to print value without assigning any value, than default value will
		// be printed like for
		// String--null
		// boolean--false
		// char--- (blank space)
		// int--- 0
		// double--- 0.0
		System.out.println(e2.name + " " + e2.age + " " + e2.salary + e2.gender + e2.isActive);

		// that are the object that have no reference
		new Employee().name = "Naveen";// if no reference than we not able to call a properties of this object
		// no reference Object
		new Employee().isActive = true;
		// two object is created with no reference
		// 1st object have all properties of class but only name properties value naveen
		// 2nd object have all properties of class but only isActive properties value
		// true

		// when heap memory is getting full automatically Grabage collector is getting
		// called by JVM, but if we want to call garbage collector explicitly than we
		// use this---but it not garanuty that gC will called, it wait for JVM(java
		// virtual machine), if JVM
		// allow than GC will be Called
		System.gc();

		Employee e3 = new Employee();
		e3.name = "Peter";
		e3.age = 40;
		System.out.println(e3.name);

		e3 = null;// it break the object reference and 'new Employee'--object--object reference is
					// null, than 'new Employee' object is called 'null reference object' and if
					// want to fetch properties of from 'e3'--it gives a null pointer exception

		// null reference means object reference is there but that object reference is
		// pointing to null
		System.out.println(e3.name);// NullPointerException - NPE

		// if any object--is null reference object and no reference than that objects
		// are destroy by Garbage collector

	}

}
