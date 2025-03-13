class Memo{
	// non-static method in Demo class
void dispp2()
{
	System.out.println("disp_2");
	System.out.println(StaticControlFLoww.b);
}}

class StaticControlFLoww
{
	static int a;
	static int b;
	
	static 
	{
		System.out.println("Static Block");
		a=10;
		b=20;
	}

	static void dispp()
	{
		System.out.println("Static disp method");
		System.out.println(a);
		System.out.println(b);
	}


public static void main(String[]args) { 
	System.out.println();
	System.out.println("Main Method");
	// TO access non-static method inside a static method, we need an instance to call disp2()
	Memo d=new Memo();
	d.dispp2();
	StaticControlFLoww.dispp();	
} 
}