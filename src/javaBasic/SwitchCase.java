package javaBasic;

public class SwitchCase {

	private static final char A = 0;

	public static void main(String[] args) {

		// How to write a switch
		// write 'switch then simultaneously press control plus space than we will see
		// switch template, than click on 'Enter'

		String browser = "  Chrome ";

		switch (browser.toLowerCase().trim()) {// "chrome" // it lower a sentence and trim the spaces 

		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch IE");
			break;

		default:
			System.out.println("please pass the right browser....");
			break;
		}

		//to implement this logic, it better to use if else, while loop or for loop 
		short marks = 100;
		switch (marks) {
		case 90:
			System.out.println("GRADE A");
			break;
		case 80:
			System.out.println("GRADE B");
			break;
		case 70:
			System.out.println("GRADE C");
			break;
		case 60:
			System.out.println("GRADE D");
			break;

		default:
			System.out.println("FAIL");
			break;
		}

		//Practical example of Switch case 
		//Cross browser testing
		
		// ENV selection: 
		String env = "QA";

		switch (env) {
		case "QA":
			System.out.println("run tcs on qa env...");
			int a = 10;
			int b = 20;
			int c = a + b;
			System.out.println(c);
			break;
		case "DEV":
			System.out.println("run tcs on dev env...");
			break;
		case "STAGE":
			System.out.println("run tcs on stage env...");
			break;
		case "UAT":
			System.out.println("run tcs on uat env...");
			break;
		case "PROD":
			System.out.println("run tcs on prod env...");
			break;

		default:
			break;
		}
	/*	
		char e = 'A';
		switch (e) {
		case A: {
			
			yield type;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + e);
		}
		*/
		
		//Switch cases only permitted to 'String Value' and 'Integer Value' 

		// RBAC -- user permission
		String role = "admin";// superadming, customer, vendor, partner, seller

	}

}
