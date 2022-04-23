package day11.task1;

public class Courier implements Worker {
	private int salary;
	private Warehouse warehouse;

	public Courier(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public void doWork() {
		warehouse.setBalance(warehouse.getBalance() + 1000);
		salary += 100 * bonus();
	}

	@Override
	public int bonus() {
		if (warehouse.getBalance() >= 1_000_000)
			return 2;
		else
			return 1;
	}
}
