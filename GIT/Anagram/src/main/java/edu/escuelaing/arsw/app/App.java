package edu.escuelaing.arsw.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 *
 */
public class App 
{	
	public static boolean anagram(String word1, String word2) {
		ArrayList<String> str1 = new ArrayList<>();
		ArrayList<String> str2 = new ArrayList<>();
		
		for (int i=0; i< word1.length();i++) {
			str1.add(Character.toString( word1.toLowerCase().charAt(i)));
			str2.add(Character.toString( word2.toLowerCase().charAt(i)));
		}
		Collections.sort(str1);
		Collections.sort(str2);
		if(str1.equals(str2))return true;
	
		return false;
	}
    public static void main( String[] args ) {	
    	String word1 = "";
    	String word2 = "";
    	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
    	try {
    		word1 = br.readLine();
    		word2 = br.readLine();
    		if (word1.length() != word2.length()) {
    			System.out.println("Not Anagrams");
    		}
    		else{
    			if(anagram(word1,word2) == true)  System.out.println("Anagram"); else System.out.println("Not Anagrams"); 
    		}
    		
    		
    	}catch(Exception e) {
    		
    	}
    }
}
