package p5;

public class ThreadMethods implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Thread is running");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThreadMethods t1 = new ThreadMethods();
		Thread t = new Thread(t1);
		t.start();
		t.setPriority(5);
	}
}
