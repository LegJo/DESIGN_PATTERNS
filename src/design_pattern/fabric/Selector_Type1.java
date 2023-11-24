package design_pattern.fabric;

public class Selector_Type1 implements Selector {
	
	public Selector_Type1() {
		super();
	}

	@Override
	public EntityA createEntityA() {
		return new EntityA_Type1();
	}

	@Override
	public EntityB createEntityB() {
		return new EntityB_Type1();
	}

}
