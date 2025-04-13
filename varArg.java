// 1-D & 2-D var-arg
/*
class Test
{
	public void m1(int... x){
	for (int oneD:x){
		System.out.println(oneD);
	}
}
	public static void main(String... args){
		Test d = new Test();
		d.m1(10,20,30);
	}
}
*/

class Demo
{
	public void m1(int[]... x){
		System.out.println(x);
	for (int[] oneD:x){
		System.out.println(oneD);
		for (int ele:oneD)
		{
			System.out.println(ele);
		}}
		System.out.println();
	}
}
class varArg
{
	public static void main(String... args){
		int[] a={10,20,30};
		int[] b={40,50};

		Demo d = new Demo();
		d.m1(a,b);
	}
}