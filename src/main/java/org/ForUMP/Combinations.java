package org.ForUMP;

import java.nio.file.attribute.UserPrincipalLookupService;

class Combinations { 
	  
    /* arr[]  ---> Input Array 
    data[] ---> Temporary array to store current combination 
    start & end ---> Staring and Ending indexes in arr[] 
    index  ---> Current index in data[] 
    r ---> Size of a combination to be printed */
    static void combinationUtil(int arr[], int data[], int start, 
                                int end, int index, int r) 
    { 
        // Current combination is ready to be printed, print it 
        if (index == r) 
        { 
            for (int j=0; j<r; j++) 
                System.out.print(data[j]+" "); 
            System.out.println(""); 
            return; 
        } 
  
        // replace index with all possible elements. The condition 
        // "end-i+1 >= r-index" makes sure that including one element 
        // at index will make a combination with remaining elements 
        // at remaining positions 
        for (int i=start; i<=end && end-i+1 >= r-index; i++) 
        { 
            data[index] = arr[i]; 
            combinationUtil(arr, data, i+1, end, index+1, r); 
        } 
    } 
  
    // The main function that prints all combinations of size r 
    // in arr[] of size n. This function mainly uses combinationUtil() 
    static void printCombination(int arr[], int n, int r) 
    { 
        // A temporary array to store all combination one by one 
        int data[]=new int[r]; 
  
        // Print all combination using temprary array 'data[]' 
        combinationUtil(arr, data, 0, n-1, 0, r); 
    } 
    
    // two point of user choice. This function convert user input point to an array
    static int[] userInputs(int x, int y){
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
  
    
    public static void main (String[] args) { 
    	
        int arr[] = userInputs(0, 4); // later on, it will inputs from user using scanner function
        int r = 2; 
        int n = arr.length; 
        printCombination(arr, n, r); 
    	
    	
    	
    } 
} 