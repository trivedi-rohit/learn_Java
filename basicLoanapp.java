//Basic loan app for farmers
import java.util.Scanner;
class LoanAcc
{
	private float pa;   //principal
	private float td;	//Time Duration
	private float si;	// Simple Interest
	private static float rt;	//Rate
	
	static
	{
		rt = 6.5f;
	}
	
	//method
	void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the required loam amount : ");
		pa = scan.nextFloat();
		System.out.print("Enter the loan duration : ");
		td=scan.nextFloat();
		
	}
	
	void compute()
	{
		si = (pa*rt*td)/100;
	}
	
	void disp()
	{
		System.out.println();
		System.out.println("Simple interest received on sum of Rs "+pa+" is : Rs "+si);
	}
}
public class basicLoanapp {
	public static void main(String[] args) {
		LoanAcc a1 = new LoanAcc();
	  //LoanAcc a2 = new LoanAcc();
		
		a1.input();
		a1.compute();
		a1.disp();

		/*
		 * a2.input(); 
		 * a2.compute(); 
		 * a2.disp();
		 */
	}

}
