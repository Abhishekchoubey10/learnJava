package javaBasic;

public class LoopConcept {

	public static void main(String[] args) {

		// 1 to 10:
		// 1. while loop:

		int i = 1;
		while (i <= 10) {
			System.out.println(i);// 1 2 3 4 5 ...10
			i++;
			// ++i;
			// i=i+1;
		}

		System.out.println("--------");

		int k = 1;
		while (k <= 100) {
			System.out.println(k);
			if (k % 5 == 0) {// %--is called modulas --that give remainder
				System.out.println("hiiii");
				break;
			}
			k++;
		}

		// use cases of while loop:
		// 1. you have to use while loop when number of iterations are not fixed//
		// iteration means--loop

		// 2. waiting for the element on the page //if we don't know at what time
		// element is visible on page or how many second we have to wait to element
		// become visible

		// 3. waiting for the page to be loaded //may time we are launching google,
		// amazon.com and we don't know how many time we have to wait to page to load
		// completely, it depend on Internet speed, loading on page

		// 4. pagination : 1 2 3 4 5 6 ....11..20 // where we have search for one
		// specific element that display on one of the page if we find that element on
		// any page, than we have to break a loop 

		System.out.println("--------");

		// this is practical use of while loop, where we have print/display welcome to
		// taj hotel 24 hour
//		while(true) {
//			System.out.println("welcome to TAJ HOTEL");
//		}

		// 2. for loop:
		// 1 to 10:
//		for(int j = 1; j<=10; ++j) {
//			System.out.println(j);//12345...10
//		}

		int j = 1;
		for (; j <= 10;) {
			System.out.println(j);// 12345...10
			++j;
		}

		System.out.println("---10 to 1-----");

		for (int l = 10; l >= 1; l--) {
			System.out.println(l);// 10 9
		}

		System.out.println("--------");

//		for(; ;) {// if we remove break than this condition satisfied always and print hello infinite time 
//			System.out.println("Hello");
//			//break;
//		}

		// use cases of for loop:
		// 1. use for loop when number of iterations are fixed
		// 2. drop down traversing
		// 3. menu items of the page
		// 4. calendar handling

		// 3. do-while loop:
		//in this loop statement is executed min 1 time, even after condition is false 
		int p = 1;
		do {
			p++;
			System.out.println(p);// 2 3 4 ...10 11
		} while (p <= 10);

		// 4. for each-- is apply on array 
		// 5. streams

		System.out.println("***********");
		//print
		//00 01 02 03 04
		//10 11 12 13 14
		//20 21 22 23 24 
		//30 31 32 33 34
		//40 41 42 43 44
		
		for(int n =0; n<=4; n++) {
			for(int m = 0; m<=4; m++) {
				System.out.print(n+""+m+" ");
				//System.out.print(" ");
			}
			System.out.println();
		}
	}

}
