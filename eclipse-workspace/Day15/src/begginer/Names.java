package begginer;

import java.util.Scanner;

public class Names {
	public static void main(String[] args) {
		String name[];
		name = new String[4];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 4 names:");

		for (int i = 0; i < name.length;i++)	{
			name[i] = sc.nextLine(); 
		}
//name[1] = sc.nextLine(); 
//name[2] = sc.nextLine(); 
//name[3] = sc.nextLine(); 
		
for (int i = 0; i < 4;i++) { 
			System.out.println("First character" + " " +  (i +1) + " "+ "is" + "\t" + name[i].substring(0, 1) + "\t");
			System.out.println("First character" + " " +  (i +1) + " "+ "is" + "\t" + name[i].charAt(0) + "\t");
}		
}
		
}
