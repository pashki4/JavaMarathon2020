package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int arrayLength = scanner.nextInt();
		int maxValueOf3NearNumbers = 0;
		int indexOfFirsOfThree = -1;

		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10000) + 0;
		}
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length - 2; i++) {
			int buffer = 0;
			for (int j = i; j <= i + 2; j++) {
				buffer += array[j];
			}
			if (buffer > maxValueOf3NearNumbers) {
				maxValueOf3NearNumbers = buffer;
				indexOfFirsOfThree = i;
			}
		}
		System.out.println(
				"Max sum of near three numbers: " + maxValueOf3NearNumbers);
		System.out.println("Index of first of three: " + indexOfFirsOfThree);
	}
}
