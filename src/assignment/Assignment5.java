package assignment;

import java.util.Arrays;

public class Assignment5 {

	public static void main(String[] args) {
		//Assignment separate a AA from 100
		//use String manipulation
		//use split
		//use replace
		//also try for double
		
		String p = "AA100";
		String t[] = p.split("");
		System.out.println(Arrays.toString(t));
		System.out.println(t[0]+t[1]);
		System.out.println(t[2]+t[3]+t[4]);
		

	}

}
