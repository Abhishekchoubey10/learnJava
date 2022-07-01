package builderPatteren;

public class EcommerceApp {

	public EcommerceApp login() {
		System.out.println("login to app....");
		return this;// it means this method/function return current class object, where this
					// represent current class object(new EcommerceApp();), we have change the
					// return type from void to
					// EcommerceApp, to avoid to write EcommerceApp(); and we must have to create a
					// new object of EcommercApp();, we can use this keyword(we cannot write class name in return)
		
		// where we can use 'this' keyword(ask in interview)?
		//can we use 'this' keyword in constructor--yes
		//can we use 'this' keyword in our setter and setter method-- yes
		//can we use 'this' keyword in our business logic method(function)--yes
	}

	public EcommerceApp login(String un, String pwd) {
		System.out.println("login with : " + un + ":" + pwd);
		return this;

	}

	public EcommerceApp search(String productName) {
		System.out.println("searching the product: " + productName);
		return this;

	}

	public EcommerceApp search(String productName, int price) {
		System.out.println("searching the product: " + productName + ":" + price);
		return this;

	}

	public EcommerceApp addToCart(String productName) {
		System.out.println("adding to the cart: " + productName);
		return this;

	}

	public EcommerceApp doPayment(String CC, int otp) {
		System.out.println("make payment using: " + CC + ":" + otp);
		return this;

	}

	public EcommerceApp doPayment(String upi) {
		System.out.println("make payment using: " + upi);
		return this;

	}

	public EcommerceApp generateOrderId() {
		System.out.println("your order id is: " + 12345);
		return this;

	}

	public EcommerceApp logout() {
		System.out.println("logout from app....");
		return this;

	}
}
