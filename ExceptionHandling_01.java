
import java.util.Scanner;
class ExceptionHandling_01{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Connection is established.");
		
		boolean continueLoop=true;
		while(continueLoop) {
		try {
			System.out.println("Enter the 1st num to divide :");
			float num1=scan.nextInt();
			System.out.println("Enter the 2nd num to divide :");
			float num2=scan.nextInt();
			
			double res= num1/num2;
			System.out.println("The result of division is "+res);
			}
		catch(ArithmeticException e)
		{
			System.out.println("Number can't be divisible by zero.");
		}
		catch(IllegalArgumentException e) 
		{
			System.out.println("Invalid input. Please enter numbers only");
			scan.nextLine();
		}
		System.out.println("Do you want to perform another division? (yes/no) :");
		String choice=scan.next().toLowerCase();
		if(!choice.equals("yes")) {
			continueLoop = false;
			}
			scan.nextLine();
		}
		System.out.println("Connection is terminated.");
		scan.close();
	}
}