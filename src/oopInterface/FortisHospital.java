package oopInterface;

//first we use parent child extends than we have to use implements , it not allow to write extends after interface 
public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

	// for real time scenario, usmedical, ukmedical, indianmedical, WHO all are
	// Organization the implement some rule and service is given by hospital not by
	// these organization so we use this concept

	// US
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");

	}

	@Override
	public void entServices() {
		System.out.println("FH -- entServices");

	}

	// UK
	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");

	}

	// India
	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");

	}

	@Override // if there same method in different interfaces than class will implements only
				// one method that common in these interfaced
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
	}

	// FH:
	public void optServices() {
		System.out.println("FH -- optServices");
	}

	public void medicalInsurance() {
		System.out.println("FH -- medicalInsurance");
	}

	// method hiding
	public static void billing() {
		System.out.println("FH -- billing");
	}

	@Override
	public void medicalTraining() {
		System.out.println("FH -- medical training");
	}

	@Override
	public int getPatientNumber(String name) {
		if (name.equals("Naveen")) {
			return 100;
		} else if (name.equals("Tom")) {
			return 200;
		} else {
			return -1;
		}

	}

	@Override
	public void covid19Vaccination() {
		System.out.println("FH -- covid19Vaccination");
	}

	@Override
	public void covid19Research() {
		System.out.println("FH -- covid19Research");

	}
}
