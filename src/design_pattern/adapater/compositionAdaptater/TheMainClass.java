package design_pattern.adapater.compositionAdaptater;

public abstract class TheMainClass {
	private String name;
	
	public TheMainClass(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void sayMyName() {
		System.out.println("I am " + getName());
	}
}
