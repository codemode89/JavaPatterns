package strategy_pattern.vehicels;

import strategy_pattern.transportation.AirTransport;
import strategy_pattern.transportation.ITransport;
import strategy_pattern.transportation.LandTransport;

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
	
	public static void main(String[] args) {
		Airplane boing747 = new Airplane(new AirTransport());
		boing747.transport();
		
		Car audiA8 = new Car(new LandTransport());
		audiA8.transport();
	}
	
}
