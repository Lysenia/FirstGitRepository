package go;

public class Test86 {
	
	int ns;
	static int s;
	
	Test86(int ns){
		if(s<ns) {
			s=ns;
			this.ns=ns;
		}
	}
	void doPrint() {
		System.out.println("ns =" + ns + " s="+ s);
	}

}


