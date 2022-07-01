package javaBasic;

public class User {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		User u1 = new User();
		u1.name = "Mohan";
		u1.age = 25;
		u1.city = "Bangalore";

		User u2 = new User();
		u2.name = "Nitesh";
		u2.age = 28;
		u2.city = "Pune";

		User u3 = new User();
		u3.name = "Pooja";
		u3.age = 30;
		u3.city = "LA";

		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		u1 = u2;// than u1 break a connection its start pointing object of u2 reference
		// and 1st object is become no reference object (not a null reference object)
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		u2 = u3;// than u2 break a connection its start pointing object of u3 reference
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		u3 = u1;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		// than we can conclude that we can define multiple reference for same object

	}

}
