package org.ForUMP;

import java.util.Arrays;
import java.util.List;

public class T_Case {

	public static double calcute_Tcase(int x, int y, double[][] matrix){
		
		double output = 0;
		
		int userRange[] = Combination.userInputs(x, y);
		
		System.out.println("User input range : ");
		System.out.println(Arrays.toString(userRange));
		System.out.println("________________________________________________");
		
		List<int[]> combinations = Combination.generate(userRange.length, 2);
		
		for(int[] pair : combinations){
			output += (matrix[0][pair[0]] - matrix[0][pair[1]]);
		}
		return output;
	}
}
