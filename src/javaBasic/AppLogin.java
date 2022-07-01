package javaBasic;

import java.util.HashMap;
import java.util.Map;

public class AppLogin {

	public static void main(String[] args) {

		// Real time example of hash map--when we have multiple user name and password
		// RBAC: user roles //RBAC--role back access control
		// we have different type of users like---customer, admin, seller, partner,
		// vendor, distributor
		// and everyone is using--- amazon.com -- login page

		getCredentials("customer");
		getCredentials("vendor");

		// Product Meta Data -- hashmap

		// LinkedHashMap
		// TreeMap

	}

	public static void getCredentials(String role) {
		Map<String, String> credMap = new HashMap<String, String>();

		credMap.put("customer", "tom@gmail.com:tom@123");// in value-- tom@gmail.com--is emailid and tom@123-- is
															// password
		credMap.put("admin", "admin@gmail.com:admin@123");
		credMap.put("seller", "seller@gmail.com:seller@123");
		credMap.put("partner", "partner@gmail.com:partner@123");
		credMap.put("vendor", "vendor@gmail.com:vendor@123");

		String credData = credMap.get(role);// tom@gmail.com:tom@123
		String userName = credData.split(":")[0];
		String password = credData.split(":")[1];

		doLogin(userName, password);

	}

	public static void doLogin(String userName, String password) {

		System.out.println("username is : " + userName);
		System.out.println("password is : " + password);

		System.out.println("login is done");
	}
}
