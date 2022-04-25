package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		System.out.println(parseFileToStringList(new File("people")));
	}
	public static List<String> parseFileToStringList(File file) {
		List<String> list = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] split = line.split(" ");
				if (Integer.parseInt(split[1]) < 0) 
					throw new IllegalArgumentException();
				list.add(line);
			}
			return list;
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден");;
		} catch (IllegalArgumentException e) {
			System.out.println("Некорректный входной файл");
		}
		return new ArrayList<>();
	}
}
