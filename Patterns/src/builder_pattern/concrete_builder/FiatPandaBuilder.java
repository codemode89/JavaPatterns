package builder_pattern.concrete_builder;

import builder_pattern.builder.ICarBuilder;
import builder_pattern.product.Car;

public class FiatPandaBuilder implements ICarBuilder{

	private Car car;
	
	public FiatPandaBuilder() {
		this.car = new Car();
	}
	
	@Override
	public void createName() {
		this.car.setName("Fiat Panda");
	}

	@Override
	public void createTires() {
		this.car.setTires("Toyo Tires");
		
	}

	@Override
	public void createEngine() {
		this.car.setEngine("1.2L");
	}

	@Override
	public void createFuelType() {
		this.car.setFuelType("Diesel");
	}

	@Override
	public Car getCar() {
		return this.car;
	}


}