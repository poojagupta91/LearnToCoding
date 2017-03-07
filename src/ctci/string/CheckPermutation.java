package ctci.string;

import java.util.Arrays;

/**
 * Cracking Coding Interview 
 * 
 * 1.2 Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.  
 * 
 * Approach : 1. Sort the strings and compare 
 * 			  2. Check if two strings have same character count
 * 
 * Assumptions : 1. 128 ASCII code
 * 	
 * @author POOJA
 *
 */

public class CheckPermutation {

	public static boolean checkPermutation(String s,String p){
		if(s.isEmpty() || p.isEmpty() || s.length() != p.length())
			return false;
		
		if(!Arrays.equals(charCount(s),charCount(p)))
			return false;
		
		return true;
	}
	
	public static int[] charCount(String s){
		int[] charArray = new int[128];
		
		for(int i=0;i<s.length();i++){
			int val = s.charAt(i);
			charArray[val]++;
		}
		
		return charArray;
	}
	
	public static void main(String[] args) {
		
		System.out.println(checkPermutation("dog","god"));

	}
	
}
