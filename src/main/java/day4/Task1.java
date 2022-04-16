package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();
		int[] array = new int[arraySize];
		int numbersMoreThenEight = 0;
		int numbersEqualsOne = 0;
		int evenNumbers = 0;
		int unevenNumbers = 0;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(11 + 0);
		}
		for (int value : array) {
			if (value > 8) {
				numbersMoreThenEight++;
			}
			if (value == 1) {
				numbersEqualsOne++;
			}
			if (value % 2 == 0) {
				evenNumbers++;
			}
			if (value % 2 != 0) {
				unevenNumbers++;
			}
			sum += value;
		}
		System.out.printf("Введено число %s. Сгенерирован случайный массив:\n",
				arraySize);
		System.out.println(Arrays.toString(array));
		System.out.println("Информация о массиве:");
		System.out.println("Длина массива: " + array.length);
		System.out
				.println("Количество чисел больше 8: " + numbersMoreThenEight);
		System.out.println("Количество чисел равных 1: " + numbersEqualsOne);
		System.out.println("Количество четных чисел: " + evenNumbers);
		System.out.println("Количество нечетных чисел: " + unevenNumbers);
		System.out.println("Сумма всех элементов массива: " + sum);
	}
}
