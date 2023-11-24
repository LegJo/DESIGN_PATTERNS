package design_pattern.observer;

public class Observer2 implements Observer {

	public Observer2() {
		return;
	}

	public void doSomething(String data) {
		System.out.println("Observer2 does something with data received from app : " + data);
	}

	@Override
	public void _notify(String data) {
		System.out.println("Observer2 notified");
		doSomething(data);
	}

}
