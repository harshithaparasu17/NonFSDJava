package p4.exceptions;

public class InvalidInputException extends Exception {
	public InvalidInputException(String statement) {
		super(statement);
	}
}
