package bs;

public class PhoneNumberManagement {

	private long phoneNumber;
	private String name;
	
	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public PhoneNumberManagement(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public PhoneNumberManagement(long phoneNumber, String name ) {
		this.phoneNumber = phoneNumber;
		this.name = name;
	}
	
	public String transformPhoneNumber(){
		String str = phoneNumber +""; 
		
		return str.substring(0, 3) + "-" + str.substring(3, 6) + "-" + str.substring(6);
	}
	
}
