package edu.escuelaing.arsw.app;

import java.util.Scanner;

public class Hackerrank {
	static char[] wordOrd;
	public static String sort(String myStr) {
		
		if(myStr == null || myStr.length() == 0 || myStr.length() == 1){
	        return null;
	    }
	    int length = myStr.length();
	    int low =0,high = length -1;
	    wordOrd = myStr.toCharArray(); 

	    quickSort(low,high);
	    return new String(wordOrd);
		
	}

	public static char[] quickSort(int low, int high){
	
	    int i = low;
	    int j = high;
	    char tmp;
	
	    int pivot = (low+high)/2;
	
	    while (i <= j) {
	        while(wordOrd[i] < wordOrd[pivot]){
	            i++;
	        }
	        while(wordOrd[j] > wordOrd[pivot]){
	            j--;
	        }
	
	        if(i <= j) {
	            tmp = wordOrd[i];
	            wordOrd[i] = wordOrd[j];
	            wordOrd[j] = tmp;
	            i++;
	            j--;
	        }
	    }
	
	    if(low < j){
	        quickSort(low, j);
	    }
	    if(i < high){
	        quickSort(i,high);
	    }
	    return wordOrd;
	}
	public static boolean isAnagram(String word1, String word2) {
		word1 = sort(word1.toLowerCase());
		word2 = sort(word2.toLowerCase());
		if(word1.equals(word2))return true;
	
		return false;
	}
    public static void main( String[] args ) {	
    	Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
