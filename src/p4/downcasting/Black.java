package p4.downcasting;

public class Black extends Colours {
	@Override
	public void drawShape() {
		System.out.println("Black color to draw shape");
	}

	public void paintBrush() {
		System.out.println("Paint color is black color");
	}
}
