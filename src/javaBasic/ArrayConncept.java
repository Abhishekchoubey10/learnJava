package javaBasic;

public class ArrayConncept {

	public static void main(String[] args) {

		// Array is a collection of similar data type
		// Array means a special variable, which hold some space inside the memory, but
		// it always maintain similar type of data, and we can store multiple value of
		// similar type of data
		
		//Real time example
		//1. dropdown with fixed value 
		//2. handling menu items 
		//3. handling calendar, month and day 
		

		// limitations of array:
		// 1. size is fixed: static array: to overcome this, we need to use dynamic
		// array(ArrayList)
		// 2. stores only similar types of data:to overcome this, we can use Object array (static)

		// 1. int array:
		int i[] = new int[4]; // this '4' is length of this array
		// 'new' is keyword to create a array
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		// i[4] = 50;//ArrayIndexOutOfBoundsException

		System.out.println(i[0]);
		System.out.println(i.length); // to find the static array length, we use '.length' variable, 'length' is
										// variable that is already define in JAVA

		int li = 0;
		int len = i.length;
		int hi = len - 1;
		System.out.println(li);
		System.out.println(len);
		System.out.println(hi);

		System.out.println(i[3] + i[0]);
		// System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		// System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		// lowest index in Array is always start with '0'
		System.out.println("-------");

		// how to fecth the values from array: for loop:
		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);// 10 20 30 40
		}
		
		System.out.println("Print array in reverse order");
		for(int f=hi; f>=0; f--) {
			System.out.println(i[f]);
		}
		System.out.println("-------");

		// for each loop:
		// Limitation : we cannot print reverse order indexing using each loop,if you
		// want to print reverse order indexing than we have to use 'for loop'
		for (int e : i) { // 'i' is array name that we have define in line 24
			System.out.println(e);
			if (e == 30) {
				System.out.println("hiiii");
				break;
			}
		}

		System.out.println("-------");

		// 2. double:
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 23.33;
		System.out.println(d[0] + d[1]);

		// char:
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '1';
		c[2] = '$';

		//
		int a[] = new int[10];
		a[5] = 10;
		System.out.println(a[0]);// because by default, if we not define any value for index 0, it gives
									// default value '0'

		// String:
		String s[] = new String[3];
		s[0] = "Java";
		s[1] = "Python";
		s[2] = "JS";
		System.out.println(s[0]);

		for (String n : s) {
			System.out.println(n);
		}
		System.out.println("------");
		for (int p = s.length - 1; p >= 0; p--) {
			// for (int p < s.length; p>=0; p--) { // we cannot write comparison operator,
			// while defining any variable like int p < s.length
			System.out.println(s[p]);
		}

		System.out.println("------");
		// interview question -- to print a to z or print ASCII value of a to z
		for (char b = 'a'; b <= 'z'; b++) { // we can use this because character is also came from numeric family
			System.out.println((int) b);
		}

		System.out.println("------");

		// emp data: String, int, double, boolean, char
		// Object Array: static array:
		Object emp[] = new Object[5];
		emp[0] = "Tom";
		emp[1] = 30;
		emp[2] = 23.33;
		emp[3] = true;
		emp[4] = 'm';
		// emp[5] = "01-01-1990";// AIOB

		for (Object e : emp) {
			System.out.println(e);

		}

		for (int n = 0; n < emp.length; n++) {
			System.out.println(emp[n]);
//				if(emp[n] == 30) {// we cannot write like this because we cannot compare object type with integer type 
			if(emp[n].equals(true)) {
				System.out.println("got true");
				break;
			}
//					
//				}
		}

	}

}
