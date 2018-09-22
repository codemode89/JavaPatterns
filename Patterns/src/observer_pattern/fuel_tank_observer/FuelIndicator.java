package observer_pattern.fuel_tank_observer;

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
