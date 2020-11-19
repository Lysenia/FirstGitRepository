package arrays;

public class PizzaArray {
	
	public static void main (String args[]) {
		
		int pizzaBite[][] = new int [7][3];
		

		
//		pizzaBite[0][0] = 0;
//		pizzaBite[0][1] = 01;
//		pizzaBite[0][2] = 11;
//		
//		pizzaBite[1][1] = 11;
//		pizzaBite[1][2] = 12;
//		pizzaBite[1][0] = 10;
//		
//		pizzaBite[2][0] = 20;
//		pizzaBite[2][1] = 21;
//		pizzaBite[2][2] = 22;
//		
//		pizzaBite[3][0] = 30;
//		pizzaBite[3][1] = 31;
//		pizzaBite[3][2] = 32;
//		
//		
//		pizzaBite[4][0] = 40;
//		pizzaBite[4][1] = 41;
//		pizzaBite[4][2] = 42;
//		
//		pizzaBite[5][0] = 50;
//		pizzaBite[5][1] = 51;
//		pizzaBite[5][2] = 52;
//		
//		pizzaBite[6][0] = 60;
//		pizzaBite[6][1] = 61;
//		pizzaBite[6][2] = 60;
		
for(int i=0; i<pizzaBite.length; i++)
{
System.out.print("Slice <"+i+">:<");
for(int j=0;j<pizzaBite[i].length; j++)
{
System.out.print(" bite "+(j+1)+",");
}
System.out.println(">");
           
            
//            for(int[] eachSlice: pizzaBite) {
//            	for(int eachBite: eachSlice) {
//            	System.out.println(eachBite);
            }
        }
	}

	

