package observer_pattern.car_observer_example;

public class Car {
	private FuelTank fuelTank;
	private FuelIndicator fuelIndicator;

	public Car() {
		this.fuelTank = new FuelTank();
		this.fuelIndicator = new FuelIndicator();
		this.fuelTank.register(fuelIndicator);
	}

	public boolean canDrive() {
		return this.fuelIndicator.getFuelLevel()>=10;
	}
	
	public void showFuelLevel() {
		System.out.println(String.format("Current fuel level: %d liters",fuelIndicator.getFuelLevel()));
	}
	
	public void refuel(int amount) {
		this.fuelTank.increaseFuel(amount);
		System.out.println(String.format("%d liters fuel refueled", amount));
	}
	
	public void drive() {
		if(this.canDrive()) {
			this.fuelTank.decreaseFuel(10);
			System.out.println("10 liters fuel used");			
		}else {
			System.out.println("You can't drive without 10 liters or more in your tank.\n Pls tank some fuel :)");	
		}
	}
	
	public static void main(String[] args) {
		Car audiA6 = new Car();
		audiA6.refuel(10);
		audiA6.showFuelLevel();
		audiA6.drive();
		audiA6.showFuelLevel();
		audiA6.drive();
	}
}
