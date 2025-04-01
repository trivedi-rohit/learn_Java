/*
//Interface corresponds to Service Requirement Specification(SRS), 
//or 
//contract b/w client & service provider 
//or 
// 100% pure abstract class.


// Inside Interface every method is always abstract whether we are declaring or not,
// hence interface is considered as 100% pure abstract class.


//abstract class Accounts
interface Accounts
{
	// Method are abstract and public
	 void deposit();
	 void withdrawal();
	 void chkBal();
	 void printPassBook();
}


public class atest{
	public static void main(String[] args) {
		
	}
}
*/
//=========================================================================================

interface ISample
{
	// 100% abstract class
	// Method by default

	void m1();
	void m2();	
}

// Declaration & Implementation of Interface
// -----------------------------------------
// a. Whenever we are implementing an interface compulsorily for every method that interface,
//    we should provide implementation, otherwise we have to declare class as abstract and child class is responsible 
//    to provide implementation for remaining methods.
//
// b. Whenever we are implementing an interface method compulsorily it should be declared as "public",
//    otherwise it would result in "Compile Time Error".

//Rules of Overridding:
// 1. Method signature/visibility should not be changed.
// 2. In a class, default access modifier is "default"; so visibility should not be decreased make class method as public.

abstract class SampleImpl implements ISample
// class SampleImpl implements ISample  // Sample class Implementation 
{
	@Override		//indication to compiler that these methods are overridden methods
	public void m1()    
	{
		System.out.println("Hey, Implementation given for m1");
	}
	
	
//	@Override	 //indication to compiler that these methods are overridden methods
//	public void m2()
//	{
//		System.out.println("Hey, Implementation given for m2");
//	}
	
}

class SubSampleImpl extends SampleImpl
 {
	@Override
	public void m2()
	{
		System.out.println("Hey, Implementation given for subClass.");
	}
 }


public class InterfaceConcept_01{
	public static void main(String[] args) {
		ISample sample = new SubSampleImpl();  //loose coupling; Object of "SampleImpl" class
		sample.m1();
		sample.m2();
	}
}

