package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input array length");
		int arrayLength = scanner.nextInt();
		int[] randomNumbers = new int[arrayLength];
		int maxNumber = -1;
		int minNumber = 10000;
		int endsByZeroNumber = 0;
		int sumOfNumbersEndsByZero = 0;

		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = random.nextInt((10000) + 0);
		}
		for (int number : randomNumbers) {
			if (number >= maxNumber) {
				maxNumber = number;
			}
			if (number <= minNumber) {
				minNumber = number;
			}
			if (number % 10 == 0) {
				endsByZeroNumber++;
				sumOfNumbersEndsByZero += number;
			}
		}
		System.out.println("Наибольший элемент массива: " + maxNumber);
		System.out.println("Наименьший элемент массива: " + minNumber);
		System.out.println("Количество элементов массива, оканчивающихся на 0: "
				+ endsByZeroNumber);
		System.out.println("Сумма элементов массива, оканчивающихся на 0: "
				+ sumOfNumbersEndsByZero);
	}
}
