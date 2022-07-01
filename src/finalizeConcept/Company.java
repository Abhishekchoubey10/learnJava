package finalizeConcept;

public class Company {

	String name;

	public static void main(String[] args) {
		Company c = new Company();
		c = null;
		// c.name = "IBM";
		Employee e = new Employee();
		e = null;
		System.gc(); // we call garbage collector if it will go to check is there any finalize method
						// is there, is finalize method is present then it called the finalize method
						// and then after garbage collector destroy the object that have no object
						// Reference
	}

	@Override // overrideen method from object class
	// what the acivity we want to deactivate for object after object reference
	// pointing to null, that code we have to write here in finalize
	// all cleaner activity code we have to write
	public void finalize() {
		System.out.println("comp -- finalize method....");
	}
	
	//but after JDK 1.9 or 1.10 finalize method is removed and the have cleanup activity classes 

}
