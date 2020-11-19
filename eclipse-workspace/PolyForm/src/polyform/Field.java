package polyform;

public class Field {
	
	private String label = "unerdefined";
	private Object value = "";
	private Object defaultValue =  "unerdefined";
	
	int labelDisplayLength = 20;
	int valueDisplayLength =30;
	
	static String nOf(String str, int nTimes) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<nTimes; i++) {
			sb.append(str);
		}
		return sb.toString();
	}
	
	Field(String label){
		this.label=label;
	}
	
	void setValue(String label) {
		this.label=label;
	}

	void setdafaultValue(String label) {
		this.defaultValue=defaultValue;
	}
	
	String getType() {
		return "Field";
	}
	
	String getLabel() {
		return label;
	}
	
	String getDefaultValue() {
		return defaultValue.toString() ;
	}
	
	
	String getValue() {
		String strValue = value.toString();
		if(strValue.equals("")) 
			return getDefaultValue();
		else {
			return strValue;
		}
	}

	
	String getFieldDefinition() {
		return getType() + "[" + "label=" + getLabel() + ", default_value=" + getDefaultValue() + ", value= "
				+ getValue() + "]";
	}
	
	String displayLabel() {
		return getLabel() + Field.nOf(" ", labelDisplayLength - getLabel().length()) + ":";
	}

	String displayValue() {
		return getValue();
	}
	
	boolean isValid() {
		return false;
	}
}

