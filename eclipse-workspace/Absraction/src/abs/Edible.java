package abs;

public interface Edible {

	void eat();
	
	default void drink() {
		
	}
}
