package javaBasic;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		// ArrayList -- default class in Java// because of that ArrayList name start
		// with capital letter
		// ArrayList is Non-Primitive Data type
		// ArrayList is dynamic array
		// ArrayList is order based/index based AL
		// ArrayList is part of collections

		ArrayList ar = new ArrayList();// vc = 10 // this is raw type ArrayList, this is not a good practice to write a
										// ArrayList
		System.out.println(ar.size());// 0--PC = 0//'ar.size' is method that give length of dynamic array and
		// its always give Physical Capacity

		ar.add(100);// 0// .add is method to enter value/add value in ArrayList
		ar.add(200);// 1

		System.out.println(ar.size());

		ar.add(300);// 2
		ar.add(400);// 3

		System.out.println(ar.size());

		ar.add(12.33);// 4
		ar.add('h');// 5
		ar.add(true);// 6
		ar.add("testing");// 7

		System.out.println(ar.size());

		System.out.println(ar.get(1));// to print index 1 value
		// li = 0 //li--means lowest index
		// len = ar.size()--> PC = 8 //len--means length
		// hi = len - 1==> 7 //hi--means highest index

		// System.out.println(ar.get(-1));//IOB--means index out of bound index
		// System.out.println(ar.get(8));//IOB

		System.out.println("--------");
		// to get all the values from array list:
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));// 100
		}

		System.out.println("--------");

		// each loop
		for (Object e : ar) {
			System.out.println(e);
		}

		System.out.println("--------");

		ArrayList ar1 = new ArrayList(20);// 20 virtual segment will created
		System.out.println(ar1.size());

		// generics:

		ArrayList<Integer> marksList = new ArrayList<Integer>(); // the generics of this ArrayList is Integer
		marksList.add(100);
		marksList.add(200);
//		marksList.add("hello");
//		marksList.add(12.33);

		ArrayList<Object> empData = new ArrayList<Object>(); // the generics of this ArrayList is Object
		empData.add("Tom");
		empData.add(25);
		empData.add('m');
		empData.add(12.33);
		empData.add(true);

		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("Tom");
		namesList.add("naveen");
		System.out.println(namesList.size()); // to get size of ArrayList we use .size() method

		//
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);// 0
		numbers.add(200);// 1
		numbers.add(300);// 2
		numbers.add(400);// 3
//		System.out.println(numbers.get(2));//300
//		System.out.println(numbers.size());//4
//		
//		numbers.remove(2);// it remove the number from 2nd index --means it remove 300, than number 400 shifted at index 2 
//		System.out.println(numbers.get(2)); //400
//		System.out.println(numbers.size());//3

		System.out.println(numbers.get(3));// 400
		numbers.add(3, 500); // it replace/update a value of index 3
		// ArrayList is order based if try add value at 3rd position without
		// adding/define value for lower index,
		// than if we try to print value of that current define value at 3rd position
		// directly, than that give you Index Out Of Bound Index
		System.out.println(numbers.get(3));// 500

		//static array
		//there is no any connect of virtual capacity in static array 
		int i[] = new int[4];
		i[2] = 10;
		System.out.println(i[2]);// 10
		System.out.println(i[0]);// 0

		int j[] = { 1, 2, 3, 4, 5, 6 };// static array literals
		// if we already know the how many value i have , than we can use array literals 
		System.out.println(j.length);
		j[0] = 200;// replace value of index 0 
		System.out.println(j[0]);

	}

}
