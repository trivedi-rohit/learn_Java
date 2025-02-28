public class MethodChaining {

	public static void main(String[] args) {
		/*
		StringBuffer sb =new StringBuffer(1000);
		System.out.println(sb.capacity());
		sb.append("Sachin");
		System.out.println(sb.capacity());
		// To deallocate extra location as we don't further. so use "trimToSize"
		sb.trimToSize();
		System.out.println(sb.capacity());
		*/   /*
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());// 16
		;;;;;;;;
		;;;;;;;;;
		;;;;;;;;;;
		;;;;;;;;;;;
		;;;;;;;;;;;;
		;;;;;;;;;;;;;
		sb.ensureCapacity(1000);
		System.out.println(sb.capacity()); // 1000
		*/	
		String name= "Sachin";
		/*
		String data = name.toUpperCase();
		int count=data.length();
		System.out.println(count);
		*/
		//Method Chaining: (Wrote above 3 line code in one line)
		System.out.println(name.toUpperCase().length());
		
		StringBuffer sb = new StringBuffer("Virat");
		sb.append("Kohli").insert(10,"anushka").
		reverse().append("IND").insert(sb.length(),"RCB").reverse().delete(0,6);
		System.out.println(sb);
	}
}