package strategy_pattern.vehicels;

import strategy_pattern.transportation.ITransport;

public class Car extends Vehicle{

	public Car(ITransport transportType) {
		super(transportType);
	}

}
