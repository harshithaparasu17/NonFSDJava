package p5;

public class Main {
	public static void main(String[] args) {
		Runnable a1 = new Runnable() {

			@Override
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

		};
		Runnable a2 = new Runnable() {

			@Override
			public void run() {
				try {
					for (int i = 1; i <= 5; i++) {
						System.out.println("2");
						Thread.sleep(5);
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a2);
		t1.start();
		t2.start();

	}
}
