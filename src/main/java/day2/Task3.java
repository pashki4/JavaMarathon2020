package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int a = scanner.nextInt();
    	int b = scanner.nextInt();
    	if (a >= b) {
    		System.out.println("Некорректный ввод");
    	}
    	int low = a + 1;
    	while (low < b) {
    		if(low % 5 == 0 && low % 10 != 0) {
    			System.out.print(low + " ");
    		}
    		low++;
    	}
    }
}
