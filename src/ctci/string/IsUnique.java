package ctci.string;
/**
 * Cracking Coding Interview 
 * 
 * 1.1 Is Unique : Implement an algorithm to determine if a string has all unique characters. What if you
 *	               cannot use additional data structures?  
 * 
 * Approach : 1. Boolean array  { O(c) time & O(1) space }
 * 			  2. Bit vector { O(n) time & O(1) space }
 * 			  3. Compare each character with rest {O(n^2) time }
 * 			  4. Sort and compare { O(n log n) time & space depending on sort algo }
 * 
 * Assumptions : 1. 128 ASCII values only
 * 	
 * @author POOJA
 *
 */

public class IsUnique {

	public static boolean isUnique(String str){
		
		boolean[] boolArray =  new boolean[128];
		
		if(str.length() > 128 || str.isEmpty())
			return false;
		
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i);
			if(boolArray[val])
				return false;
			boolArray[val] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isUnique("abcdefABCDEF"));
	}
}
