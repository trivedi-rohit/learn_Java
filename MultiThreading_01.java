package multiThreading;
/*
class Thread
{
	// start() method is called as "Heart of MultiThreading".
public void start()
{
	1.  start() method will "Register the Thread with Thread Scheduler".
	2. All other mandatory low level (memory level) activities.
	3. Invoke or call run() method.
}
public void run()
{
		// no implementation
}	
}
*/

class myThread extends Thread
{
@Override
public void run()
{
	// Task for userdefined Method
	// Job of a Thread
	for (int i=1; i<=5; i++) 
	{
		System.out.println("Child Thread");	
	}
}
}
public class MultiThreading_01{
public static void main(String[] args) {

	myThread t = new myThread();
	t.start();   // This line will create a new Thread, which is responsible to execute run() method.

// Two thread started and eagerly waiting for CPU time; Scheduling is done by Thread Scheduler (T.S)
// Task for main Thread 
	for (int i=1; i<=5; i++)
	{
		System.out.println("Main Thread");	
	}
}
}