package javaBasic;

public class MethodOverloadingConcept {

	public static void main(String[] args) {
		// Order prefence -- int>long>Integer(warpper class)>int...(means int array)
		//or if we pass explicit data type like (byte) 29-- then it call byte variable method so on
		MethodOverloadingConcept test = new MethodOverloadingConcept();
		test.print(20);
		

	}
	
	public void print(Integer i) {
		System.out.println("Integer");
	}
	public void print(int i) {
		System.out.println("int");
	}
	public void print(int... i) {
		//int...   --- work as a integer array 
		System.out.println("int..");
	}
	public void print(long i) {
		System.out.println("long");
	}
	public void print(byte i) {
		System.out.println("byte");
	}
	public void print(short i) {
		System.out.println("Short");
	}
	

}
