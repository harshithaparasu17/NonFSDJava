package p4.lamdaExpressions;

public class DemoMain {

	public static void main(String[] args) {
		A obj = (i, j) -> i + j;
		int result=obj.add(4, 5);
		System.out.println(result);
	}
}
