package day7;

import java.util.Random;

public class Task2 {
	public static void main(String[] args) {
		Player.info();
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			Player player = new Player(random.nextInt(11) + 90);
			Player.info();
		}
	}
}
