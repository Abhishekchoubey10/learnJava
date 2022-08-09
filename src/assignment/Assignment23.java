package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment23 {

	public static void main(String[] args) {
		/**
		 * Write a Java Program to Swap two Element in an array List
		 * 
		 * @author Abhishek kumar
		 */
		System.out.println("Write a code using Static Array");
		
		String[] at = {"100", "200", "300", "400"};
		System.out.println("Before Swap:" +Arrays.toString(at));
		List<String> a = Arrays.asList(at);
		Collections.swap(a, 0, 2);
		System.out.println("After Swap:" +Arrays.toString(at));
		
		System.out.println("Write a copy using dynamic array");
		
		ArrayList<String>list = new ArrayList<String>();
		list.add("Abhishek");
		list.add("Pravendra");
		list.add("mohan");
		list.add("Prakash");
		for(Object e: list) {
			System.out.println(e);
		}
		//List<ArrayList<String>> ap = Arrays.asList(list);-- not required 
		Collections.swap(list, 0, 2);
		
		for(Object et: list) {
			System.out.println(et);
		}

	}

}
