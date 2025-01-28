// Working with methods in java.
//Type-1 :
/*
class LaunchCal
{	
		int  a,b,c; // Instance Variable
		void add()
		{
			a=10;
			b=20;
			c=a+b;
			// int res;  //Local variable
			System.out.println(c);
		}}

public class method {
	public static void main(String[] args) {
		LaunchCal calc=new LaunchCal();
		calc.add();
	}
}
*/

//Type - 2:
/*
class Calculator{
	int res;
	void add(int a, int b)
	{
		res = a+b;
		System.out.println(res);
	}
}
public class method{
	public static void main(String args[]) {
		Calculator calc = new Calculator();
		calc.add(10,5);
	}
}
*/

// Type -3:
/*
class calculator{
	int a,b,res;
   int	add()
	{
		a=10;
		b=20;
		res =a+b;
		//System.out.println(res);
		return res;
	}
}
public class method{
	public static void main(String args[]) {
		calculator calc = new calculator();
		int c = calc.add();
		System.out.println(c);
	}}
*/
//=========================================================================
/*
//Method Overloading or early binding or compile time polymorphism:
// Method Overloading:// Method Overloading
//Refers to process of writing more than one method with same name and different parameter within a class.
***compiler resolves the conflict of following:
*1. Number of parameters.
*2. Data type of parameters.
*3. Order of data type of parameters.
//return type has no role to play.
*/
//=========================================================================
/*
class calculator1{
	int add (int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
	float add (int a, float b) 
	{
		return a+b;
	}
	float add(float a, float b)
	{
		return a+b;
	}
	float add(int a, float b, float c) 
	{
		return a+b+c;
	}
	double add (int a, int b, double c)
	{
		return a+b+c;
	}
	double add(double a, double b, double c)
	{
		return a+b+c;
	}
	void add(float a, int b)
	{
		int c = a+b;
		 System.out.println(c);
		 }
}
public class method{
	public static void main(String args[]) {
		calculator1 calc = new calculator1 ();
		int a =10, b=20, c=30;
		float m =10.5f, n= 20.5f, o=30.5f;
		double x=15.5, y=25.5, z=35.5;
		
		System.out.println(calc.add(a,b));
		System.out.println(calc.add(m, n));
		System.out.println(calc.add(a,b,c));
		System.out.println(calc.add(x, y, z));
		System.out.println(calc.add(a, b, x));
		System.out.println(calc.add(a, y, n));
	}}
*/
//====================================================================
/*
// Method Overloading with Numeric Type Promotion.
class calculator1
{
	float add (float a, int b)
		{
			return a+b;	
		}
	float add(float a, float b, int c)
	{
		return a+b+c;	
	}
}
public class method{
	public static void main(String[] args) {
		calculator1 cal = new calculator1();
		System.out.println(cal.add(5, 4));
	}}
*/
//====================================================================
/*
class Display{
	void disp()
	{
	System.out.print("Rohit");
	}
	void disp(String name)
	{
		System.out.println(name);
	}
	void disp(int age)
	{
		System.out.println(age);
	}
}
class method{
	public static void main(String[] args) {
		Display d=new Display();
		d.disp("Rahu");
		d.disp(32);
		d.disp();
	}}
*/
//======================================================================
/*
//We can overload main method however JVM will call such a main method which accept string of args as parameters.

public class method
{
	public static void main(String[]args)
	{
		System.out.print("Its actuial main method");
	}
	public static void main(int[]args)
	{
		System.out.print("Accepting int arguments");
	}
	public static void main(double b)
	{
		System.out.print("double value");
	}}
*/
//==================================================================





















