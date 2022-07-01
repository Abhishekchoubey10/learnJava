package assignment;

public class Assignment3 {

	public String[] booking(String car) {
		System.out.println("CarType:" + car);
		String modal[] = new String[7];

		if (car.equalsIgnoreCase("Sedan")) {
			modal[0] = "City";
			modal[1] = "Civic";
			modal[2] = "Tata Indigo";
		} else if (car.equalsIgnoreCase("SUV")) {
			modal[3] = "Range Rover";
			modal[4] = "XUV700";

		} else if (car.equalsIgnoreCase("Mini")) {
			modal[5] = "Copper";
			modal[6] = "Swift";
		} else {
			System.out.println("Please Enter Correct Car Type...");
		}
		return modal;

	}

	public static void main(String[] args) {

		Assignment3 c = new Assignment3();
		String se[] = c.booking("sedan");
		for(String st : se) {
			if(st==null) {
				break;
			}
			System.out.println(st);
		}

	}

}
