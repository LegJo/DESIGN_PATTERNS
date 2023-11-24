package design_pattern.facade_and_factory_fabric;

public class View1 {
	private String userType;
	public View1(String userType) {
		this.userType = userType;
	}
	
	public void displayInfo() {
		Facade facade = Facade.factoryFabricGetFacade(userType);
		System.out.println("View 1 : \nCalculation: " + facade.calculResult() + "\n I am: " + facade.whoAmI());
	}

}
