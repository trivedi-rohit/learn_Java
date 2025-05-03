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
/*
//Consider below code of Counter.java file:
public class Counter{
	int count;
	
	private static void increment(Counter counter) {
		counter.count++;
		
	}
	public static void main(String[]args) {
		Counter c1 = new Counter();
		Counter c2=c1;
		Counter c3 = null;
		c2.count=1000;
		increment(c2);
		System.out.println(c2.count);
	}
} 
//On executing Counter class, how many Counter objects are created in the memory?
*/
//==================================================================================
/*
// What will be the result of compiling & executing Test class?
public class Test
{
public static void main(String[]args){
	String res="";
	
	loop:for (int i=1;i<=5;i++)
	{
		switch(i){
			case 1:
				res += "UP ";
				break;
			case 2:
				res += "TO ";
				break;
			case 3:
				break;
			case 4:
				res += "DATE";
				break loop;
			}
	}
	System.out.println(String.join("-",res.split(" ")));
}}
*/
//===========================================================================
/*
public class Test
{
	public static void main(String[]args){
		String res ="";
		String [] arr = {"Dog",null,"Friendly"};
	for (String s:arr)
	{
		res += String.join("-",s);
	}
	System.out.println(res);
	}}
*/
//=========================================================================
/*
public class Test{
public static void main(String[]args){
	String[][]chs=new String[2][];
	chs[0]=new String[2];
	chs[1]=new String[5];
	int i=97;
	for (int a=0;a<chs.length;a++)
	{
		for(int b=0;b<chs.length;b++){
			chs[a][b]=" "+i;
			i++;
		}
	}
	for (String[] ca:chs)
	{
		for (String c:ca)
		{
			System.out.print(c+" ");
		}
		System.out.println();
	}
}}
*/
//===========================================================================
/*
public class Test{
public static void main(String[]args){
	String []arr = {"1st","2nd","3rd","4th","5th"};
	String place = "faraway";
	System.out.println(arr[place.indexOf("a",3)]);
	 } }
*/
//=========================================================================
/*
class SpecialString{
	String str;
	SpecialString(String str){
		this.str=str;
	}
}
public class QNA{
public static void main(String[]args) {
Object [] arr=new Object[4];
for(int i=1; i<=3; i++) {
	switch(i){
		case 1:
			arr[i]=new String("Java");
			break;
		case 2:
			arr[i]=new StringBuilder("Java");
			break;
		case 3:
			arr[i]=new SpecialString("Java");
			break;
	}}
for (Object obj:arr) {
	System.out.println(obj);
	}}}
*/
//=============================================================================
/*
public class QNA {
    public static void main(String[] args) {
        String str = "  Ineuron\tTechnology\tPrivateltd\tKnow\tfor\tjava  ".strip();
        //str = str.replaceAll("[\\t\\s]+", " ");  // Replaces tabs and spaces with a single space
        System.out.println(str);
    }}
*/
//===============================================================================
/*
public class QNA {
    public static void main(String[] args) {
String s1=" ";
System.out.println(s1.isBlank());
System.out.println(s1.isEmpty());
    }}
*/
//================================================================================
/*
public class QNA {
    public static void main(String[] args) {
String s1=new String("JAVA");
String s2=new String("JAVA");
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
System.out.println(s1==s2.intern());
System.out.println(s1.intern()==s2.intern());
System.out.println(s1.intern()==s2);
}}
 */
//================================================================================
/*
 public class QNA {
    public static void main(String[] args) {
String opt="True";
switch(opt) {
case "True":
	System.out.print("True");
	break;
	default:
		System.out.println("****");
}
System.out.println("Done");
}}
*/
//===============================================================================
/*
public class QNA {
public static void main(String[] args) {
int x=5;
while(isAvailable(x)){
	System.out.print(x--);
}}
public static boolean isAvailable(int x) {
	return x-->0?true:false;
}}
*/
//=============================================================================
/*
public class QNA {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder(5);
	String s="";
	if(sb.equals(s)) {
		System.out.println("Match 1");
	}else if(sb.toString().equals(s.toString())) {
		System.out.println("Match 2");
	}else {
		System.out.println("Match 3");
	}}}
*/
//===============================================================================
/*
public class QNA {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("Java");
	String s1=sb.toString();
	String s2="Java";
	System.out.println(s1==s2);
}}
*/
//===============================================================================
/*
public class QNA {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("Java");
	String s1=sb.toString();
	String s2=sb.toString();
	System.out.println(s1==s2);
}}
*/
//================================================================================
/*
public class QNA {
public static void main(String[] args) {
	String str="Java";
	StringBuilder sb=new StringBuilder("Java");
	System.out.println(str.equals(sb)+":"+sb.equals(str));
}}
*/
//=================================================================================
/*
public class QNA {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();
	//System.out.println(sb.append(null).length());   //wrong
	System.out.println(sb.append("null").length()); //correct
}}
*/
//=================================================================================
/*
public class QNA {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();
	System.out.println(sb.append("").append("").append("").length()); //correct
}}
*/
//==================================================================================
/*
public class QNA {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder(5);
	sb.append("0123456789");
	System.out.println(sb); 
	sb.delete(8,1000);
	System.out.println(sb); 
}}
*/
//===================================================================================
/*
public class QNA {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("0123456789");
	System.out.println(sb.delete(3,6).deleteCharAt(4).deleteCharAt(5));
}}
*/
//===================================================================================
/*
public class QNA{
	public static void main(String[] args) {
		final String fname = "James";
		String lname = "Gosling";
		String name1=fname+lname;
		String name2=fname+"Gosling";
		String name3="James"+"Gosling";
		System.out.println(name1==name2);
		System.out.println(name2==name3);
	}
}
*/
//======================================================================================
/*
public class QNA{
	public static void main(String[] args) {
		m1(null);
	}
	static void m1(CharSequence s) {
		System.out.println("CharSequence");
	}
	static void m1(Object s) {
		System.out.println("Object");
	}
}
*/
/*
 * options:
 * 1) Compilation Error   
 * 2) CharSequence   
 * 3) String
 * 4) Object
 */
//=======================================================================================
/*
public class QNA{
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("SpaceStation");
		sb.delete(5,6).insert(5," S").toString().toUpperCase();
		//String st=sb.delete(5,6).insert(5," S").toString().toUpperCase();
		System.out.println(sb);
		//System.out.println(st);
}}
*/
//=========================================================================================
/* 
public class QNA{
	public static void main(String[] args) {
		String s1="SCP";
		String s2="scp";
		System.out.println(s1.equals(s2.toUpperCase()));
		System.out.println(s1.equals(s2));
		//System.out.println(s1.equals(s2.toUpper()));
		//System.out.println(s1.equals(s2.toLower()));
		System.out.println(s1.length()==s2.length());
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contentEquals(s2));
	}
}
/*
 * String s1 = new String("hello");
 * String s2 = new String("hello");
 * System.out.println(s1.equals(s2));  // Output: true; because the content of both strings is the same.
 * System.out.println(s1 == s2);  // Output: false
// O/P is false, because s1 and s2 refer to two different objects in memory, even though their contents are the same.
 
 *String s1 = "hello";
 *String s2 = "hello";
 *System.out.println(s1 == s2);  // Output: true
//s1 == s2 returns true because both s1 and s2 point to the same reference in the string pool.
 *System.out.println(s1.equals(s2));  // Output: true
*/
//=========================================================================================
/*
public class QNA{
	public static void main(String[] args) {
		String s1="ONE";
		System.out.println(s1.concat(s1.concat("ELEVEN ")).trim());
		;
	}}
*/
//==========================================================================================
/*
public class QNA{
	public static void main(String[] args) {
		String str="PANIC";
		StringBuilder sb=new StringBuilder("THET");
		System.out.println(str.replace("N",sb));
	}}
*/
//==========================================================================================
/*
public class QNA{
	public static void main(String[] args) {
		boolean flag1 = "Java" == "Java".replace('J', 'J'); //Line n1
		boolean flag2 = "Java" == "Java".replace("J", "J"); //Line n2
		System.out.println(flag1 && flag2);
	}}
*/
//==========================================================================================
/*
public class QNA{
	public static void main(String[] args) {
		String place = "MISSS";
		System.out.println(place.replace("SS", "T"));
	}}
*/
//===========================================================================================
/*
public class QNA{
	public static void main(String[] args) {
		String str = "ALASKA";
		System.out.println(str.charAt(str.indexOf("A") + 1));
	}}
*/
//============================================================================================
/*
public class QNA{
	public static void main(String[] args) {
		String word="REBUS";
		word=word.substring(2); 
		//word=word.substring(2,4);//BU
		word=word.substring(2, 5);
		word=word.replace("RE","");
		//word=word.substring(2,6); //String Index Out Of Bound Exception
		//word=word.delete(0,2); //CE
		System.out.println(word);
	}}
*/
//============================================================================================
/*
public class QNA{
	public static void main(String[] args) {
		String str="Game on";
		StringBuilder sb=new StringBuilder(str);
		System.out.println(str.contentEquals(sb));
      //System.out.println(sb.contentEquals(str));
		System.out.println(sb.equals(str));
		System.out.println(str.equals(sb));
	}} 
*/
//============================================================================================
/*
public class QNA{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("TOMATO");
		//System.out.println(sb.reverse().replace("O", "A"));  //CE
		System.out.println(sb.reverse().replace(2,5, "P"));	
	}}
*/
//============================================================================================
/*
public class QNA{
	public static void main(String[] args) {
		String str = "trivedi Technolog Private Limited";
		System.out.println(str.indexOf('i',5));  //6
	  //System.out.println(str.charAt(str.length())); //IndexOutOfBoundsException
		System.out.println(str.charAt(str.length()-1));  //d
	}}
		 
/*
 string indices are 0-based, meaning the valid index range is from 0 to str.length() - 1. 
 So, attempting to access str.charAt(str.length()) will result in an IndexOutOfBoundsException.
 */
//==============================================================================================
/* 
public class QNA{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(-4);	
		sb.append("ABC");
		System.out.println(sb);  //RE
	}}
 */
//==============================================================================================
/*
public class QNA{
	public static void main(String[] args) {
		String str = null;
		System.out.println(str.isBlank());  //NullPointerException
	}}
*/
//==============================================================================================
/*
public class QNA{
	public static void main(String[] args) {
		String[] strings = "iNeuron_Technology_privatelimited_Known_For_Java".split("_",3);
				for (String string : strings)
				System.out.println(string);
	}}
*/
//===============================================================================================
/*
// Wrapper classes and string class are immutable (changes will not be made in same copy, but in different copy)
// StringBuilder and StringBuffer are mutable (changes will be made on the same object )
public class QNA{
	public static void main(String[] args) {
		Integer x=400;
		Integer y=x;  //y=400
		x++;   		  //x=401
		StringBuilder sb1=new StringBuilder("123");
		StringBuilder sb2=sb1;
		sb1.append("5");     //  sb1,sb2="1235"
		System.out.println((x==y)+" : "+(sb1==sb2));
}}
*/
//================================================================================================
class Payload {
private int weight;
public Payload (int w) { weight = w; }
public void setWeight(int w) { weight = w; }
public String toString() { return Integer.toString(weight); }
}
public class QNA {
static void changePayload(Payload p) {
/* insert code */ //Line 12
}
public static void main(String[] args) {
Payload p = new Payload(200);// weight = 200
p.setWeight(1024);//weight = 1024
changePayload(p);
System.out.println("p is " + p);
}
}
//Which code fragment, inserted at the end of line 12, produces the output p is 420?
//A. p.setWeight(420);
//B. p.changePayload(420);
//C. p = new Payload(420);
//D. Payload.setWeight(420);
//E. p = Payload.setWeight(420);
// Answer : A
//=================================================================================================








 












































