package strategy_pattern;

import strategy_pattern.transportation.AirTransport;
import strategy_pattern.transportation.LandTransport;
import strategy_pattern.vehicels.Airplane;
import strategy_pattern.vehicels.Car;

public class Transport {
	public static void main(String[] args) {
		Airplane boing747 = new Airplane(new AirTransport());
		boing747.transport();
		
		Car audiA8 = new Car(new LandTransport());
		audiA8.transport();
	}
}
