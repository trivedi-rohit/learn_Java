//Rules to Override a method:
	
//1. We cannot reduce the visibility of overridden method; but we can increase it.

// Two code blocks separated by underline (_____)
// Return type of overridden method must be as that of overriding method in parent class.
/*
class Demoo111
{
	//"default" declaration, if not declare any public/private/protected.
	void disp()	
	{
		System.out.println("Demo in parent");	
	}
	public void disp2()
	{
	}
	public int add()
	{
		return 10+21;
	}
}
class Demoo2222 extends Demoo111
{
	// We can increase visibility.
	public void disp()
	{	
	}
//*********************************************
	// We cannot reduce visibility
	void disp2()
	{
	}
	// return type cannot be changed
	public void add()
	{
		System.out.println("Child");
		
	}
//*********************************************
 
}
class Test{
public static void main(String[]args) {
	Demoo111 d1 =new Demoo111();
	Demoo2222 d2 =new Demoo2222();
	System.out.println(d1.add());
	}
}
*/
//________________________________________________________________________________
//covariant return type:
/*
 * covariant refers to the ability of a method to return a type that is more specific 
 * than the one specified in the superclass method’s return type. 
 * This concept is most commonly applied to method overriding and the use of return types.
 * OR
 * Covariant allows a subclass to return a type that is a subtype of the return type of the method in the superclass.
 * OR
	Return type of overridden method in child class can be different as that of parent if it is
	covariant return type.
  */

/*
class Interest
{
}
//=========================================================================
class InterestPersonalLoan extends Interest
{
}
//-------------------------------------------------------------------------
class Loans
{
	//Method Name
	public Interest interest() // return type --> Interest
	{
		//object of Interest class "it" ("it" is of Interest type)
		Interest it =new Interest();
		return it;
	}
}
//==========================================================================
class PersonalLoan extends Loans
{
	//Method Name
		public InterestPersonalLoan interest()
		{
			//Object of "InterestPersonalLoan"-->IPL
			InterestPersonalLoan IPL =new InterestPersonalLoan();
			return IPL;
		}
}
//---------------------------------------------------------------------------
public class atest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
*/
//_____________________________________________________________________________
/*
Parameter of overridden method must  be same as that of parent,
else it will be considered as specialized method, considering method overloading.
*/
/*
class Demoo111
{
	//"default" declaration, if not declare any public/private/protected.
	void disp()	
	{
		System.out.println("Demo in parent");	
	}
	public void disp2()
	{
	}
	public int add()
	{
		return 10+21;
	}
	public int add(int a, int b)
	{
		return a+b;
	}
}
class Demoo2222 extends Demoo111
{
	// We can increase visibility.
	public void disp()
	{	
	}
	public int add(int a)
	{
		return a;
	}
}
class atest{
public static void main(String[]args) {
	Demoo111 d1 =new Demoo111();
	Demoo2222 d2 =new Demoo2222();
	System.out.println(d1.add());
	}
}
*/

