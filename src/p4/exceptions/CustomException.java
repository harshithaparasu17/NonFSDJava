package p4.exceptions;

public class CustomException {

	// This method throws an InvalidInputException with a message.
	public static void justThrowException() throws InvalidInputException {
		throw new InvalidInputException("Explain Exception Here");
	}

	// This is the main method that catches the InvalidInputException thrown by
	// justThrowException method.
	public static void main(String[] args) {
		try {
			justThrowException();
		} catch (InvalidInputException e) {
			// Prints the stack trace of the exception to the console.
			e.printStackTrace();
		}
	}
}
