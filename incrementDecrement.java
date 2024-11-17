package work;

public class incrementDecrement {

	public static void main(String[] args) {
	/*
	 int a = 5;
	 int b;
	 b= a++ + a++ + a++;
	 System.out.println(a);
	 System.out.println(b);
	 */
	 /*	
		int a = 5;
		int b;
		b= a++ + a++ + ++a;
		System.out.println(a);
		System.out.println(b);
	 */
	int a =5;
	int b;
//	b = ++a + a++ + ++a + a--;
//	b= a++ + --a - a-- - a++;
	b = a++ + a++ - a-- + ++a + a++;
	System.out.println(a);
	System.out.println(b);
		
	}

}
