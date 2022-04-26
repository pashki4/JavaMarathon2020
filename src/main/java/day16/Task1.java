package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		printResult(new File("numbers"));
	}

	public static void printResult(File file) {
		StringBuilder sb = new StringBuilder();
		double result = 0.0;
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				sb.append(line + " ");
			}
			String[] split = sb.toString().trim().split(" ");
			for (String num : split) {
				result += Integer.parseInt(num);
			}
			result = result / split.length;
			System.out.printf(result + " --> %.3f", result);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
