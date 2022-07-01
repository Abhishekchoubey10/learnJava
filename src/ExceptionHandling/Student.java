package ExceptionHandling;

public class Student {

	public static int getMarks(String name) {

		System.out.println("student name : " + name);

		if (name.equals("Sandeep")) {
			try {
				int marks = 10 / 2;
				// System.exit(1);//jvm down
				return 80;
			} catch (ArithmeticException e) {
				System.out.println("some ex is coming....");
				return 70;
			} finally {
				System.out.println("Bye");
				return 90;
			}
		} else if (name.equals("Roopali")) {
			return 100;
		} else if (name.equals("Naveen")) {
			return 10;
		} else {
			System.out.println("student is not present");
			return -1;
		}

	}

	public static void main(String[] args) {

		int m1 = getMarks("Sandeep");
		System.out.println(m1);

		// real time example of finally block
		
		// we have to close the database connection after fetching a value ,
		// otherwise the connection is always in background and always connected to the
		// database all the time and than unnecessary the connection pull we are using
		// that are drastically/badly impact the performance of the system
		
		// db connection -- pass
		// pass sql string -- pass
		// try{
		// results from db -- exceptions // no exception
		// }
//		catch() {
//			some sql exception is coming
//		}
//		finally {
//			//close db connection
		// close excel / file / prop file / xml /json/
		// driver.quit
//		}
		// print the result from db

	}

}
