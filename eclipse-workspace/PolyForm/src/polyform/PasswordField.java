package polyform;

public class PasswordField extends TextField {
	  PasswordField(String label) {
		    super(label);
		  }
		  
		  String getType() {
		    return "PasswordField";
		  }
		  
		  String getValue() {
			  if(super.getValue().equals(getDefaultValue())) {
				  return super.getValue();
			  }
			  else
				  return Field.nOf("*", getValue().length());
		  }
		  
		  boolean isValid() {
				return super.getValue().contains("!") || super.getValue().contains("$");
			}
		
		  
		}
