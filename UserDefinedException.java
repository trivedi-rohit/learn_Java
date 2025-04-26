// custom or user defined exception:
import java.util.Scanner;

class InvalidCustomerException extends Exception
{
	public InvalidCustomerException(String msg)
	{
		super(msg);
	}
}

class ATM
{
	int usrid = 991137468;
	int pswd = 97531;
	int pass;
	int uid;
	
	public void input()
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter user id : ");
		uid=scan.nextInt();
		System.out.println("Enter the admin password : ");
		pass=scan.nextInt();
	}
	public void verify() throws InvalidCustomerException
	{
		if ((usrid == uid) && (pswd == pass))
		{
			System.out.println("Details Verified");
		}
		else
		{
			InvalidCustomerException ice = new InvalidCustomerException("Try Again!!");
			//System.out.println(ice);
			System.out.println(ice.getMessage());
			throw ice; // throw an exception object 'ice' to caller (initiate method)
		}
	}
}
class Bank
{
	public void initiate()
	{
		ATM at=new ATM();
	try {
			at.input();
			at.verify();
		} 
	catch (InvalidCustomerException e1) 
	{
		try {
				at.input();
				at.verify();
			} 
		catch (InvalidCustomerException e2) 
		{
			try {
					at.input();
					at.verify();
				} 
			catch (InvalidCustomerException e3) 
			{
				System.out.println("Card Blocked due to invalid credentials");
				System.exit(0);
			}
		}
	 }
   }
}


class UserDefinedException{
	public static void main(String[] args) {
		Bank b=new Bank();
		b.initiate();
	}
}
