package builder_pattern.builder;

import builder_pattern.product.Car;

public interface ICarBuilder {
	void createName();
	void createTires();
	void createEngine();
	void createFuelType();
	Car getCar();
}
