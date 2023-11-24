package design_pattern.singleton;

public class Singleton {
	private final static Singleton unique = new Singleton();
	
	private Singleton() {
		//eventually something
	}

	public static Singleton getUnique() {
		return Singleton.unique;
	}
	
	@Override
	public String toString() {
		return "HashCode: " + Integer.toHexString(Singleton.unique.hashCode());
	}
}
