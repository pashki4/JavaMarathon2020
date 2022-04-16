package day4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rowCount = scanner.nextInt();
		int columnCount = scanner.nextInt();
		int[][] array = new int[rowCount][columnCount];
		settle2DArrayWithRandomNumbers(array);
		print2DArray(array);
		System.out.println("index of max row sum : " + indexOfRowMaxSum(array));

	}
	private static void print2DArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	private static void settle2DArrayWithRandomNumbers(int[][] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(50) + 0;
			}
		}
	}
	private static int indexOfRowMaxSum(int[][] array) {
		int maxSum = 0;
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			int buffer = 0;
			for (int j = 0; j < array[i].length; j++) {
				buffer += array[i][j];
			}
			System.out.println(buffer);
			if (buffer >= maxSum) {
				maxSum = buffer;
				index = i;
			}
		}
		return index;
	}
}
