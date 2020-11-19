package polyform;

public class PhoneField extends NumberField{
	
	Object getZeroValue() {
		return 1111111111L;
	}
	
	PhoneField(String label) {
		super(label);
	}
	
	String getType() {
		return "PhoneField";
	}

	String getValue() {
		String pNo = super.getValue();
		return pNo.substring(0, 3) + "-" + pNo.substring(3, 6) + "-" + pNo.substring(6);
	}

	boolean isValid() {
		return super.isValid() && getValue().length() == 12;
	}
}