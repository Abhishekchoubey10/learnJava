package javaBasic;

public class Customer {
	// non static methods, class vars: are data members of the class
	// function can not created inside a function
	// functions are parallel to each other
	// functions are always independent to each other

	// return type: void: can not return any value
	// default function: 0 parameter
	// 1. no input and no return
	public void test() {
		System.out.println("test method");
		int a = 10;
		System.out.println(a + 20);
	}
	// print and return are two different thing
	// if we use system.out.println then it simply print value in console, when we
	// have use do calculation on value then return is better, because in return
	// value we can do calculation but in system.out.println, we cannot do
	// calculation on value

	// 2. no input and some return
	// return type: int
	// function name is always start with small letter
	// if we have only one keyword in function then write like-- get
	// if we have more than one keyword in function then first word start with small
	// letter and second word/third word start with capital letter-- like getMarks
	public int getMarks() {
		System.out.println("get marks method");
		// return 12; // not return, giving error
		int a = 10;
		int b = 20;
		int c = 90;
		int total = a + b + c;
		return total;
		// return 10; we cannot write two return keyword in same function and return
		// keyword should always be last statement
	}

	// return type: String
	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Naveen";
		return name;
	}

	// 3. some input and some return:
	public int add(int a, int b) {// add is method/function and a, b is parameter
		System.out.println("add method");
		int sum = a + b;
		return sum;
	}

	// WAF:
	// getStundetMarks
	// input param: name (String)
	// return marks (int)

	public int getStudentMarks(String name) {
		System.out.println("getting student marks for: " + name);
		int marks = -1;

		if (name.equalsIgnoreCase("Muneeb")) {// equalsIgnoreCase is used to compare the name in both capital and lower
												// case irrespective of what user can pass in boolean way 
			marks = 90;
		} else if (name.equalsIgnoreCase("Ravish")) {
			marks = 95;
		} else if (name.equalsIgnoreCase("Anu")) {
			marks = 80;
		} else if (name.equalsIgnoreCase("Naveen")) {
			marks = 10;
		} else {
			System.out.println("please pass the right student name: " + name);
		}

		return marks;

	}

	// without main method we cannot call a class, because JVM will never support
	public static void main(String[] args) {
		// call a function: have to create the object of this class
		Customer obj = new Customer();
		obj.test();

		// Always remember whenever we are calling a function and we are getting
		// something in return from particular function than we have to store in
		// particular variable----like if we get return in form of integer than we have
		// to store in integer variable
		int t = obj.getMarks();// t is called holding variable
		System.out.println(t + 50);

		// System.out.println(obj.getMarks()+30);
		String n = obj.getTrainerName();
		System.out.println("the trainer name is: " + n);

		int s1 = obj.add(20, 30);// here 20 and 30 are called argument , argument are real value
		System.out.println(s1);

		int m1 = obj.getStudentMarks("anu");
		System.out.println(m1);

		int m2 = obj.getStudentMarks("Tom");
		if (m2 == -1) {
			System.out.println("wrong student....");
		}
	}

}
