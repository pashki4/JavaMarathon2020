package day11.task1;

public class Task1 {
	public static void main(String[] args) {
		Warehouse warehouse1 = new Warehouse();
		Picker picker1 = new Picker(warehouse1);
		Courier courier1 = new Courier(warehouse1);

		System.out.println(warehouse1);

		courier1.doWork();
		courier1.doWork();

		System.out.println(warehouse1);
	}
}
