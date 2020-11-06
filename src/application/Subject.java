package application;

import java.util.Collection;

public interface Subject {

	void attach(Observer obs);
	
	void detach(Observer obs);
	
	Collection<Observer> getObservers();
}
