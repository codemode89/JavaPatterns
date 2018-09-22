package builder_pattern;

import builder_pattern.builder.ICarBuilder;
import builder_pattern.concrete_builder.AudiA6Builder;
import builder_pattern.concrete_builder.FiatPandaBuilder;
import builder_pattern.director.CarEngineer;

public class CreateCars {
	public static void main(String[] args) {
		ICarBuilder blueprintAudi = new AudiA6Builder();
		CarEngineer carEngineer1 = new CarEngineer(blueprintAudi);
		carEngineer1.createCar();
		System.out.println(String.format("Car: %s\n\tTires: %s\n\tEngine: %s\n\tFuel: %s", carEngineer1.getCar().getName(),
				carEngineer1.getCar().getTires(),
				carEngineer1.getCar().getEngine(),
				carEngineer1.getCar().getFuelType()));
		
		System.out.println("\n-------------------------\n");
		
		ICarBuilder blueprintFiat = new FiatPandaBuilder();
		CarEngineer carEngineer2 = new CarEngineer(blueprintFiat);
		carEngineer2.createCar();
		System.out.println(String.format("Car: %s\n\tTires: %s\n\tEngine: %s\n\tFuel: %s", carEngineer2.getCar().getName(),
				carEngineer2.getCar().getTires(),
				carEngineer2.getCar().getEngine(),
				carEngineer2.getCar().getFuelType()));
	}
}
