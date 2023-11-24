package design_pattern.facade_and_factory_fabric;

public class FacadeUser implements Facade {

	public FacadeUser() {
		
	}

	@Override
	public String calculResult() {
		return "User result: " + IDoThings1.onePlusOne() + IDoThings2.sixTimesSeven();
	}

	@Override
	public String whoAmI() {
		return IDoThings1.randomString() + " " + IDoThings2.dupString("User");
	}

}
