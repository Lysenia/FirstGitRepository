package abs;

public  class Tesla extends Vehicle implements Autonomous{

	@Override
	public void selfDrive() {
		System.out.println("Tesla is in auto pilot mode");
	}

	@Override
	public void driveIt() {
		System.out.println("Tesla is being driven by Code");
		
	}
	

}
