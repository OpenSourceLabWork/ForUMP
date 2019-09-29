package org.ForUMP;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
//	public static 
	public static double[][] run(){
		double multidim[][]= new double[5][5];
        String fileName = "cost.txt";
        String line = null;

        try {
            FileReader fileReader = 
                new FileReader(fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            int i=0;
            while((line = bufferedReader.readLine()) != null) {
            	
                //System.out.println(line);
            	String rawLine[] = line.split(",") ;
//               for(int i=0; i<5; i++){
            	
                	for(int j=0; j<rawLine.length; j++){
                		multidim[i][j]= Double.parseDouble(rawLine[j]);
                	}
                	i++;
                }
//            }
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");
        }
        return multidim;
	}
	public static void print(double[][] multi_dim){
		for(int i=0; i<multi_dim.length; i++){
        	for(int j=0; j<multi_dim[i].length; j++){
        		System.out.print(multi_dim[i][j]+" : ");
        	}
        	System.out.println();
        }
	}
    public static void main( String[] args )
    {
    	double[][] multiArray  = run();
        System.out.println("Printing 2D Array");
        print(multiArray);
    }
    public static void t_case(int x_index, int y_index){
    	
    }
}
