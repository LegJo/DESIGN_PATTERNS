package design_pattern.fabric;

public class EntityGroup {
	private EntityA eA;
	private EntityB eB;
	
	public EntityGroup(String type) {
		super();
		init(type);
	}
	
	protected void init(String type) {
		Selector s;
		switch (type.toUpperCase()) { //juste pour tester les 2 types le switch
		case "TYPE1":
			s = new Selector_Type1();
			break;
		case "TYPE2":
			s = new Selector_Type2();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		
		this.eA = s.createEntityA();
		this.eB = s.createEntityB();
		// comment switch de Selector apres premiere init ? 
	}

	public void saysType() {
		eA.whoAmI();
		eB.whoAmI();
	}
}
