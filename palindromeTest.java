import java.util.*;
public class palindromeTest {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a string to check if it is a palindrome : ");
		String s1=scan.nextLine();
		String s3= s1.toUpperCase();
		String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2=s2+s3.charAt(i);
	}
	System.out.println(s2);
	if(s3.equals(s2)) 
	{
		System.out.println("String is a palindrome.");
	}
	else
	{
		System.out.println("String is not a palindrome");
	}
}}
