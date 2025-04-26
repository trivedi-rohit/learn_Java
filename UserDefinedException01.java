// Custom or User-defined exception 
// Driving Licence permission at RTO (Regional Transport Office).
import java.util.Scanner;

class UnderAgeException extends Exception
{
	public UnderAgeException(String msg)
	{ super(msg); }
}

class OverAgeException extends Exception
{
	public OverAgeException(String message)
	{ super(message); }

}

class Applicant
{
	int age;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age : ");
		age=scan.nextInt();
	}
	void verify() throws UnderAgeException, OverAgeException
	{
		if(age <18)
		{
			UnderAgeException uae=new UnderAgeException("You are underage now.");
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age > 60)
		{
			OverAgeException oae=new OverAgeException("You are overage now.");
			System.out.println(oae.getMessage());
			throw oae;
		}
		
	 else
		{
			System.out.println("You're eligible");
		}
	}
}

class RTO
{
	public void process()
	{
		Applicant a=new Applicant();
		try
		{
		a.input();
		a.verify();
		}
		catch(UnderAgeException | OverAgeException e)
		{
			try
		{
		a.input();
		a.verify();
		}
		catch(UnderAgeException |OverAgeException e1)
		{
			System.out.println("Don't ever try again read rules");
			System.exit(0);
		}
			
			
		}
	}
}



class Test{
public static void main(String[] args) {
	RTO r=new RTO();
	r.process();
}	
}