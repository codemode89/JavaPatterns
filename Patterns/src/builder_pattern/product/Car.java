package builder_pattern.product;

public class Car implements ICarBlueprint{
	private String name;
	private String tires;
	private String engine;
	private String fuelType;
	
	@Override
	public void setName(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void setTires(String tires) {
		this.tires = tires;
	}
	
	public String getTires() {
		return tires;
	}

	@Override
	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getEngine() {
		return engine;
	}

	@Override
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return fuelType;
	}
	
}
