package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) throws FileNotFoundException {
		createFilesWithData();
		printResult(new File("file2.txt"));
	}
	public static void createFilesWithData() {
		Random random = new Random();
		File file1 = new File("file1.txt");
		File file2 = new File("file2.txt");

		try {
			PrintWriter pw = new PrintWriter(file1);
			for (int i = 0; i < 1000; i++) {
				pw.println(random.nextInt(100));
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Scanner scanner = new Scanner(file1);
			PrintWriter pw = new PrintWriter(file2);
			int count = 0;
			double result = 0;
			while (scanner.hasNextLine()) {
				result += Integer.parseInt(scanner.nextLine());
				count++;
				if (count == 20) {
					result = result / 20.0;
					pw.println(result);
					count = 0;
					result = 0;
				}
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


	public static void printResult(File file) {
		try {
			double result = 0;
			StringBuilder sb = new StringBuilder();
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				sb.append(scanner.next() + " ");
			}
			String[] split = sb.toString().trim().split(" ");
			for (String strNum : split) {
				result += Double.parseDouble(strNum);
			}
			System.out.println((int) result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
