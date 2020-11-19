package oca;

public class oca {

	public static void main(String args[]){

	int c = 0;

	A: for(int i = 0; i < 2; i++){ 
//		0,1
	B: for(int j = 0; j < 2; j++){
//		0 1 
	C: for(int k = 0; k < 3; k++){ 
	
		c++;
//	i	0     1 
//	j	0     
//	k	0 1 2
//		c = 0, 1,2,3,4,5
	if(k>j) break; }
	} }
	System.out.println(c); 
}
}
