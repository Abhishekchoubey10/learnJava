package builderPatteren;

public class TestAmazon {

	public static void main(String[] args) {

		EcommerceApp obj = new EcommerceApp();

		// Advantage of user point of view to return same class object,
		// so that we user want to access all method of user class after creating a
		// object, than we provide all method to him
		// this is called builder pattern that create chaining of the method
		// if we don't use 'this' keyword then we have to call all method individually
		// like objectreference.method name individually
		
		//builder pattern is very useful in workflow based application in backend

		// but in selenium builder pattern create some problem in page create modal

		// use case-- login a app with id and password, search imac, add to card, do
		// payment using credit card with pin, then display order id, and than logout
		obj.login("naveen@gmail.com", "naveen@123").search("iMac").addToCart("iMac")
				.doPayment("1212 2222 3333 4444", 1234).generateOrderId().logout();

		// use case-- login a app with id and password, search iphone than logout
		obj.login("naveen@gmail.com", "naveen@123").search("iphone 13").logout();

		// use case-- login a app with id and password, than logout
		obj.login("naveen@gmail.com", "naveen@123").logout();

		// use case-- login a app with id and password, and add macbook to card
		obj.login("naveen@gmail.com", "naveen@123").addToCart("macbook");

		// use case-- earlier day user forgot to logout, and our system support
		// SSO(single signout), so use can use a app without any login-- use default
		// login--display earlier orderID, search for iphone12 with price 10000 and add
		// to
		// card than logout
		obj.login().generateOrderId().search("iph12", 10000).addToCart("iph12").logout();
	}

}
