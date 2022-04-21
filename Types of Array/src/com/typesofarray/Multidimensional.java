package com.typesofarray;

public class Multidimensional 
{
	public static void main(String[] args)
	{
		//multidimensional array
		
		//multidimensional array in one line(array declaration and initialization)
		
		int matrix[][] = {{11,12}, {21,22}};
		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n\n\n");
		}
		
	}

}
