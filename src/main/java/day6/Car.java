package day6;

public class Car {
	private int yearOfManufacture;
	private String color;
	private String model;

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}
	public void info() {
		System.out.println("This is car");
	}
	public int yearDifference (int year) {
		return year - yearOfManufacture;
	}
}
