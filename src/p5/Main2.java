package p5;

public class Main2 {
	public static void main(String[] args) {

		Practice p1 = new Practice();
		Practice2 p2 = new Practice2();
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		t1.start();
		t2.start();
	}
}
