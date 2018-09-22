package factory_pattern.car_factory;

public class CarFactory {

	public Car createCar(String type) {
		switch (type) {
		case "slow":
			return new SlowCar();
		case "fast":
			return new FastCar();
		default:
			return null;
		}
	}
	
}
