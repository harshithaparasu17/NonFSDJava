package p5;

public class Practice extends Thread {
	public void run() {

		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("1");
				Thread.sleep(5);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
