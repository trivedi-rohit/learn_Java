class student2
{
	private String name;
	private int age;
	private String city;
	/* 
	 * If constructor is not defined by programmer, 
	 * then compiler will define a default constructor,
	 * whenever the constructor is called and it will be of zero parameter. 
	 * _____________________
	 * public student2()	*
	 * {} 			       	*
	 * _____________________*
	 *************************************************************************************
	 * Compiler will not add any constructor if programmer has added even 1 constructor. *
	 *************************************************************************************
	 
	student2()
	{
		this.name="Raja";
		this.age=9;
		this.city="Bengaluru";
	}
	*
	*/
	
	// Constructor
	public student2(String name, int age, String city)
	{
		this();
		
		this.name=name;
		this.age=age;
		this.city=city;
	}
	student2()
	{
		 name="Sahil";
	}
	
	 student2(String city)
	{
		 //super();   //super method 
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

public class EncapConstructor1 {

	public static void main(String[] args) {
		// constructor is called/invoked at the time of object creation.
		student2 s1=new student2("Rohit",32,"Lucknow");
		
		System.out.println("Name : "+s1.getName());
		System.out.println("Age  : "+s1.getAge());
		System.out.println("City : "+s1.getCity());
		
		System.out.println();
		
		student2 s2=new student2(); 
		System.out.println("Name : "+s2.getName());
		
		System.out.println();
		
		student2 s3=new student2("Noida"); 
		System.out.println("City : "+s3.getCity());
		/*
		student2 s2=new student2(); // Constructor is called as object is created.
		System.out.println("Name : "+s2.getName());
		System.out.println("Age  : "+s2.getAge());
		System.out.println("City : "+s2.getCity());
		*/
	}
}

