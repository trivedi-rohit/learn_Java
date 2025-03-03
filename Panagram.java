import java.util.*;
public class Panagram{
	public static void main(String[]args){
		boolean flag=false;
		String s1 = "The quick brown fox jumps over the lazy dog";
		s1=s1.toUpperCase();
		s1=s1.replace(" ","");
		char[] ch = s1.toCharArray();
		//Arrays.sort(ch);
		//System.out.println(ch);
		int [] ar = new int[26];
		
		//Traverse an array (ch):
		for(int i=0;i<ch.length;i++)  // (OR) for(int i=0;i<=ch.length-1;i++)
		{
			int indx=ch[i]-65;  //eg: ASCII of T=84, 84-65=19
			ar[indx]++;        //ar[19]++ -----> default value at ar[19] is 0; it will increment to 1 now.
		  //ar[ch[i]-65]++
		}
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]==0)
			{
				System.out.println("It is not a pangram");
				flag = true;
				break;
			}	
		}
		if(flag==false)  // ===> if(!flag)
		{
		System.out.println("It is a pangram");
		}
	}
}