// Ways to create inner class:
/*
class B
{	}
public class InnerClass{
	int num;
	
	//To create object of Inner Class
	A og=new A();
	public void show()
	{
		System.out.println("in show : "+ num);
		og.config();	
	}
	class A  //Inner Class
	{
		public void config()
		{
			System.out.println("in config "+num);
		}}

	public static void main(String[] args) {
		InnerClass obj=new InnerClass();
		obj.show();
		System.out.println(obj.num);
	}}	
*/
//============================================================================
/*
class aA
{ 
	//B og=new B();
	public void show()
	{
		System.out.println("in Show");
		//og.config();
	}
	//static class B
	class B
	{
		public void config()
		{
			System.out.println("in Config ");

		}
	}
}
public class InnerClass{
	public static void main(String[]args) 
	{
		aA obj=new aA();
		obj.show();
		
		 // A.B ogg; //need to make inner class static 
		 // ogg = new A.B(); 
		 // ogg.config();
		
		aA.B obj1;
		obj1 = obj.new B();
		obj1.config();	
	}} 
*/
//=============================================================================
/*
class computer
{
	public void config()
	{
		System.out.println("in Computer COnfig");
	}
}

public class InnerClass{
	public static void main(String[] args) {
		
		//anonymous inner class
		computer obj = new computer()  
		{
			public void config()
			{
				System.out.println("something new");
			}
		};
		
		obj.config();
	}}
*/
//===============================================================================
/*
abstract class Computer
{
	public abstract void config();
}

 // class Laptop extends Computer { 
 // public void config() {
 // System.out.println("Its working");  } }
 
public class InnerClass{
	public static void main(String[] args) {
		
		 // Laptop obj=new Laptop(); 
		 // obj.config();
		 
		Computer co=new Computer()
		//anonymous inner class
		{
			public void config()
			{
				System.out.println("Working fine");
			}
		};
		co.config();
	}}
*/





























