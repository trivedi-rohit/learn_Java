abstract class Loan
{
	abstract public void dispInterest();
	public void welcomeNote()
	{
		System.out.println("Welcome to XYZ Bank");
	}
}
class HomeLoan extends Loan
{
	public void dispInterest()
	{
		System.out.println("Interest rates for Home Loan is 12%.");
	}
	
}
class EducationLoan extends Loan
{
	public void dispInterest()
	{
		System.out.println("Interest rates for Education Loan is 10%.");
	}
}

public class AbstractionMethodAndClass{
public static void main(String[]args)
{
// Abstract class can have all methods abstract.
// Abstract class can both abstract & concrete(method with body) method.
// Abstract class can have all methods concrete.
// The sub-class/child class if extending abstract class then either have to implement abstract method (or) declare class abstract.
// Constructor cannot be made abstract, B'cos of super method call present in the constructor.
// Abstract class is incomplete class; but some(child) class can inherit and give the body.
// We cannot make abstract class as Final(as Final does not participate in inheritance).
// Final method can participate in inheritance(get inherited); But cannot be overridden. 
/*
Final method can not be made abstract? B'cos final methods does not participate in inheritance (as they are complete - Declaration+Implementation);
But abstract method are only declaration in parent class and  implementation is done in child/subclass.
*/
// Variables cannot be made abstract.
// We can create reference of abstract class(Loan).
	Loan loan=new HomeLoan();
//We cannot create object(instantiate) of abstract class.
	//Loan loa=new Loan();
	loan.welcomeNote();
	loan.dispInterest();
	
	System.out.println();
	
	Loan loan1=new EducationLoan();
	loan1.welcomeNote();
	loan1.dispInterest();
//Can we have constructor in abstract class=> Yes	
/*
	Yes, an abstract class in Java can have a constructor.
	
	Even though you can't create an instance of an abstract class directly, 
	a constructor in an abstract class can be used to initialize the state of the object when a subclass is instantiated. 
	The constructor of an abstract class is invoked when a subclass is created, 
	and it can be used to set up common state or functionality for all subclasses.
	
	Here’s an example:

	abstract class Animal {
	    // Constructor of the abstract class
	    public Animal(String name) {
	        System.out.println("Animal name is: " + name);
	    }
	}
	class Dog extends Animal {
	    public Dog(String name) {
	        // Calling the constructor of the abstract class
	        super(name);
	        System.out.println("This is a dog.");
	    }
	}
	public class Main {
	    public static void main(String[] args) {
	        Dog dog = new Dog("Buddy");  // Constructor of Animal is called here
	    }
	}

	In this example:
	The abstract class Animal has a constructor that takes a name argument.
	The Dog class extends Animal and calls the super(name) constructor to initialize the abstract class part of the object.
	This illustrates that while you can't directly instantiate an abstract class, its constructor can still be useful for initializing shared properties when the subclass is created.
*/
	}
}

