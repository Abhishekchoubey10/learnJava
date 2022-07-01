package oop_Abstract;

public class TestPage {

	public static void main(String[] args) {

		// if we have not created any constructor in the class we have created object,
		// than Java will always create a default constructor, firstly it check is that
		// class have any parent class, if there any parent class then it calling parent
		// class constructor(if parent class doesnot have default constructor then java
		// will not create default class constructor in parent class) and first than
		// after it call child class constructor

		// if we pass any arguments the then it go child class then go to parent class
		// called parent class constructor(if parent class doesnot have default
		// constructor then java
		// will not create default class constructor in parent class and have parameter
		// constructor in parent class
		HomePage hp = new HomePage();
		hp.title();
		hp.url();
		hp.timeOut();
		hp.logo();

		LoginPage lp = new LoginPage();
		lp.timeOut();
		lp.title();
		lp.url();
		lp.doLogin();

		// top casting:
		Page p = new LoginPage();
		p.title();
		p.url();
		p.timeOut();
		p.logo();

	}

}
