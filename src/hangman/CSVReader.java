package hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class CSVReader {
	public CSVReader() {
		File file = new File("input.csv");
		Scanner fileInputStream = null;
		try {
			fileInputStream = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Random rand = new Random();
		
		try {
			while(fileInputStream.hasNext()) {
				String line = fileInputStream.nextLine();
				String[] words = line.split(",");

			}
		}catch (InputMismatchException ime) {
			ime.printStackTrace();
		}
	}
}
