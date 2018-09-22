package observer_pattern;

public interface Publisher {
	void register(Observer observer);
	void unregister(Observer observer);
	void notifyObserver();
}
