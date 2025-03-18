class plane
{
	public void takeOff()
	{
		System.out.println("Plane is taking Off.");
	}
	public void fly()
	{
		System.out.println("Plane is flying.");
	}
	public void landing()
	{
		System.out.println("Plane is landing");
	}
}

class cargoPlane extends plane
{
	public void fly()
	{
		System.out.println("Cargo plane Flying at lower height.");
	}
	public void carryGoods()
	{
		System.out.println("Cargo plane carrying goods.");
	}
}
class passengerPlane extends plane
{
	public void fly()
	{
		System.out.println("Passenger plane is flying fast.");
	}
	public void carryPassenger()
	{
		System.out.println("Passenger plane carrying passenger");
	}
}

public class TypesOfMethods{
public static void main(String[]args){
	cargoPlane cp= new cargoPlane();
	cp.takeOff();	//inherited method
	cp.carryGoods();	//Specialized Method
	cp.fly();	//Overridden Method
	cp.landing();	//inherited Method

	passengerPlane pp=new passengerPlane();
	pp.takeOff();
	pp.carryPassenger();
	pp.fly();
	pp.landing();
}}
