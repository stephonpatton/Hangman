package hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class HangmanCSVReader {
	public String[] words = null;
	public int randomWord = 0;
	
	public HangmanCSVReader() {
		File file = new File("input.csv");
		Random rand = new Random();
		Scanner fileInputStream = null;	
		try {
			fileInputStream = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			while(fileInputStream.hasNext()) {
				String line = fileInputStream.nextLine();
				words = line.split(",");
				randomWord = rand.nextInt(words.length);
			}
			System.out.println(words[randomWord]);
		}catch (InputMismatchException ime) {
			ime.printStackTrace();
		}
	}
}
