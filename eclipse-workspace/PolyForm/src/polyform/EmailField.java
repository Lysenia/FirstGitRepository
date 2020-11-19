package polyform;

public class EmailField extends Field {
	
	EmailField(String label) {
    super(label);
  }
  
  String getType() {
    return "EmailField";
  }
  
  boolean isValid() {
		return getValue().contains("@") && getValue().contains(".");
	}
}

