package observer_pattern.car_observer_example;

import observer_pattern.Observer;

public class FuelIndicator implements Observer{
	private int currentFuelLevel;

	@Override
	public void update(int newAmount) {
		this.currentFuelLevel = newAmount;	
	}
	
	public int getFuelLevel() {
		return this.currentFuelLevel;
	}
}
