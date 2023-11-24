package design_pattern.strategy;

public class ActionType1 implements Action {	
	public ActionType1() {
		return;
	}

	@Override
	public void _do() {
		System.out.println("do of ActionType1");
	}
}
