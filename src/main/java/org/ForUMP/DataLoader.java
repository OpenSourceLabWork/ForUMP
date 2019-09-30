package org.ForUMP;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataLoader {

	public static double[][] loadFile(String filepath) {
		double multidim[][] = new double[5][5];
		String line = null;

		try {
			FileReader fileReader = new FileReader(filepath);

			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int i = 0;
			while ((line = bufferedReader.readLine()) != null) {

				// System.out.println(line);
				String rawLine[] = line.split(",");
				// for(int i=0; i<5; i++){

				for (int j = 0; j < rawLine.length; j++) {
					multidim[i][j] = Double.parseDouble(rawLine[j]);
				}
				i++;
			}
			// }
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + filepath + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + filepath + "'");
		}
		return multidim;
	}
	
	public static void print(double[][] multi_dim){
		System.out.println("The orignal loaded data from file....");
		for(int i=0; i<multi_dim.length; i++){
        	for(int j=0; j<multi_dim[i].length; j++){
        		System.out.print(multi_dim[i][j]+" : ");
        	}
        	System.out.println();
        }
		System.out.println("___________________________________________________________");
		
	}
}
