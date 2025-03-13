//WAP to count number of objects created 
//(Non-static Block)
class Demoo1
	{
		int a;
		int b;

		static int count;
/*
* whichever content is common in all constructor,
* that should be included in non-Static block only.
* Behind the scene constructor includes non-static block each time the object is created.
*/	
	//non-Static block/instance block
	{
		count++;
		System.out.println("Hello");
	}
	
		//constructor
		Demoo1()
		{ 	this(70);
		System.out.println("1st constructor");
			//count++;
		}
		//constructor
		Demoo1(int a)
		{ System.out.println(a);
			this.a=a;
			//count++;
		}
		
		//constructor
		Demoo1(int a, int b)
		{
			this.a=a;
			this.b=b;
			//count++;
		}
		/*
		 * public int getA() { 
		 * return a; }
		 */
	}

public class nonStaticBlock{
	public static void main (String[]args){
			Demoo1 d1 = new Demoo1();
			Demoo1 d2 = new Demoo1(10);
			Demoo1 d3 = new Demoo1(30,40);
			//System.out.println("a : "+d2.getA());
			System.out.println("Count : "+Demoo1.count);
		}
	}