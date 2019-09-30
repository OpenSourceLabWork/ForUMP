package org.ForUMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {

	private static void helper(List<int[]> combinations, int data[], int start, int end, int index) {
	    if (index == data.length) {
	        int[] combination = data.clone();
	        combinations.add(combination);
	    } else if (start <= end) {
	        data[index] = start;
	        helper(combinations, data, start + 1, end, index + 1);
	        helper(combinations, data, start + 1, end, index);
	    }
	}
	
	public static List<int[]> generate(int n, int r) {
	    List<int[]> combinations = new ArrayList<>();
	    helper(combinations, new int[r], 0, n-1, 0);
	    return combinations;
	}
	
	// two point of user choice. This function convert user input point to an array
   public static int[] userInputs(int x, int y){
    	int userInput[]= new int[y+1];
    	for(int i=0; i<=y; i++){
    		if(i == 0){
    			userInput[i] = x;
    		}else{
    			userInput[i] = x+i;
    		}
    	}
    	return userInput;
    }
	

	public static void main(String args[]) {
		
		int arr[] = userInputs(2, 4); // later on, it will inputs from user using scanner function
        int r = 2; 
        int n = arr.length; 
		
		
		List<int[]> combinations = generate(n, r);
		
		for (int[] combination : combinations) {
		    System.out.println(Arrays.toString(combination));
		}
		System.out.printf("generated %d combinations of %d items from %d ", combinations.size(), r, n);

		
	}
}
