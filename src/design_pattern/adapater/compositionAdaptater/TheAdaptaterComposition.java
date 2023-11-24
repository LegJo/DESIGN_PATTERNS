package design_pattern.adapater.compositionAdaptater;

import design_pattern.adapater.TheExternalClass;

public class TheAdaptaterComposition extends TheMainClass {
	private TheExternalClass adaptated;

	public TheAdaptaterComposition() {
		super("Adaptater Composition");
		this.adaptated = new TheExternalClass();
	}
	
	public TheExternalClass getAdaptated() {
		return adaptated;
	}
	

	
	@Override
	public String getName() {
		return getAdaptated().getExternalName();
	}
}
