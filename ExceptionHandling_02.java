import java.util.Scanner;
class ExceptionHandling_02 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Connection is established.");
    try {

      System.out.println("Enter the 1st num to divide :");
      int num1 = scan.nextInt();
      System.out.println("Enter the 2nd num to divide :");
      int num2 = scan.nextInt();

      int res = num1 / num2;
      System.out.println("The result of division is " + res);
    	} 
    catch (ArithmeticException e) {
      System.out.println("Invalid input. Denominator should not be zero.");
    	}
	    // new changes	
	    
	    int[] arr=null;
    try {
    	System.out.println("Enter the size of an array : ");
	      int size=scan.nextInt();
	      arr=new int[size];
    	} 
    catch (NegativeArraySizeException e) {
    	System.out.println("Please provide positive values for array");
    	}

    try {
    	if (arr != null) {
    	System.out.println("Enter the element to be inserted in that array : ");
    	int elem = scan.nextInt();

    	System.out.println("Enter the position at which element to be inserted : ");
    	int post = scan.nextInt();

    	arr[post] = elem;
    	System.out.println("Element " + elem + " is inseted at " + post + " in an array.");
    	} 
    	else {
            System.out.println("Array was not initialized. Skipping insertion.");
        }}
    catch (ArrayIndexOutOfBoundsException e) {
    	System.out.println("Invalid index of an array.");
    	}
    // Supper class of all Exception
    catch (Exception e) {
    	System.out.println("Wrong Input!");
    	}
    	System.out.println("Connection is terminated.");
    	scan.close();
  }
}