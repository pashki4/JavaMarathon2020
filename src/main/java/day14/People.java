package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class People {
	private String name;
	private int year;

	public People(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public static List<People> parseFileToObjList(File file) {
		List<People> list = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] peopleData = line.split(" ");
				if (Integer.parseInt(peopleData[1]) < 0)
					throw new IllegalArgumentException();
				list.add(new People(peopleData[0],
						Integer.parseInt(peopleData[1])));
			}
			return list;
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден");
		} catch (IllegalArgumentException e) {
			System.out.println("Некорректный входной файл");
		}
		return new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return year;
	}

	public void setAge(int age) {
		this.year = age;
	}

	@Override
	public String toString() {
		return "{name='" + name + "', year=" + year + "}";
	}

}
