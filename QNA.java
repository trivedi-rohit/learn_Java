/*
 * public class QNA {
 * 
 * public static void main(String[] args) 
 * { int x =10; 
 * if(++x<10&((x/0)>10))
 * {
 * System.out.println("Hello"); 
 * } 
 * else { System.out.println("Hi"); }
 * }
 * }
 =========================================================*/
/*
public class QNA {
public static void main(String[] args) {
	int i=10;
	int j=20;
	int k=(j+=i);
	System.out.println(i+":"+j+":"+k);
}}
===========================================================*/
/*
public class QNA{
	public static void main(String[] args) {
	int i=10;
	int j=20;
	int k=(j+=i);
	System.out.println(i+":"+j+":"+k);
}}
===========================================================*/
/*
public class QNA{
	public static void main(String[] args) {
	int i=10;
	int j=20;
	int k=(j+=i);
	System.out.println(i+":"+j+":"+k);
}}
============================================================*/
/*
public class QNA{
public static void main(String[] args) {
int x =10;
if(x) {                                 //CE: unexpected type required:boolean, found:int
	System.out.println("Hello");
}
else
{
	System.out.println("Hi");
	}
}}
===========================================================*/
/*
 public class QNA{ 
 public static void main(String[] args) { 
 if(true)
 	System.out.println("Hello"); 
 System.out.println("Hi"); }}

 ==========================================================*/
/*
public class QNA{
	public static void main(String[] args) {
		byte x =10;
		switch(x) {
		case 10: System.out.println("Hello");
		break;
		case 100: System.out.println("Hiee");
		break;
		// case 1000: System.out.println("Hi"); //CE: Possibly loss of precision from "Byte" to "int"
		// break;
		} } }
============================================================*/
/*
public class QNA{
	public static void main(String args[]){
		int x = 10;
		final int y =20;// final means compiler will get to know the value and compiler treats it as "Compile time constant"
		switch(y)
		{
		case y: System.out.println("Hello");
		break;
		case 10: System.out.println("Hi");
		break;
		}
	}}
============================================================*/
/*
class QNA{
	public static void main(String[]args) {
		Boolean b1=true;
		boolean b2=false;
		boolean b3=true;
		if((b1&b2)|(b2&b3)&b3)    //false
			System.out.print("alpha"); //will not be executed
		if((b1=false)|(b1&b3)|(b1|b2))   //false
			System.out.print("beta");	//will not be executed
	}}
============================================================*/
/*
class QNA{
	public static void main(String []args) {
		boolean b1=true;
		boolean b2=false;
		System.out.print(!false^false); //false
		System.out.print(" "+(!b1&(b2=true)));  // false
		System.out.print(" "+(b2^b1)); //true
	}}
============================================================*/
/*
class QNA{
	public static void main(String []args){
		Integer i =42;
		String s = (i<40)?"life":(i>50)?"universe":"everything";
		System.out.println(s);
	}}
============================================================*/
// Important:
/*
class QNA{
	public static void main(String []args) {
		Integer x =0;
		Integer y=0;
		for (short z=0;z<5;z++)
		{
			if((++x>2)||(++y>2))
				x++; 
			}
		System.out.println(x+" "+y);
	}}
============================================================*/
/*
class QNA{
	public static void main(String []args) {
		while(true) 
			int x =10; //CE - Declarative statement not allowded.
	}}
*/
//===========================================================
/*
class QNA{
	public static void main(String []args) {
		while(true) {
			System.out.println("Hello");
		}
		System.out.println("Hiee");   // Compilation error as above statement/block will be printed infinite times.
	}}
*/
//===========================================================
/*
class QNA{
	public static void main(String[]args) {
		int a=10,b=20;
		while(a<b) {
			System.out.println("Hello"); //Infinite Hello will be printed.
		}
		System.out.println("Hiee");
	}}
*/
//=============================================================
/*
class QNA{
	public static void main(String[]args) {
		final int a=10;  // when a variable is marked final then the compiler will know the value of variable 
		while(a<20) {    // & use the values in expression to check the result.
			System.out.println("Hello"); //Infinite Hello will be printed.
		}
		System.out.println("Hiee");
	}}
*/
//=============================================================
/*
class QNA{
	public static void main(String[]args) {
		int a=10;
		while(a<20) {
			System.out.println("Hello"); //Infinite Hello will be printed as variable is not marked as final.
		}
		System.out.println("Hiee");
	}}
*/
//=============================================================
/*
class QNA{
	public static void main(String[]args) {
		do
			System.out.println("Hello");   // Hello will be printed infinite times
		while(true); 
	}}
*/
//============================================================
/*
class QNA{
	public static void main(String[]args) {
		do
		while(true); 
	}}
*/
//===========================================================
/*
class QNA{
	public static void main(String[]args) {
		do;
		while(true); 
	}}
*/
//===========================================================
/*
class QNA{
	public static void main(String[]args) {
		do {
			int x =20;
		}
		while(true); 
	}}
*/
//===========================================================
/*
class QNA{
	public static void main(String[]args) {
		do while(true)
			System.out.println("Hello");
		while(true); 
	}}
*/
//===========================================================
/*
class QNA{
	public static void main(String[]args) {
int x=0;
do {
	++x;
	System.out.print(x);
	if(++x<5)
		continue;
	++x;
	System.out.print(x);
}while(++x<10);
	}}
*/
//==========================================================
/*
class QNA{
	public static void main(String[]args) {
int[] a = {0,2,4,1,3};
for(int i=0;i<a.length;i++)
	a[i]=a[(a[i]+3)/a.length];
System.out.println(a[1]);
	}}
*/
//==========================================================
/*
class QNA{
	public static void main(String[]args) {
	int i=0,j=5;
	for(;(i<3)&&(j++<10);)
	{
	System.out.println(""+i+""+j);
	i++;
}
	System.out.println(i+""+j);
}}
*/
//==========================================================
/*
class QNA{
	public static void main(String[]args) {
	int x =5;
	x*=3*5+7*x-1 + ++x; // x=x(3*5 + (7*x)-1 + ++x)
	System.out.println(x);
}}
*/
//==========================================================
/*
public class QNA{
	public static void main (String[]args){
		String[] str = new String[2];
		int idx =0;
		for (String s:str){
			str[idx].concat("element"+idx);
			idx++;
		}
		for(idx=0;idx<str.length;idx++){
			System.out.print(str[idx]);  // NullPointerException at runtime.
		}
	}
}
*/
//=================================================================
/*
public class QNA{
	public static void main(String[] args){
		String[][] arr={{"A","B","C"},{"D","E"}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[i][j]+" ");
				if(arr[i][j].equals("B"))
					break;
			}
		continue;
		}
	}
}
*/
//=================================================================
/*
public class QNA{
	public static void main(String[]arg){
		StringBuffer sb=new StringBuffer("java");
		String s = "java";
		if (sb.toString().equals(s.toString()))
			System.out.print("Match-1");
		else if (sb.equals(s))
			System.out.println("Match-2");
		else
			System.out.println("No Match");
	}
}
*/
//===================================================================
/*
public class QNA{
	public static void main (String[]args){
		int[] a = new int[0];// String size is mandatory, otherwise results in compilation error.
		System.out.println(a);
	}}
*/
//====================================================================
/*
public class QNA{
	public static void main (String[]args){
		System.out.println("ONE");
		}
	public static void main (Integer[]args){
		System.out.println("ONE");
	}		
	public static void main (byte[]args){
		System.out.println("ONE");
	}}
*/
//====================================================================
/*
public class QNA{
	public static void main(String[]args){
		if ((isItSmall(3)) || (isItSmall(7))){
			System.out.println("Result is true");
		}
		if ((isItSmall(6))||(isItSmall(9))){
			System.out.println("Result is true");
		}
}
	public static boolean isItSmall(int i){
		if (i<5){
			System.out.println("i<5");
			return true;
		} else{
			System.out.println("i>=5");
			return false;
		}
		}
	}
*/	
//===============================================================
/*
public class QNA{
	public static void main(String[]args){
		Long x =42L;
		Long y = 44L;
		System.out.print(""+7+2+" ");
		System.out.print(foo() + x + 5 +" ");
		System.out.println(x+y+foo());
		}
		static String foo() {return "foo";}
	}
*/
//===============================================================
/*
public class QNA{
	public static void main(String[]args){
	String str = " ";
	str.trim(); // String is Immutable, so no effect of trim() on string data.
	System.out.println(str.equals("")+" "+str.isEmpty()); // (2nd)String contains blank spaced data, so not empty.
	}}
*/
//=================================================================
/*
public class QNA{
	public static void main(String[]args) {
		String s = "SACHIN TENDULKAR";
		int len = s.trim().length();
		System.out.println(len);
	}}
*/
//===================================================================
/*
public class QNA{
	public static void main(String[]args) {
	String str = "Good";
	change(str);
	System.out.println(str);
	}
	private static void change(String s) {
		s.concat("_Morning");
	}}
*/
//===================================================================
/*
public class QNA {
    public static void main(String[] args) {
        String str = "Good";
        str = change(str);  // Assign the returned value
        System.out.println(str);
    }

    private static String change(String s) {
        // Concatenate "_Morning" to the original string and store in a new variable
        String newString = s.concat("_Morning");
        
        // Return the new concatenated string
        return newString;
    }}
*/
//====================================================================
/*
public class Test {
	@Override
	public String toString() {
		return "Test";
	}
    public static void main(String[] args) {
       Test obj = new Test();
       System.out.println(obj);
    }}
*/
//=====================================================================
/*
 class Fizz
{
	int x = 5;
	public static void main(String[] args)
		{
			final Fizz f1 = new Fizz();
				  Fizz f2 = new Fizz();
				  Fizz f3 = FizzSwitch(f1,f2);
				  System.out.println((f1 == f3)+ " "+(f1.x == f3.x));
		}
		static Fizz FizzSwitch(Fizz x, Fizz y)
		{
			final Fizz z =x;
			z.x = 6;
			return z;
		}}
*/
//=========================================================================
/*
public class classA
{
	public int getValue(){
		int value =0;
		boolean setting = true;
		String title="Hello";
		if(value || (setting && title == "Hello")){return 1;}
		if(value ==1 & title.equals ("Hello")){return 2;}
	}
}
And:
classA a =new classA();
a.getValue();
*/
//=========================================================================
/*
public class QNA {
    public static void main(String[] args) {
    	String[]arr[]= {{"%","***"},{"!!!!","@@@@@","######"}};
    	for (String str[]:arr) 
    	{
    		for(String s:str) 
    		{
    			System.out.println(s);
    			if (s.length()==4)
    				break;
    		}
    		break;
    	}	
    }
 }
 */
//==========================================================================
/*
public class QNA {
    public static void main(String[] args) {
    	int score = 60;
    	switch (score) {
    	default:
    		System.out.println("Not a valid score.");
    	case score<70: // CE
    		System.out.println("Failed");
    	break;
    	case score>=70: //CE
    		System.out.println("Passed");
    	break;
    	}
    }
 }
*/
//============================================================================
/*
public class QNA {
    public static void main(String[] args) {
    	byte var = 100;
    	switch (var) {
    	case 100:
    		System.out.println("var is 100");
    		break;
    	case 200:   // CE: due to byte range -128 to 127
    		System.out.println("var is 200");
    		break;
    	default:
    		System.out.println("In default");
    	}}}
*/
//==============================================================================
/*
public class QNA {
    public static void main(String[] args) {
    	String fruit = "mango";
    	switch (fruit) {
    	default:
    		System.out.println("In default");
    	case "Apple":
    		System.out.println("Apple");
    	case "Mango":
    		System.out.println("Mango");	
    	case "Banana":   
    		System.out.println("Banana");
    		break;
    	}}}
*/
//==============================================================================
/*
public class QNA {
    public static void main(String[] args) {
    	String fruit = new String(new char[] {'M','a','n','g','o'});
    	switch (fruit) {
    	default:
    		System.out.println("In default");
    	case "Apple":
    		System.out.println("Apple");
    	case "Mango":
    		System.out.println("Mango");	
    	case "Banana":   
    		System.out.println("Banana");
    		break;
    	}}}
*/
//===============================================================================
/*
class QNA{
	public static void main(String[]args) {
		boolean flag = !true;
		System.out.println(!flag ? args[0]:args[1]);
	}
} // javac QNA.java     java QNA AM PM           Ans: AM
*/
//================================================================================
/*
 public class QNA {
    public static void main(String[] args) {
    	String fruit = "mango";
    	switch (fruit) {
    	
    	case "Apple":
    		System.out.println("Apple");
    	case "Mango":
    		System.out.println("Mango");
    		break;
    	case "Banana":   
    		System.out.println("Banana");
    	default:
    		System.out.println("In default");
    		//break;
    	}}}
*/
//===============================================================================
/*
class Testt{
	public static void main(String[]args) {
		boolean flag = !true;
		System.out.println(!flag ? args[0]:args[1]);
	}
}
*/
//===============================================================================
/* public class QNA
 * { public static void main(String[]args) 
 * { int a =3;
 * System.out.println(a++==3||--a==3&&--a==3); 
 * System.out.println(a); 
 * } }
 */
//===============================================================================
/*
public class QNA{ 
	public static void main(String[]args) { 
	 int a =3;
	 m(++a,a++);
	 System.out.println(a);
 	}
 private static void m(int i, int j) { 
	 i++;
	 j--;
 } }
 */
//================================================================================
/*
public class QNA{ 
	public static void main(String[]args) { 
	 boolean flag=false;
	 System.out.println((flag=true)|(flag=false)||(flag=true));
	 System.out.println(flag);
 } }
*/
//================================================================================
/* public class QNA{ 
 * public static void main(String[]args) { 
 * boolean status=true; 
 * System.out.println(status=false|status=true||status=false); //CE
 * System.out.println(status); } }
 */
//================================================================================
/*
public class QNA{ 
public static void main(String[]args) { 
String msg = "Hello";
boolean[]flag=new boolean[1];
if(flag[0]) {
msg="Welcome";}
System.out.println(msg);
} }
*/
//================================================================================
/*
public class QNA{ 
public static void main(String[]args) { 
boolean flag1=true;
boolean flag2=false;
boolean flag3=true;
boolean flag4=false;
System.out.println(!flag1==flag2!=flag3==!flag4);
System.out.println(flag1=flag2!=flag3==!flag4);
} }
*/
//================================================================================
/*
public class QNA {
public static void main(String args) 
{ 
	int score = 30; // Line n1 
	char grade = 'F'; // Line n2 
if (50 <= score < 60) // Line n3   //  (50 <= score && score < 60) 
	grade = 'D'; 
else if (60 <= score < 70) // Line n4  // (60 <= score && score < 70)
	grade = 'C'; 
else if (70 <= score < 80) // Line n5    // (70 <= score && score < 80)
	grade = 'B'; 
else if (score >= 80) 
	grade = 'A'; 
System.out.println(grade); 
}} 
*/
//================================================================================
/*
public class QNA{ 
public static void main(String[]args) { 
int x=10;
if (false)
	System.out.println(x);
System.out.println("Hello");
} }
*/
//================================================================================
/*
 * class staticControlFlow 
 * { 
 * static int a; static int b;
 * 
 * static { 
 * System.out.println("Static Block"); 
 * a=10; b=20; 
 * 	} 
 * } 
 * public class
 * QNA{ public static void main(String[]args) {
 * System.out.println("Main Method"); } }
 */
//==================================================================================











 












































