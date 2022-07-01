package javaBasic;

/*
 * @author Abhishek 
 */
public class DataTypes {

	public static void main(String[] args) {

		// Data types
		byte b = 10;// '=' is assignment operator
		b = 20; // assign 20 to b --means older value 10 will change to 20
		// byte b = 30; //then java don't allow we because java say you already occupied
		// memory for b then why we creating another b
		byte b1 = 40;
		System.out.println(b);
		System.out.println(b + b1);// where '+' is arithmetic operator operator

		short i = 1000;

		int u = 11;
		int totalBill = 12222222;// int is used for bill

		long t = 44332678l; // always write 'l' or 'L' at last of long data type, so that java know that
							// this is
							// long data type
		System.out.println(t);

		float r = 12.75f; // we have to add suffix'f' to define this is float number to complier
		float f1 = (float) 34.44;// or write like this
		System.out.println(f1);

		double d = 12.3333;// we can add suffix 'd' to this number but not necessary to add 'd' in suffix
		double d1 = 100;
		System.out.println(d1);// 100.0

		char c = 'a';
		char c1 = '1';// '1' is define as char
		char c2 = '$';
		char c3 = 'h';
		char gender = 'f';
		char flag = 'Y';

		boolean fl = true; // here true is keywords , in pythan true is written as True
		boolean flg = false;

		System.out.println(10 % 2);// remainder 0
		System.out.println(5 % 2); // remainder 1

		byte f = 065; // to write a octal number, we have to add '0' before a number
		System.out.println(f);// it print decimal value of 65(octal number) // 53

		// byte j = 078; // these are not a correct octal number octal number define 0
		// to 7, but we can see that in both number 8 and 9 is present
		// byte u = 049;

	}

}
