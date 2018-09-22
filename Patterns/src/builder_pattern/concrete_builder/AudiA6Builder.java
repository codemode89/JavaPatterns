package builder_pattern.concrete_builder;

import builder_pattern.builder.ICarBuilder;
import builder_pattern.product.Car;

public class AudiA6Builder implements ICarBuilder{

	private Car car;
	
	public AudiA6Builder() {
		this.car = new Car();
	}

	@Override
	public void createName() {
		this.car.setName("Audi A6");
	}
	
	@Override
	public void createTires() {
		this.car.setTires("Hankook Ventus Prime");
		
	}

	@Override
	public void createEngine() {
		this.car.setEngine("V6");
	}

	@Override
	public void createFuelType() {
		this.car.setFuelType("Gasoline");
	}

	@Override
	public Car getCar() {
		return this.car;
	}


}
