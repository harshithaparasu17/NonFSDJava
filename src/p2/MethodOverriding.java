package p2;

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		SBI s = new SBI();
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
	}
}
