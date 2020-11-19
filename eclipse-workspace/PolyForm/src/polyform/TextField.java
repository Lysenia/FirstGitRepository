package polyform;

public class TextField extends Field{
	
		  TextField(String label) {
		    super(label);
		  }
		  
		  String getType() {
		    return "TextField";
		  }
		  
		  String displayLabel() {
				return getLabel() + Field.nOf(" ", labelDisplayLength - getLabel().length()) + ":";
			}
		  
		  boolean isValid() {
				return getValue().length()<=valueDisplayLength;
			}

		}


