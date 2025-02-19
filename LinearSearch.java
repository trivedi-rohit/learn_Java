// Linear Search :
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
      int [] ar = {10,30,40,52,78,98,12,17};
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number to find: ");
      int key = scan.nextInt();
      boolean flag = false;
      for (int i=0;i<ar.length;i++)
      {
    	  if(key==ar[i])
    	  {
    		  System.out.println("key "+key+" found at index "+i);
    		  flag=true;
    		  break;
    	  }
      }scan.close();
      if (!flag) {
  System.out.println("Key not found");
      }   
    }}

