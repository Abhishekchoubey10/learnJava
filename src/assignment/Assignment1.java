package assignment;

public class Assignment1 {

	public static void main(String[] args) {
		
		//find greater number among them 
		byte a = 98;
		byte b = 94;
		byte c = 120;
		byte d = 73;
		
		if(a>b && a>c && a>d) {
			System.out.println("a is greatest number");
		}else if(b>c && b>d) {
			System.out.println("b is greatest number");
		}else if(c>d) {
			System.out.println("c is greatest number");
		}else {
			System.out.println("d is greatest number");
		}

	}

}
