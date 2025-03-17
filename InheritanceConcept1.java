class Parent11
{
	private String name;
	
	Parent11()
	{
		System.out.println("Parent Constructor");
	}
	void disp()
	{
		System.out.println("Parent");
	}
}

class child11 extends Parent11
{
	/*
	 * Child11() 
	 * { 
	 * super(); 
	 * }
	 */
	void disp2()
	{
		//name = "Manas"
	}
}
public class InheritanceConcept1 {

	public static void main(String[] args) {
		child11 c1=new child11();
		c1.disp();

	}

}
