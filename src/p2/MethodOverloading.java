package p2;

class TestOverloading {
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}
}

class MethodOverloading{

	public static void main(String[] args) {

		TestOverloading mol = new TestOverloading();
		int result = mol.add(11, 12);
		double answer = mol.add(7.890d, 3.1456d);
		System.out.println(result);
		System.out.println(answer);
	}

}
