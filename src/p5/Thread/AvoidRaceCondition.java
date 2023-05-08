package p5.Thread;

public class AvoidRaceCondition implements Runnable {
	private int c = 0;  
	public void increment()   
	{  
	try   
	{  
	Thread.sleep(10);  
	}   
	catch (InterruptedException e)   
	{  
	e.printStackTrace();  
	}  
	c++;  
	}  
	public void decrement()   
	{      
	c--;          
	}  
	public int getValue()   
	{  
	return c;  
	}  
	@Override
	public void run() {
		synchronized(this)  
		{  
		// incrementing  
		this.increment();  
		System.out.println("Value for Thread After increment " + Thread.currentThread().getName() + " " + this.getValue());  
		//decrementing  
		this.decrement();  
		System.out.println("Value for Thread at last " + Thread.currentThread().getName() + " " + this.getValue());  
		}          
	}

}
