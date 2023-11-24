package design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite {
	private List<Composite> children;
	private int value;
	
	public Composite(int value) {
		this.children = new ArrayList<>();
		this.value = value;
	}

	public List<Composite> getChildren() {
		return children;
	}
	
	public void addChild(Composite c) {
		children.add(c);
	}
	
	public void removeChild(Composite c) {
		children.remove(c);
	}
	
	public Boolean hasChildren() {
		return !children.isEmpty();
	}

	public int getValue() {
		return value;
	}
	
	public static void displayTree(Composite tree, String prefix, boolean isLast) {
        System.out.print(prefix);
        System.out.print(isLast ? "-- " : "|-- ");
        System.out.println(tree.getValue());

        List<Composite> children = tree.getChildren();
        for (int i = 0; i < children.size() - 1; i++) {
            displayTree(children.get(i), prefix + (isLast ? "    " : "|   "), false);
        }
        if (!children.isEmpty()) {
            displayTree(children.get(children.size() - 1), prefix + (isLast ? "    " : "|   "), true);
        }
    }

}
