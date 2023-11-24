package design_pattern;

import java.util.List;
import java.util.ArrayList;
import design_pattern.singleton.*;
import design_pattern.adapater.compositionAdaptater.*;
import design_pattern.adapater.heritageAdaptater.*;
import design_pattern.composite.Composite;
import design_pattern.fabric.EntityGroup;
import design_pattern.facade_and_factory_fabric.*;
import design_pattern.strategy.*;
import design_pattern.observer.*;

public class Client {
	
	private static void sysout(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		sysout("Singleton");
		sysout("");
		sysout("1: " + Singleton.getUnique());
		sysout("2: " + Singleton.getUnique());
		
		sysout("---");
		
		sysout("Adaptater Composition");
		List<TheMainClass> mainClassList = new ArrayList<>();
		mainClassList.add(new TheAdaptaterComposition());
		mainClassList.add(new TheConcreteClass());
		for (TheMainClass mainClass : mainClassList) {
			mainClass.sayMyName();
		}
		
		sysout("---");
		
		sysout("Adaptater Heritage");
		sysout("");
		List<TheMainInterface> mainInterfaceList = new ArrayList<>();
		mainInterfaceList.add(new TheAdaptaterHeritage());
		mainInterfaceList.add(new TheConcreteInterface());
		for (TheMainInterface mainInterface : mainInterfaceList) {
			mainInterface.sayMyName();
		}
		
		sysout("---");
		
		sysout("Strategy");
		sysout("");
		List<Entity> entityList = new ArrayList<>();
		entityList.add(new Entity("Entity with action type 1",new ActionType1()));
		entityList.add(new Entity("Entity with action type 2",new ActionType2()));
		for (Entity entity : entityList) {
			sysout("");
			entity.sayName();
			entity.doAction();
		}
		
		sysout("---");
		
		sysout("Observer");
		sysout("");
		Application app = new Application();
		app.addObserver(new Observer1());
		app.addObserver(new Observer2());
		app.doSomething("yipi");
		
		sysout("---");
		
		sysout("Factory Fabric & Facade");
		sysout("");
		View1 v1 = new View1("User");
		View2 v2 = new View2("Admin");
		v1.displayInfo();
		sysout("");
		v2.displayInfo();
		
		sysout("---");
		
		sysout("Fabric/Selector");
		sysout("");
		EntityGroup eG1 = new EntityGroup("Type1");
		EntityGroup eG2 = new EntityGroup("Type2");
		sysout("Entity Group with selector Type 1");
		eG1.saysType();
		sysout("");
		sysout("Entity Group with selector Type 2");
		eG2.saysType();
		
		sysout("---");
		
		sysout("Composite");
		sysout("");
		
		Composite tree = new Composite(1);
		Composite tree2 = new Composite(2);
		Composite tree3 = new Composite(3);
		Composite tree4 = new Composite(4);
		Composite tree5 = new Composite(5);
		Composite tree6 = new Composite(6);
		Composite tree7 = new Composite(7);
		Composite tree8 = new Composite(8);
		tree.addChild(tree2);
		tree.addChild(tree3);
		tree2.addChild(tree8);
		tree2.addChild(tree8);
		tree3.addChild(tree4);
		tree3.addChild(tree7);
		tree4.addChild(tree5);
		tree4.addChild(tree6);
		Composite.displayTree(tree, "", false);
		sysout("");
		Composite.displayTree(tree3, "", false);
	}
	
}
