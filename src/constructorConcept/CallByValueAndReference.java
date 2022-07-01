package constructorConcept;

public class CallByValueAndReference {

	String name;
	int age;

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void sendMail(CallByValueAndReference t1) {// this t1 is object reference it pointing to new
														// CallByValueAndReference(); object
		System.out.println(t1.name);
		System.out.println(t1.age);
	}

	public static void main(String[] args) {

		CallByValueAndReference obj = new CallByValueAndReference();
		obj.add(10, 20);// call by value

		obj.name = "Tom";
		obj.age = 20;

		obj.sendMail(obj);// call by reference

	}

}
