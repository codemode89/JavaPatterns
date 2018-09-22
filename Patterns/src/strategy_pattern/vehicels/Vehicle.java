package strategy_pattern.vehicels;

import strategy_pattern.transportation.ITransport;

/** 
 * The transport logic is completely separated from the vehicle.
 * Changes to the transport logic do not affect the vehicle classes or any of the subclasses of vehicle.
 * Reduces code duplication.
 * 
 * Negatives: Strategy-Pattern requires more objects.
 * 
 * @author Jan Müller
 *
 */
public class Vehicle {
	
	private ITransport transportType;
	
	public Vehicle(ITransport transportType) {
		this.transportType = transportType;
	}
	
	public void transport() {
		System.out.println(transportType.startTransport());
	}	
}
