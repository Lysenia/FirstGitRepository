package begginer;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String line = scan.nextLine() + "-";
char[] letters = line.toCharArray();	//convert the string into a char array
		

int s = 0;
int t = 0; 
int i = 0;

for (i = 0; i < letters.length; i++) {
	while(i<letters.length && letters[i] == '-')
		i++;
}
s=i;

while (i<letters.length && letters[i] != '-') {
t = i-1;
}

while(s<t) {
	char temp = letters[s];
	letters[s] = letters[t];
	letters[t] = temp;
	s++;
	t--;

continue;
	}

		/**
		 * Do NOT change the following code
		 */

for(char c:letters) {
System.out.print(c);
		}

}
}


