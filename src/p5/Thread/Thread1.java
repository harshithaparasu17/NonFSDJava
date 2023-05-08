package p5.Thread;

public class Thread1 {
public static void main(String[] args) {
	Thread2 b=new Thread2();
	b.start();
	synchronized(b)
	{
	try
	{
	System.out.println("Waiting for 2 to complete...");
	b.wait();
	}
	catch(InterruptedException e)
	{
	e.printStackTrace();
	}
	System.out.println("Total is: " + b.total);
	} 
}
}
