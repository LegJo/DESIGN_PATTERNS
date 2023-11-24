package design_pattern.adapater.heritageAdaptater;

public class TheConcreteInterface implements TheMainInterface {
	private String name;

	public TheConcreteInterface() {
		super();
		this.name = "Concrete Interface";
	}

	@Override
	public void sayMyName() {
		System.out.println("I am " + getName());
	}

	@Override
	public String getName() {
		return name;
	}

}
