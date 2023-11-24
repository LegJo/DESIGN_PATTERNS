package design_pattern.strategy;

public class Entity {
	private String name;
	private Action actionBehavior;
	
	public Entity(String name, Action actionBehavior) {
		this.name = name;
		this.actionBehavior = actionBehavior;
	}
	
	public String getName() {
		return name;
	}
	
	public Action getActionBehavior() {
		return actionBehavior;
	}

	public void doAction() {
		getActionBehavior()._do();
	}
	
	public void sayName() {
		System.out.println(getName());
	}
}
