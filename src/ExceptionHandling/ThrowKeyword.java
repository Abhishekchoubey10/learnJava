package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		String data = null;// lets assume we have reading a data from excel sheet/json file/external source
							// and data is coming null

		if (data == null) {
			try {
				throw new Exception("DATA NOT FOUND EXCEPTION");// we have use throw keywords to generate own custom
																// exception
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// in real time we are use throw keywords in framework also
		// condition is not satisfied
		// some data is mismatch
		// some data is not available
		// login is not successful

		// throw keyword is not handling a exception, it generating a own custom
		// exception
	}

}
