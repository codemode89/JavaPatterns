package strategy_pattern.transportation;

public class LandTransport implements ITransport{
	@Override
	public String startTransport() {
		return "Land transport started";
	}
}
