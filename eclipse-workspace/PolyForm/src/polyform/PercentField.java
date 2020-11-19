package polyform;

public class PercentField extends NumberField {
	
	PercentField(String label) {
		super(label);
	}
	
	String getType() {
		return "PercentField";
	}

	String getValue() {
		return super.getValue() + "%";
	}

	boolean isValid() {
		return super.isValid() && getNumberValue() <= 100;
	}
}
