// Runtime polymorphism (Loose coupling)
class parent1
{
	public void cry()
	{
		System.out.println("Parent Crying");
	}
	public void eat()
	{
		System.out.println("parent is eating.");
	}
	public void work()
	{
		System.out.println("parent is working");
	}
}
class child1 extends parent1
{
	public void cry()
	{
		System.out.println("Child1 cries quietly/softly");
	}
	public void StudyScience()
	{
		System.out.println("Child1 study Science");
	}
	
}
class child2 extends parent1
{
	public void cry()
	{
		System.out.println("Child2 cries loudly");	
	}
	public void StudyCommerce()
	{
		System.out.println("Child2 stidy Commerce");
	}
}
class child3 extends parent1
{
	public void cry()
	{
		System.out.println("Child3 is not crying but weeping");	
	}
}
class HomoSapiens 
{
	public void relation(parent1 parents) 
	{
		parents.cry();
		parents.eat();
		parents.work();

	}
}
class polymorphismConcept{
public static void main(String[]args) 
{

	//reference c1=new object
	child1 c1=new child1(); // Tight coupling object
	child2 c2=new child2();	// Tight coupling object
	c1.cry();
	c2.cry();
//*************************************************************
	child3 c3=new child3();
	
	HomoSapiens hs=new HomoSapiens();
	hs.relation(c1);
	hs.relation(c2);
	hs.relation(c3);
	
	parent1 p1=new child1();
// directly using parent type reference we cannot call child class specialized method
	//p1.StudyScience(); 
	((child1) p1).StudyScience(); //downCasting

	
	
	
//***reference c1=new object***
	
	//parent1 p1=new child1();  //Loose coupling to achieve polymorphism.
	//p1.cry();
	/*
	 * parent1 ref; 
	 * ref=c1; 
	 * ref.cry(); 	//1:M
	 * 
	 * ref=c2; 
	 * ref.cry(); 	//1:M
	 */	
	}
}