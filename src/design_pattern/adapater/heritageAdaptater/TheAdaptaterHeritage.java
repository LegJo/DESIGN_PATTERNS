package design_pattern.adapater.heritageAdaptater;

import design_pattern.adapater.TheExternalClass;

public class TheAdaptaterHeritage extends TheExternalClass implements TheMainInterface  {
	@SuppressWarnings("unused")
	private String name;

	public TheAdaptaterHeritage() {
		super();
		this.name = "Adaptater Heritage";
	}

	@Override
	public String getName() {
		return getExternalName();
	}
	
	@Override
	public void sayMyName() {
		System.out.println("I am " + getName());
	}
}
