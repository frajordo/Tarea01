package application;

public interface Observer {
	
	void update(Subject observable, Object ... newState);	
	
}
