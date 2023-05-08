package p5.Thread;

public class StartThread extends Thread{
	public void run(){  
		System.out.println("thread is running...");  
		}  
public static void main(String[] args) {
	 
		StartThread t1=new StartThread();  
		t1.start();  
		 }  
}

