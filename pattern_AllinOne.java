
public class pattern_AllinOne {

	public static void main(String[]a) {
		int n=10;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
// Pattern programming:-  print "O".
 if (i==n/4&&j>n/4&&j<(3*n/4)||j==n/4&&i>n/4&&i<3*n/4||i==3*n/4&&j>n/4&&j<3*n/4||j==3*n/4&&i>n/4&&i<3*n/4)
 {
		System.out.print("*");
	}
	else
	{
		System.out.print(" ");
	}
}
	 for (int j=0;j<n;j++)
		{
// Pattern Programming:- "G"
 if(i==0&&j>0&&j<(n-2)||
j==0&&i>0&&i<(n-1)||
i==(n-1)/2&&j>=(n-1)/2&&j<=(3*n)/4||
j==(3*n)/4&&i>=(n-1)/2||
i==(n-1)&&j<(n-1)/2||
j==(n-1)/2&&i>(n-1)/2)
 {
		System.out.print("*");
	}
	else
	{
		System.out.print(" ");
	}
}
	 for (int j=0;j<n;j++)
		{
// Pattern Programming:- "H"
 if(j==0&&j<n||i==(n-1)/2||j==n-1)
 {
		System.out.print("*");
	}
	else
	{
		System.out.print(" ");
	}
}
	 for (int j=0;j<n;j++)
		{
// Pattern Programming:- "P"
 if(j==0||i==0&&j<n/2||i==(n-3)/2&&j<n/2||j==(n)/2&&i>0&&i<(n-3)/2)
 {
		System.out.print("*");
	}
	else
	{
		System.out.print(" ");
	}
}
	 for (int j=0;j<n;j++)
		{
// Pattern Programming:- "C"
 if(i==0&&j>0&&j<(3*n)/4||j==0&&i>0&&i<(n-1)||i==(n-1)&&j>0&&j<(3*n/4))

				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
	
}