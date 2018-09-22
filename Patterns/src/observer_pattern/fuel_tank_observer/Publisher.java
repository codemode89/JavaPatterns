package observer_pattern.fuel_tank_observer;

public interface Publisher {
	void register(Observer observer);
	void unregister(Observer observer);
	void notifyObserver();
}
