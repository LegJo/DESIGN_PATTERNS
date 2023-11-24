package design_pattern.observer;

public class Observer1 implements Observer {

	public Observer1() {
		return;
	}
	
	public void doSomething(String data) {
		System.out.println("Observer1 does something with data received from app : " + data);
	}

	@Override
	public void _notify(String data) {
		System.out.println("Observer1 notified");
		doSomething(data);
	}

}
