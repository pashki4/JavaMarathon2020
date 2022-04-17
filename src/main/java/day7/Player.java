package day7;

public class Player {
	private static final int MAX_STAMINA = 100;
	private static final int MIN_STAMINA = 0;
	private static int countPlayers = 0;
	private int stamina;

	public Player(int stamina) {
		if (countPlayers < 6) {
			this.stamina = stamina;
			this.countPlayers++;
		}
	}
	public static void info() {
		int freeSlots = 6 - Player.countPlayers;
		if (freeSlots >= 5) {
			System.out.printf(
					"Команды неполные. На поле еще есть %d свободных мест\n",
					freeSlots);
		} else if (freeSlots == 1) {
			System.out.printf(
					"Команды неполные. На поле еще есть %d свободное место\n",
					freeSlots);
		} else if ((freeSlots > 1 && freeSlots < 5)) {
			System.out.printf(
					"Команды неполные. На поле еще есть %d свободных места\n",
					freeSlots);
		} else if (freeSlots == 0) {
			System.out.printf("На поле нет свободных мест\n");
		}
	}
	public void run() {
		if (this.stamina > Player.MIN_STAMINA) {
			this.stamina--;
		}
		if (this.stamina == 0 && Player.countPlayers != 0) {
			Player.countPlayers--;
		}
	}
	public static int getCountPlayers() {
		return countPlayers;
	}
	public int getStamina() {
		return stamina;
	}
}
