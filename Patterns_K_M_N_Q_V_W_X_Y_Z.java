public class Patterns_K_M_N_Q_V_W_X_Y_Z {
	public static void main(String[] args) {
int n=19;
for(int i=0;i<n;i++) 
	{
		for (int j=0;j<n;j++) 
		{
//Pattern - "X"
			if(i==j||i+j==(n-1))
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
//Pattern - "X"
			if(i==j||i+j==(n-1)||i==0||j==0||i==(n-1)||j==(n-1))
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
//Pattern - "N"
			if(i==j||j==0||j==(n-1))
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
//Pattern - "K"
			if(j==0||i+j==(n-1)/2||i-j==(n-1)/2)
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
//Pattern - "Rhombus"
			if(i+j==(n-1)/2||
					i-j==(n-1)/2||
					j-i==(n-1)/2||
					i+j==n-1+(n-1)/2)
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
//Pattern - "pattern"
			if(i+j==(n-1)/2||
					i-j==(n-1)/2||
					j-i==(n-1)/2||
					i+j==n-1+(n-1)/2|| i==j|i+j==n-1||i==0||j==0||i==n-1||j==n-1)
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
//Pattern - "Z"
			if(i==0||i+j==n-1||i==n-1)
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

