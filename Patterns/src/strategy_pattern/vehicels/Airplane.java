package strategy_pattern.vehicels;

import strategy_pattern.transportation.ITransport;

public class Airplane extends Vehicle{

	public Airplane(ITransport transportType) {
		super(transportType);
	}

}
