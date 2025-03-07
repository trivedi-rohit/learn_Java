class students
{
	private String name;
	private int age;
	private String city;
	
	// Common Setter 
	public void setData(String name, int age, String city) 
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
public class Encapsulation1 {

	public static void main(String[] args) {
		students s1=new students();
		s1.setData("Rohan", 32, "New Delhi");
		System.out.println("Name : "+s1.getName());
		System.out.println("Age  : "+s1.getAge());
		System.out.println("City : "+s1.getCity());
	}

}
