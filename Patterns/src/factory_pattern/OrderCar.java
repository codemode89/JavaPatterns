package factory_pattern;

import factory_pattern.car_factory.Car;
import factory_pattern.car_factory.CarFactory;

public class OrderCar {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		Car slowCar = carFactory.createCar("slow");
		Car fastCar = carFactory.createCar("fast");
		System.out.println(String.format("Max Speed of %s: %d",slowCar.getName(),slowCar.getSpeed()));
		System.out.println(String.format("Max Speed of %s: %d",fastCar.getName(),fastCar.getSpeed()));
	}
}
