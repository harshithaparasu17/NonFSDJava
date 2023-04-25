package p3.constructor;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("John", 30);
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
	}
}
