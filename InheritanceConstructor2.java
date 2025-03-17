//Memory map+Inheritance+Constructor(super(),this())
/*
//1. Constructor means same name as of class name and used to initialized objects.
//2. Constructor is not involved directly in inheritance(Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass (super())can be invoked from the subclass).
*/
class Parentt
{
	 int a,b,c;
	
	Parentt()
	{
		//this(111,222);
		a=10;
		b=20;
		System.out.println("Parent Constructor");
	}
	Parentt(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Parentt parametrised constructor");
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
	}
}

class childd extends Parentt
{
	int x,y;
	childd()
	{
		//super();
		this(111,222); //this() method will call same class constructor; method chaining will happen.
		x=100;
		y=200;
	}
	childd(int x, int y)
	{
		super(x,y); // To get parameterized constructor, super() is used explicitly here.
		this.x=x;
		this.y=y;
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
public class InheritanceConstructor2 {
	public static void main(String[] args) {
		childd c1=new childd();
		c1.disp();
		
		childd c2 =new childd(3000,4000);
		c2.disp();

	}

}
