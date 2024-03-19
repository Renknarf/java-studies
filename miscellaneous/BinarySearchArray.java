// Program using Arrays.binarySearch()

import java.util.Arrays;

public class BinarySearchArray {
	
	public static void main(String args[]) {
		char vowels[] = {'a', 'e', 'i', 'o', 'u'};
		
		char key = 'u';
		
		int foundItemIndex = Arrays.binarySearch(vowels, key);
		
		System.out.println("The given vowel is at index: " + foundItemIndex);		
	}
}
