class studentDB
{
	private String name;
	private int age;
	private String city;
	
	/*
	// Common Setter 
	public void setData(String name, int age, String city) 
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}
	*/
	
	// Constructor
	public studentDB(String name, int age, String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
}

public class EncapConstructor {

	public static void main(String[] args) {
		// constructor is called/invoked at the time of object creation.
		studentDB s1=new studentDB("Rohit",32,"Lucknow");
		System.out.println("Name : "+s1.getName());
		System.out.println("Age  : "+s1.getAge());
		System.out.println("City : "+s1.getCity());

	}

}
