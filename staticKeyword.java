class Demo
{	
	//static variablea
	static int a;    
	static int b;	

	//Static Block
	static          
	{
		System.out.println("Static block");	
		a=10;  
		b=20;
	}

	// static method
	static void disp()   
	{
		System.out.println("Static Method");	
		System.out.println(a);	
		System.out.println(b);	
	}

	//instance variables
	int x;   
	int y;

	//java Block (non-static)
	{
		x=10;
		y=20;
		System.out.println("Non static java block");	
	}

	//Constructor
	Demo()
	{
		System.out.println("Constructor");	
	}

	//Method (non-static method)
	void disp1()
	{
		System.out.println("Non-Static Method");	
		System.out.println(x);	
		System.out.println(y);
	}
}


public class staticKeyword
{
public static void main(String[]args)
	{
		Demo.disp();
		Demo d=new Demo();
		d.disp1();
	}
}