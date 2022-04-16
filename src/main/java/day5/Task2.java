package day5;

public class Task2 {
	public static void main(String[] args) {
		Motorbike motorbike = new Motorbike(2017, "Honda Rebel 300", "Black");
		System.out.println(motorbike.getModel());
		System.out.println(motorbike.getYearOfManufacture());
		System.out.println(motorbike.getColor());
	}
}
