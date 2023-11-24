package design_pattern.facade_and_factory_fabric;

public class View2 {
	private String userType;
	public View2(String userType) {
		this.userType = userType;
	}
	
	public void displayInfo() {
		Facade facade = Facade.factoryFabricGetFacade(userType);
		System.out.println("View 2 : \nCalculation: " + facade.calculResult() + "\n I am: " + facade.whoAmI());
		System.out.println("Something different");
	}

}
