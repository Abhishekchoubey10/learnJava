package oopEncapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching browser....");
		// internally call all private method
		// this is also a encapsulation, when user is calling launchBrowser method by
		// creating a object in any class, then he will access all private method internally
		checkRAM();
		checkOSCompatible();
		checkBrowserVersion();
		checkBrowserUpdated();
		System.out.println(" browser is launched....");

	}

	private void checkRAM() {
		System.out.println("checking RAM");
	}

	private void checkOSCompatible() {
		System.out.println("checkOSCompatible");
	}

	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}

	private void checkBrowserUpdated() {
		System.out.println("checkBrowserUpdated");
	}

}
