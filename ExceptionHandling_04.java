//Execution of control flow in Nested Try-Catch Block:

public class ExceptionHandling_04 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside outter try");
		try {
			 	System.out.println("Inside inner try");
			 	System.out.println(10/0);
			}
		catch (ArithmeticException e) {
			System.out.println("Inside inner catch");
		}
		System.out.println("Outside inner try-catch");
		}
		catch(Exception e) {
			System.out.println("Inside outter catch");
		}
		finally {
			System.out.println("Inside outter finally");
		}
	}	
}
//==============================================================
/*
public class ExceptionHandling_04 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside outter try");
		try {
			 	System.out.println("Inside inner try");
			 	System.out.println(10/0);
			}
		catch (NullPointerException e) {
			System.out.println("Inside inner catch");
		}
		System.out.println("Outside inner try-catch");
		}
		catch(Exception e) {
			System.out.println("Inside outter catch");
		}
		finally {
			System.out.println("Inside outter finally");
		}
	}	
}
//==============================================================
*/


































