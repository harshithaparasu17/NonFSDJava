package p5.Thread;

public class ThreadPriority extends Thread{
	 public void run()  
	    {    
	        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
	    }    
	    public static void main(String args[])  
	    {    
	        ThreadPriority t1=new ThreadPriority();
	        t1.setPriority(Thread.MAX_PRIORITY);    
	        t1.start();    
	    }    
}
