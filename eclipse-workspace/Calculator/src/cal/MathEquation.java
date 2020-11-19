package cal;

public class MathEquation {
	
	private double leftVal; 
	private double rightVal;
	private char opCode;
	private double result;
	
	public double getLeftVal() {
		return leftVal;
	}
	
	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}
	
	public double getRightVal() {
		return rightVal;
	}
	
	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}
	
	public char getOpCode () {
		return opCode;
	}

	public void setOpCode(char opCode) {
		this.opCode = opCode;
	}
	
	public double getResult() {
		return result;
	}
	
	public MathEquation(char opCode){
		this.opCode = opCode;
	}
	
	public MathEquation(char opCode,double leftVal,double rightVal) {
//		this(opcode);
		this.opCode = opCode;
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		
	}
	
	public void execute() {
		
		switch (opCode){
		case 'a':
			this.result = leftVal + rightVal;
			break;
		case 's':
			this.result = leftVal - rightVal;
			break;
		case 'm':
			this.result = leftVal *rightVal;
			break;
		case 'd':
			this.result = leftVal/rightVal;
			break;
		default:
			this.result =0;
		}
		
//		if (opCode == 'a') {
//		result = leftVal + rightVal; 
//		}
//		else if (opCode == 'c') {
//			result = leftVal  - rightVal;
//		}
//		else if (opCode == 'm') {
//			result = leftVal * rightVal;
//		}
//		else if (opCode == 'd') {
//			result = leftVal/rightVal;
//		}
//		else {
//			
//			result =0;
			
		}
			

	}

