// WAP to calculate the area of rectangle, circle, square using polymorphism, abstraction (abstract classes) :
/*
 * length,breadth, radius, side, area=>float type
 * pi value=> Final & float type
 * input method => Abstract & void type
 * compute method => Abstract & void type
 * display method => Abstract & void type
 * 
*/
import java.util.Scanner;
abstract class Shapes
{
	abstract public void input();
	abstract public void compute();
	float area;
	public void disp()
	{
		System.out.println("The area is "+ area);
	}
}
class Rectangle extends Shapes
 {
	 float length;
	 float breadth;
	 public void input()
	 {
		 Scanner scan=new Scanner(System.in);
		 System.out.print("Enter length of rectangle : ");
		 length=scan.nextFloat();
		 System.out.print("Enter breadth of rectangle : ");
		 breadth=scan.nextFloat();
	 }
	 public void compute()
	 {
		 area=length*breadth;
	 }
 }

 class Square extends Shapes
 {
	 float side;
	 public void input()
	 {
		 Scanner scan=new Scanner(System.in);
		 System.out.print("Enter side of square : ");
		 side=scan.nextFloat();

	 }
	 public void compute()
	 {
		 area=side*side;
	 }
 }
 
class Circle extends Shapes
{
	float radius;
	final float pi=3.14f;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter radius of circle :");
		radius=scan.nextFloat();
	}
	public void compute()
	{
		area=pi*radius*radius;
	}
 }
class Geometry
{
	void permit(Shapes s)
	{
		s.input();
		s.compute();
		s.disp();
	}
}
class ProgPolymorphismAbstraction{
	public static void main(String[]args)
	{
		Rectangle r=new Rectangle();
		Square sq=new Square();
		Circle c=new Circle();
		
		Geometry g=new Geometry();
		g.permit(r);
		System.out.println();
		g.permit(sq);
		System.out.println();
		g.permit(c);
	}
}
 
