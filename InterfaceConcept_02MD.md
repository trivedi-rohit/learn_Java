 1) extends:: One class can extends only class at a time.
 eg:: 
		    class One{}
    	    class Two extends One{}

implements:: One class can implements any number of interface at time.
eg:: 
	 
      interface One{
    			public void m1() {}
    	   }
    	   interface Two{
    			public void m2() {}
    	   }
    	   class Demo implements One,Two{
    			public void m1() {}
    			public void m2() {}
    	   }

================================================================================
2) A Class can extends a class and can implement any number of interface simultaneously.
a. Reuseability:=> extends
	b. implementation:=> interface
	   

    class Sample{
    		   public void m1() {
    		
    		  }
    	   }
    	   interface IDemo{
    		   void m2();
    	   
    	   }
    
    	   class   DemoImpl  extends Sample implements IDemo
    	   	{
    		   public void m2() {
    			   
    		   }
    	   	}
    	   public class InterfaceConcept_02 {
    		   public static void main(String[] args) {
    			   
    		   	}
    	   }

//==================================================================================
3) An interface can extends any number of interfaces at a time.
	  
    interface IDemo1
    {
    	void m1();
    }
    interface IDemo2
    {
    	void m2();
    }
    interface IDemo3 extends IDemo1, IDemo2
    {
    	void m3();
    }
    
    class SampleImpl implements IDemo3
    {
    	public void m1() {
    		System.out.println("m1");
    	}
    	public void m2() {
    		System.out.println("m2");
    	}
    	public void m3() {
    		System.out.println("m3");
    	}
    }
    
    public class InterfaceConcept_02{
    	public static void main(String[]args) {
    		
    	}
    }

