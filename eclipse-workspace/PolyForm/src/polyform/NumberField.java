package polyform;

public class NumberField extends Field {
	
	Object getZeroValue() {
		return 0;
	}
	
	NumberField(String label) {
		super(label);
	}
	
	String getType() {
		return "NumberField";
	}

	String displayValue() {
		return Field.nOf("_", valueDisplayLength - getValue().length()) + getValue();
	}

	boolean isValid() {
		return getNumberValue() >= 0;
	}

	long getNumberValue() {
		return Long.parseLong(super.getValue());
	}
}
