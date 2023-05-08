package p5.Thread;

public class Thread2 extends Thread1 {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 100; i++) {
				total += i;
			}
			notify();
		}
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}
