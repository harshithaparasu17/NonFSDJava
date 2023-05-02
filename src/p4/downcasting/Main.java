package p4.downcasting;

public class Main {
	public static void main(String[] args) {
		Colours col1 = new Black();
		col1.drawShape();

		if (col1 instanceof Black) {
			Black black = (Black) col1;
			black.paintBrush();
		}
	}
}
