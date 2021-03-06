package javaBasic;

public class Browser {

	// WAF: will launch the browser
	// input: browserName(String)
	// return: boolean(true/false)

	public boolean launchBrowser(String browserName) {
		System.out.println("browser name : " + browserName);
		// boolean flag = false;

		switch (browserName.toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			// flag = true;
			return true;// if we write return statement than at reaching this line program will
						// automatically return, so break become a dead code 
		// break;
		case "firefox":
			System.out.println("launch ff");
			// flag = true;
			return true;
		// break;
		case "safari":
			System.out.println("launch safari");
			// flag = true;
			return true;
		// break;
		case "ie":
			System.out.println("launch ie");
			// flag = true;
			return true;
		// break;
		default:
			System.out.println("browser is not found...." + browserName);
			return false;
		// break;
		}

		//return flag
	}

	public static void main(String[] args) {// main method is just used for calling point of view 

		Browser br = new Browser();
		if (br.launchBrowser("chrome")) {
			System.out.println("enter url");
		}

		if (br.launchBrowser("opera")) {
			System.out.println("enter url");
		} else {
			System.out.println("opera not available...");
		}

	}

}
