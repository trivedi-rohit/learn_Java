/*
class Concept_AnonymousArray{
	public static void main (String[]args){
	int[] a={10,20,30,40,50};
	display(a);
	System.out.println(a.length);
	
	
	
	
	//System.out.print(a.length);
}
	static void display(int[] arr){
		for (int ele:arr)
			System.out.print(ele+" ");
	}
}
*/
//=========================================================
// Anonymous Array:
class Concept_AnonymousArray{
	public static void main (String[]args){
	display(new int[] {10,20,30,40,50});
	}
	static void display(int[] arr){
		for (int ele:arr)
			System.out.print(ele+" ");
	}
}