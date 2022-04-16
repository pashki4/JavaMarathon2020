package day5;

public class Task1 {
	public static void main(String[] args) {
		Car car = new Car();
		car.setYearOfManufacture(2016);
		car.setColor("Grey");
		car.setModel("model S");

		System.out.println(car.getModel());
		System.out.println(car.getYearOfManufacture());
		System.out.println(car.getColor());
	}
}
