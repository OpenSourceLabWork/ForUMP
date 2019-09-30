package org.ForUMP;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	double[][] data = DataLoader.loadFile("cost.txt");
		DataLoader.print(data);
		double t_case = T_Case.calcute_Tcase(0, 4, data);
		
		System.out.println("The Final t_case value is : "+t_case);
    } 
}
