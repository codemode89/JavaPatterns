package observer_pattern.car_observer_example;

import java.util.ArrayList;
import java.util.List;

import observer_pattern.Observer;
import observer_pattern.Publisher;

public class FuelTank implements Publisher {

	private List<Observer> observers;
	private int tankFillLevel = 0;
	
	public FuelTank() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		observers.forEach(observer -> observer.update(tankFillLevel));
	}
	
	public void decreaseFuel(int amount) {
		this.tankFillLevel -= amount;
		if(tankFillLevel <0)
			this.tankFillLevel = 0;
		
		this.notifyObserver();
	}
	
	public void increaseFuel(int amount) {
		this.tankFillLevel += amount;
		if(tankFillLevel >100)
			this.tankFillLevel = 100;
		
		this.notifyObserver();
	}

}
