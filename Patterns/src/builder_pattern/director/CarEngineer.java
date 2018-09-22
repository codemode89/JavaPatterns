package builder_pattern.director;

import builder_pattern.builder.ICarBuilder;
import builder_pattern.product.Car;

public class CarEngineer {

	private ICarBuilder carBuilder;
	
	public CarEngineer(ICarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}

	public Car getCar() {
		return this.carBuilder.getCar();
	}
	
	public void createCar() {
		this.carBuilder.createName();
		this.carBuilder.createEngine();
		this.carBuilder.createFuelType();
		this.carBuilder.createTires();
	}
	
}
