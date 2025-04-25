//Exception can be handeled in 3 ways:
//	1. Handle Exception (try-catch block)
//	2. Duck the Exception (throws)
//	3.Re-throwing an Exceprion (throw, throws, try-catch, finally)
/*
// 1. Handle Exception (try-catch block)
import java.util.Scanner;
class Alpha{
	void alpha()
	{
		System.out.println("Connection established");
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first number to divide :");
		int num1=scan.nextInt();
		System.out.println("Enter second number to divide :");
		int num2=scan.nextInt();
		
		int res=num1/num2;
		
		System.out.println("The result is "+res);
		scan.close();
	}
}
class Beta{
	void beta() {
		Alpha a = new Alpha();
		a.alpha();
	}
}
public class ExceptionHandling_03{
	public static void main(String[] args) {
		try {
			Beta b=new Beta();
			b.beta();
		}
		catch(ArithmeticException e){
			System.out.println("Exception Handled in main.");
		}
	System.out.println("Connection terminated");
	}	
}
//==============================================================================

// 2. Duck the Exception (throws)
import java.util.Scanner;
class Alpha{
	void alpha() throws ArithmeticException
	{
		System.out.println("Connection established");
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first number to divide :");
		int num1=scan.nextInt();
		System.out.println("Enter second number to divide :");
		int num2=scan.nextInt();
		
		int res=num1/num2;
		
		System.out.println("The result is "+res);
		scan.close();
	}
}
class Beta{
	void beta() throws ArithmeticException
	{
		Alpha a = new Alpha();
		a.alpha();
	}
}
public class ExceptionHandling_03{
	public static void main(String[] args) {
		try {
			Beta b=new Beta();
			b.beta();
		}
		catch(ArithmeticException e){
			System.out.println("Exception Handled in main.");
		}
	System.out.println("Connection terminated");
	}	
}
//=================================================================================

// Unchecked Exception - not checked by compiler; occur at runtime only.
// Checked Exception - Risky code will be checked by compiler during compilation.
// If exception is handled in same block where exception occurs them control will not go to main method.
import java.util.Scanner;
class Alpha{
	void alpha() 
	{
		System.out.println("Connection established");
// If exception is handled in same block where exception occurs them control will not go to main method.
	try {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first number to divide :");
		int num1=scan.nextInt();
		System.out.println("Enter second number to divide :");
		int num2=scan.nextInt();
		
		int res=num1/num2;
		
		System.out.println("The result is "+res);
		scan.close();
		}
	catch(ArithmeticException e) 
		{
			System.out.println("Exception handled in alpha");
		}
	}
}
public class ExceptionHandling_03{
	public static void main(String[] args) {
		try {
		System.out.println("Main Method call");
		Alpha a=new Alpha();
		a.alpha();
		}
		catch(ArithmeticException e){
		System.out.println("Connection terminated in main method.");
		}
	}	
}
//=============================================================================
*/
// Re-throwing => when exception is handled in a catch block and its object is re-thrown. This used to handle the exception locally

import java.util.Scanner;
class Alpha{
	void alpha() throws ArithmeticException // "throws" is just indication to caller to handle this exception.
	{
		System.out.println("Connection established");
// If exception is handled in same block where exception occurs then control will not go to main method.
	try {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first number to divide :");
		int num1=scan.nextInt();
		System.out.println("Enter second number to divide :");
		int num2=scan.nextInt();
		
		int res=num1/num2;
		
		System.out.println("The result is "+res);
		scan.close();
		}
	catch(ArithmeticException e) 
		{
			System.out.println("Exception handled in alpha");
			throw e;  //re-throwing exception from method alpha to main method/
		}
		//System.out.println("Connection is terminated"); // statement below throw keyword will not be executed.
	// If statement below throw keyword are critical/important, then that must be put in "finally" block.
	finally {
	System.out.println("Connection is terminated"); 
	}
	}
}
public class ExceptionHandling_03{
	public static void main(String[] args) {
		try {
		System.out.println("Main Method call");
		Alpha a=new Alpha();
		a.alpha();
		}
		catch(ArithmeticException e){
			System.out.println(e.toString());
			//e.printStackTrace();
		System.out.println("Exception handled in main method.");
		}
	}	
}
//=============================================================================



