package p5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
	public static void main(String[] args) {
		// creating an instance of the FileReader class
		FileReader fileReader;
		try {
			fileReader = new FileReader("Test.txt");
			// create instance of the BufferedReader and pass the FileReader instance to it.
			BufferedReader bufferReader = new BufferedReader(fileReader);

			// declaring an empty string by passing null value
			String fileData = null;

			// use while loop to read and print data from buffered reader
			try {
				while ((fileData = bufferReader.readLine()) != null) {
					System.out.println(fileData);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
