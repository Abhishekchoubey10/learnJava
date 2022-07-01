package javaBasic;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		// <key, value> -- pair/segment
		// HashMap class - default class that already available in java, that store
		// value in <key, value> where every key and value is called pair/segment --it
		// internally implements Map (Interface)

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put(null, 60);

		map.put("Sandeep", 100);// 3 // to add in hash map we have to use put method
		map.put("Manas", 90);// 5
		map.put("Swapana", 95);// 3
		map.put("Dhrumil", 80);
//		map.put(null, 50);// when we write two null key two times,it not give any error at both compile time and run time 
		// but we are not allow to maintain two null key, if we write next null key than
		// latest null key will replace the previous one
//		map.put("Naveen", null); // we have allow to maintain value is null for different key 
//		map.put("Tom", null);
//		map.put("Sandeep", 70);// if we create same key again(multiple same key), it will replace/override 
		// the value of key that we have written earlier
//		map.put(null, null);
		map.put("Swapana", 95);// 3
		map.put("Swapana11", 95);// 3
		map.put("Swapana212", 95);// 3
		map.put("Swapana2233", 95);// 3
		map.put("Swapana11121", 95);// 3

		// hash map is order less collections(means it not store value on based on
		// written index, there index is automatically randomly calculated by java, but
		// array list is
		// order based collection
		System.out.println(map.get("Sandeep"));// to print a value we just have to pass key
		System.out.println(map.get("Swapana"));

//		System.out.println(map.get(null));// if there is two null key is present in hash map, then latest/new null key value get printed 
//		System.out.println(map.get("Naveen"));
//		System.out.println(map.get("Tom"));

		// we can iterate/print the hashmap by using 'forEach' method where k-is key,
		// v-is value, -> is supply to(where k and v are not a regular parameter)
		//print order of hashmap based on which index order that pair is store in hashmap
		map.forEach((k, v) -> System.out.println(k + ":" + v));

		System.out.println("-------");

		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		mp.put(1, 100);
		mp.put(11, 1100);
		mp.put(111, 11000);
		mp.put(2, 200);
		mp.put(22, 2200);

		mp.forEach((k, v) -> System.out.println(k + ":" + v));
		
		//'-' is called a lamda

	}

}
