package day11.task1;

public class Picker implements Worker {
	private int salary;
	private Warehouse warehouse;

	public Picker(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public void doWork() {
		warehouse.setCountOrder(warehouse.getCountOrder() + 1);
		salary += 80 * bonus();
	}

	@Override
	public int bonus() {
		if (warehouse.getCountOrder() >= 1500)
			return 3;
		else
			return 1;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
}
