class Demo1 // This class extends "Objects class" property & behaviour
{
	String name ="Rohit";
	int age=31;
	
	void disp()
	{
		System.out.println("Demo1 "+name+" "+age);
	}
}

//Demo2 is child/derived/sub class
//Demo1 is parent/base/existing class
class Demo2 extends Demo1
{
	String name ="Mohit";
	//int age=39;
	
	void catchData()
	{
		System.out.println("Demo1 "+name);
	}
}
class Demo3 extends Demo2
{
	
}

public class InheritanceConcept {
	public static void main(String[] args) {
		Demo2 demo=new Demo2();
		demo.catchData();
		Demo3 d =new Demo3();
		d.disp();

	}

}
