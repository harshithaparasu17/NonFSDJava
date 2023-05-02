package p4.interfaces;

public class Repository implements IRepository {

	@Override
	public void data() {
		System.out.println("Data being Stored");

	}

	public static void main(String[] args) {
		Repository rep = new Repository();
		rep.data();
	}

}
