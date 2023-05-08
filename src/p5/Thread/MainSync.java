package p5.Thread;

public class MainSync {
	public static void main(String[] args) {
		AvoidRaceCondition rc = new AvoidRaceCondition();
		Thread t1 = new Thread(rc, "Thread-1");
		Thread t2 = new Thread(rc, "Thread-2");
		Thread t3 = new Thread(rc, "Thread-3");

		t1.start();
		t2.start();
		t3.start();
}
}
