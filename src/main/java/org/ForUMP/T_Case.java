package org.ForUMP;

import java.util.List;

public class T_Case {

	public double calcute_Tcase(int x, int y, int[][] matrix){
		
		double output = 0;
		
		int userRange[] = Combination.userInputs(x, y);
		List<int[]> combinations = Combination.generate(userRange.length, 2);
		
		for(int[] pair : combinations){
			output += (matrix[0][pair[0]] - matrix[0][pair[1]]);
		}
		return output;
	}
}
