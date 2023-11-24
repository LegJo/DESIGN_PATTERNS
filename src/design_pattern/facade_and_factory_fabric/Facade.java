package design_pattern.facade_and_factory_fabric;

public interface Facade {
	public String calculResult();
	public String whoAmI();
	public static Facade factoryFabricGetFacade(String userType) {
		switch (userType.toUpperCase()) {
		case "USER": {
			return new FacadeUser();
		}
		case "ADMIN": {
			return new FacadeAdmin();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + userType);
		}
	}
}
