package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		missingShoesFinder(new File("src/main/resources/shoes.csv"));
	}

	public static void missingShoesFinder(File file) {
		File newFile = new File("src/main/resources/missing_shoes.txt");
		try {
			newFile.createNewFile();
			Scanner scanner = new Scanner(file);
			PrintWriter pw = new PrintWriter(newFile);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] split = line.split(";");
				if(Integer.parseInt(split[2]) == 0) {
					pw.println(line.replaceAll(";", ", "));
				}
			}
			pw.close();
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}
}
