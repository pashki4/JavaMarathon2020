package day6;

public class Task2 {
	public static void main(String[] args) {
		Airplane airplane = new Airplane("Cessna Textron Aviation", 1996, 8.28,
				11.00);
		airplane.info();
		airplane.setLength(11.2);
		airplane.setYear(1998);
		airplane.fillUp(30);
		airplane.info();
		airplane.fillUp(100);
		airplane.info();
	}
}
