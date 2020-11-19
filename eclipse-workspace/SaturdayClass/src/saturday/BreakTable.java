package saturday;

public class BreakTable {
	public static void main(String[] args) {
		for (int row = 1;row<=5; row++) {
			if (row==3) {
				break;
			}
		for (int column = 1;column<=3; column++) {
			if((column ==1) && (row==2)){
				System.out.print("\t\t");
				continue;
}
			System.out.print("Cell(" +row + "," + column + ")\t");
}
System.out.println();
}
	}
}


