package strategy_pattern.transportation;

public class AirTransport implements ITransport{
	@Override
	public String startTransport() {
		return "Air transport started";
	}
}
