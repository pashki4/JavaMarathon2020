package day8;

public class Airplane {
	private String producer;
	private int year;
	private int length;
	private int weight;
	private int fuel;

	public Airplane(String producer, int year, int length, int weight) {
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
	public void setLength(int length) {
		this.length = length;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Изготовитель: " + producer + ", год выпуска: "
				+ year + ", длина: " + length + ", вес: " + weight
				+ ", количество топлива в баке: " + fuel;
	}
}
