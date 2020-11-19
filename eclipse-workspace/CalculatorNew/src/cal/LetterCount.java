package cal;

import java.util.ArrayList;

public class LetterCount {

public static void main(String[] args) {

	ArrayList<String> wordList = new ArrayList<String>();
	wordList.add("lalalabababmamama");
	
	String str = wordList.toString();
	  int[] aux = new int[256];
	
	for (int i = 0; i < str.length(); i++) {
        aux[str.charAt(i)]++;
	
//	ArrayList<Integer> letterFreq = new ArrayList<Integer>();
		

//	char [] arr = wordList.toString().toCharArray();
//	
//	int count =0;
//        for(int i=0; i<arr.length; i++) {
//        	count =0;
//			for(int j=0; j<arr.length;j++) {
//				if(j<i && arr[i]==arr[j]) {
//					break;
//				}
//				if(arr[j]==arr[i]) {
//		
//			count++;	
//			}
//	if(j==arr.length-1) {
//		System.out.println(arr[i]+" " + count);
		
	}
		System.out.println();

        }
		
       
}
