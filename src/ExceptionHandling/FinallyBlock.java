package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");

		// we can write try block without catch, at place of catch we have to write
		// finally, but finally block cannot handle exception,because there is no syntax
		// in finally block, finally block is always
		// executed, irrespective of there is exception is coming or not, return keyword
		// is written in try block (catch block
		// is not executed if exception is not coming)

		// we cannot write finally block individually, we have always write finally
		// block with try catch block or try block

		// On which case finally block is not executed?
		// System.exit(1);//jvm down--it terminate the execution(JVM goes down)// we
		// never use this // System.exit(1);---but we use this when some
		// phise(wrong)/attack/hacking things
		// will happening, than we have to write this within if else condition

		// System.exit(1);--is used for full shut down of JVM and System.exit(0);-- is
		// used for partial shut down
		try {
			int i = 9 / 3;
		}

//		catch (ArithmeticException e) {
//			System.out.println("some ex is coming..");
//			e.printStackTrace();
//		}

		finally {
			System.out.println("inside finally block...");
		}

	}

}
