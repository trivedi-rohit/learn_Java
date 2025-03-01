import java.util.*;
public class ReverseString {
	public static void main(String[] args) {
/*
3 Cases to reverse a string:-
	1) rOhit ===> tihOr
	2) rOhit Trivedi ===> idevirT tihOr
	3) Trived Rohit ===> Rohit Trivedi
*/	
// Case - 1 & Case - 2:
	Scanner scan =new Scanner (System.in);
	System.out.print("Enter a string (case-1): ");
	String s1=scan.nextLine();
	String s2="";
	System.out.println ("Input : "+s1);
	for (int i=s1.length()-1;i>=0;i--) //moving back to front in a string s1.
	{	
			s2=s2+s1.charAt(i);
	}
	System.out.println("Output : "+s2);
System.out.println();
// Case - New :
	String str1="Trivedi Rohit";
	String str2="";
	String []arr = str1.split(" ");
	for(String elem : arr) //for-each loop (only travels in forward direction)
		{
			for(int i=elem.length()-1;i>=0;i--)
			{
				str2=str2+elem.charAt(i);
			}
			str2=str2+" ";
		}
	System.out.println("Case -2 Output : "+str2);
System.out.println();
// Case - 3:
	Scanner scann =new Scanner (System.in);
	System.out.print("Enter a string (case-3) : ");
	String ss1=scann.nextLine();
	String ss2="";
	System.out.println ("Input : "+ss1);
	String aree[] = ss1.split(" ");
	for(int j=aree.length-1; j>=0; j--)
		{
			ss2=ss2+aree[j]+" ";
		}
		System.out.println("Output : "+ss2);
}}
