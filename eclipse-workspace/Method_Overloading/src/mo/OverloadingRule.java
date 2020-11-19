package mo;

public class OverloadingRule {
	public static void main(String args[]) {
		add(10,12);

}

public static void add(int i, int j) {	
}
public static void add( long i, long j) {	
}

public static void add( Integer i, Integer j) {	
}

public static void add( Long i, Long j) {	
}
}