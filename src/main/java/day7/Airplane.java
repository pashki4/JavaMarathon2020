package day7;

public class Airplane {
	private String producer;
	private int year;
	private double length;
	private double weight;
	private double fuel;

	public Airplane(String producer, int year, double length, double weight) {
		this.producer = producer;
		this.year = year;
		this.length = length;
		this.weight = weight;
		this.fuel = 0;
	}
	public double getFuel() {
		return fuel;
	}
	public void info() {
		System.out.println("Изготовитель: " + producer + ", год выпуска: "
				+ year + ", длина: " + length + ", вес: " + weight
				+ ", количество топлива в баке: " + fuel);
	}
	public void fillUp(double fuel) {
		this.fuel += fuel;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getLength() {
		return length;
	}
	public static void compareAirplanes(Airplane a1, Airplane a2) {
		int result = new Double(a1.getLength()).compareTo(new Double(a2.getLength()));
		if (result == -1) {
			System.out.println("Второй самолет длиннее");
		} else if (result == 1) {
			System.out.println("Первый самолет длиннее");
		} else {
			System.out.println("Длины самолетов равны");
		}
	}
}
