package p5.Thread;

public class MultipleThreads extends Thread{
	
	public void run() {
		for(int i=1;i<5;i++)  
        {    
            try 
            {  
                Thread.sleep(500);  
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
		System.out.println("Thread is running...");
	}
	public static void main(String args[])  
    {    
       MultipleThreads t1=new MultipleThreads();
       MultipleThreads t2=new MultipleThreads();
       MultipleThreads t3=new MultipleThreads();
        t1.start();    
        try 
        {    
        t1.join();    
        }catch(Exception e){System.out.println(e);}    
        t2.start();   
        t3.start();  
    } 
}
