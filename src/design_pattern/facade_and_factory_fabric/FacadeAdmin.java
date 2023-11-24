package design_pattern.facade_and_factory_fabric;

public class FacadeAdmin implements Facade {

	public FacadeAdmin() {
		
	}

	@Override
	public String calculResult() {
		return "Admin result: " + IDoThings1.onePlusOne() + IDoThings2.sixTimesSeven();
	}

	@Override
	public String whoAmI() {
		return IDoThings1.randomString() + " " + IDoThings2.dupString("Admin");
	}

}
