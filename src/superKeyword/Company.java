package superKeyword;

public class Company implements Funds{
	
int salary = 100;
	
	public Company() {
		System.out.println("comp -- const...");
	}
	
	public Company(int a) {
		super();// its calling a default constructor of object class
		System.out.println("comp -- const..." + a);
	}
	
	public void cafe() {
		System.out.println("Comp -- cafe");
		System.out.println(salary);
	}
	
	public final static void logo() {
		System.out.println("comp -- logo");
	}
	
	

}
