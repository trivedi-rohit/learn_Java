import java.util.*;
public class stringcopyAanduUpperLowerCase {
	public static void main(String[] args) {
	/*
	String s1 = "rohittrivedi";
	String s2="";
	//Logic: Copying one string to another string.
	for (int i=0;i<s1.length();i++)
	{
		s2+=s1.charAt(i);
	}
	System.out.println("1st String : "+s1);
	System.out.println("2nd String : "+s2);
	*/
	//****************************************************************
	char ch='a'; ch=(char)(ch-32); System.out.println(ch); //for lower case to upper case.
	char cha='A'; cha=(char)(cha+32); System.out.println(cha); //for upper case to lower case.
	//****************************************************************
	// Change string s1 to upper case.
	Scanner scan = new Scanner(System.in);
	System.out.print("Please enter a string in lower case : ");
	String s1=scan.nextLine();
	String s2="";
	System.out.println("Input : "+s1);
		for(int i=0;i<s1.length();i++)
		{
			s2= s2+(char)(s1.charAt(i)-32);
		}
	System.out.println("Output : "+s2);
}}
