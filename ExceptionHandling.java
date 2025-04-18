
//Method Hiding
class parent
{
	public static void disp()
	{
		System.out.println("Hello Parent");
	}
}
class child extends parent
{
	// specialized method or method hiding in java
	public static void disp()
	{
		System.out.println("Hello child");
	}
}
//static method also participate in inheritance
public class ExceptionHandling {
	public static void main(String[] args) 
	{
		parent p = new child();
		p.disp();
//		child c1=new child();
//		c1.disp();
	}
}