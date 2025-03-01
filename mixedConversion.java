import java.util.*;
public class mixedConversion {
	public static void main(String[] args) {
	//Convert "RohiT" to "rOHIt".
	Scanner scan =new Scanner (System.in);
	System.out.print("Enter a string : ");
	String s1=scan.nextLine();
	String s2="";
	System.out.println ("Input :"+s1);
	for (int i=0;i<s1.length();i++)
	{	
		if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
		{
			s2=s2+(char)(s1.charAt(i)-32);
		}
		else
		{
			s2=s2+(char)(s1.charAt(i)+32);
		}
	}
	System.out.println("Output : "+s2);
}}