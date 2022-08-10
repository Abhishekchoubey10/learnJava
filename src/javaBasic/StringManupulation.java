package javaBasic;

import java.util.Arrays;

public class StringManupulation {

	public static void main(String[] args) {
		String s = "this is my java code i am happy";// total length of string is 20 because space is also consider as
														// string

		System.out.println(s.length());// to get length of string

		System.out.println(s.charAt(0));// to find string that available at 0th position

		System.out.println(s.charAt(19));// to find string that available at 19th position

		// System.out.println(s.charAt(-1));//StringIndexOutOfBoundsException, because
		// in java index start with '0' index

		// System.out.println(s.charAt(20));//StringIndexOutOfBoundsException

		System.out.println(s.indexOf("t"));// to find index of character in string

		System.out.println(s.indexOf("java"));// it gives the index position of 'j' character
		// we can write in single code(') or in double code("), it doesn't matter at
		// time of finding a character position only

		System.out.println(s.indexOf('i'));// it gives the first character 'i' index position 2

		System.out.println(s.indexOf('i', s.indexOf('i') + 1));// it gives the 2nd 'i' index position , because it start
																// counting from 1st i position

		// find 3rd position of 'i' index
		System.out.println(s.indexOf('i', s.indexOf('i', s.indexOf('i') + 1) + 1));// 21
		
		//to print the 3rd position by storing in one variable 
		int k = s.indexOf('i', s.indexOf('i', s.indexOf('i') + 1) + 1);
		System.out.println(k);

		System.out.println(s.indexOf("python"));// position of the python is -1. because in java, if some thing is
												// not available than it giving by default -1

		String mesg = "welcome admin";
		if (mesg.indexOf("admin") > 0) {
			System.out.println("correct mesgg");
		}

		// trim:
		// it remove space from corner(means both sides) but it not remove space
		// between a character
		String s1 = "      hello selenium     ";
		System.out.println(s1.trim());

		// replace:
		// if we want replace some thing or want to trim space in between of
		// two word, than we use this method
		String s2 = "hello testing";// hellotesting
		System.out.println(s2.replace(" ", ""));

		String s3 = "      hello selenium     ";
		// System.out.println(s3.trim().replace(" ", ""));
		System.out.println(s3.replace(" ", ""));

		//
		String str = "this is selenium code";
		System.out.println(str.toUpperCase());// to convert string in uppercase
		System.out.println(str.toLowerCase());// to convert string in lowercase

		// equals:
		String t1 = "hello google";
		String t2 = "hello Google ";
		String t3 = "hello google";
		System.out.println(t1.equals(t2));// false, because one character in t2 string in uppercase, equals method
											// compare two string and o/p of equals method is boolean

		System.out.println(t1.equalsIgnoreCase(t2));// false, because one extra space character is present 2nd string,
													// equalsIgnoreCase is used to compare a two string irrespective of
													// there lower-upper case character and o/p of equalsIgnoreCase
													// method is boolean
		System.out.println(t1 == t3);// true

		// contains():
		String m = "welcome to testing";
		System.out.println(m.contains("welcome"));// contains method used to find the some word is present in the string
													// or not , and the o/p of contains method gives in boolean

		if (m.contains("welcome")) {
			System.out.println("this is correct");
		}

		// substring:
		String p = "this is my testing code";
		System.out.println(p.substring(3));// substring method say enter the index position from where you want to start
											// to counting
		System.out.println(p.substring(3, 12));// s is my t // substring method have another constructor where we can
												// give the starting count index position and ending index -1 counting
												// position

		String m1 = "your order id is 12345";
		System.out.println(m1.substring(m1.indexOf("is") + 3, m1.length()));

		String st = new String("hello");// this line create 2 object --1st inside a heap and 2nd inside the String constant
										// pool
		// thats why we never write a code like this(in form of 'new' keywords, so that
		// whenever we want to use string
		// we can write like--
		String st1 = "hello"; // leterals
		// because it create extra object unnesserary
		System.out.println(st == st1);// false
		System.out.println(st.equals(st1));// true

		// split:
		String test = "Java_Python_Ruby_JavaScript";
		String t[] = test.split("_");// split function always return string Array
		System.out.println(t.length);

		System.out.println(t[0]);
		// System.out.println(t[4]);//ArrayIndexOutOfBoundsException

		for (String e : t) {// for each loop to print Static string Array
			System.out.println(e);
		}

		//
		String pop = "xXJavaxXXPythonXxXTestingXXxXSelenium";
		String top[] = pop.split("xX");

		System.out.println(top[0]);// it showing blank space because before xX no value is there so that display as
									// blank space(for reference we can take a look on above split example)
		System.out.println(top[1]);
		System.out.println(top[2]);
		System.out.println(top[3]);
		System.out.println(top[4]);

		// null is a defined value in string

		// Real time use case-- where we can fill a form by splitting a given sting by
		// Semicolon(;)
		String empData = "tom;peter;30;LA;USA;90909090";
		String emp[] = empData.split(";");

//		for(String e : emp) {
//			System.out.println(e);
//		}
		System.out.println(Arrays.toString(emp));

		String pl = "hello testing java";
//		System.out.println(pl.split(" ")[0]);
//		System.out.println(pl.split(" ")[1]);
//		System.out.println(pl.split(" ")[2]);

		System.out.println(pl.split(" "));
		System.out.println(Arrays.toString(pl.split(" ")));

	}

}
