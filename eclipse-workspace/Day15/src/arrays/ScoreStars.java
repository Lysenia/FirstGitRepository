package arrays;

public class ScoreStars {
	public static void main (String args[]) {
		char teams [] = new char[] {'A','B','C'};
		int teamA = 5;
		int teamB = 8;
		int teamC = 1;
		
		for(char team: teams) {
			int scores=0;
			if(team == 'A'){
			scores = teamA;
			System.out.print("A ");
			}
			else if (team == 'B') {
				scores = teamB;
				System.out.print("B ");
			}
			else if (team == 'C') {
				scores = teamC;
				System.out.print("C ");
			}
			for(int stars=1; stars<=scores; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
}
}
