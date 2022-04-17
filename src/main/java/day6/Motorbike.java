package day6;

public class Motorbike {
	private int yearOfManufacture;
	private String model;
	private String color;

	Motorbike(int yearOfManufacture, String model, String color) {
		this.yearOfManufacture = yearOfManufacture;
		this.model = model;
		this.color = color;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public void info() {
		System.out.println("This is motorbike");
	}
	public int yearDifference (int year) {
		return year - yearOfManufacture;
	}
}
