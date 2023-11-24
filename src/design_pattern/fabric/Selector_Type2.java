package design_pattern.fabric;

public class Selector_Type2 implements Selector {

	public Selector_Type2() {
		super();
	}
	
	@Override
	public EntityA createEntityA() {
		return new EntityA_Type2();
	}

	@Override
	public EntityB createEntityB() {
		return new EntityB_Type2();
	}

}
