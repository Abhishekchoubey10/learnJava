package assignment;

public class Assignment14 {

	public static void main(String[] args) {
		
		/**
		 * @author Abhishek kumar
		 * Write a cricket score card system using for loop, while loop and switch case:
		 * if(score == 0) -- print - "Zero - duck"
		 * if(score == 25) -- print - "good job"
		 * if(score == 50) -- print - "good job - half century"
		 * if(score == 100) -- print - "good job - century"
		 */

		System.out.println("Write a program using while loop");
		int Cri_Score = 50;
		while(Cri_Score<=100) {
			if(Cri_Score == 0) {
				System.out.println("Zero duck");
				break;
			}
			else if(Cri_Score ==25) {
				System.out.println("Good job");
				break;
			}
			else if(Cri_Score ==50) {
				System.out.println("Good job - half century");
				break;
			}
			else if(Cri_Score ==100) {
				System.out.println("Good job- century");
				break;
			}
		}
		
		System.out.println("Write a program using for loop");
		
		for(int Cri_score =0; Cri_score<=100;) {
			if(Cri_score == 0) {
				System.out.println("Zero duck");
				break;
			}
			else if(Cri_score ==25) {
				System.out.println("Good job");
				break;
			}
			else if(Cri_score ==50) {
				System.out.println("Good job - half century");
				break;
			}
			else if(Cri_score ==100) {
				System.out.println("Good job- century");
				break;
			}
		}
		
		System.out.println("Write a code using switch case");
		int CriScore= 100;
		switch (CriScore) {
		case 0: 
			System.out.println("Zero duck");
			break;
		case 25: 
			System.out.println("Good job");
			break;
		case 50: 
			System.out.println("Good job - half century");
			break;
		case 100: 
			System.out.println("Good job - century");
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + CriScore);
		}
	}


}
