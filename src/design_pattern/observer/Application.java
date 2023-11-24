package design_pattern.observer;

import java.util.List;
import java.util.ArrayList;

public class Application {
	private String data;
	private List<Observer> observers;
	
	public Application() {
		this.data = "";
		this.observers = new ArrayList<>();
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	
	public String getData() {
		return data;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void _notifyAll() {
		for (Observer observer : getObservers()) {
			observer._notify(getData());
		}
	}
	
	public void doSomething(String newData) {
		setData(newData);
		System.out.println("Application has updated data : " + getData());
		_notifyAll();
	}
	
	public void addObserver(Observer observer) {
		getObservers().add(observer);
	}
	
	public void removeObserver(Observer observer) {
		getObservers().remove(observer);
	}
}
