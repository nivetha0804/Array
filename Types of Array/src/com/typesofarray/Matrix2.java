package com.typesofarray;

public class Matrix2 
{
	public static void main(String[] args)
	{
		//array declaration
		int matrix[][] = new int[3][2];//array object creation

		//array initialization		
		matrix[0][0] = 1;
		matrix[0][1] = 2;

		matrix[1][0] = 3;
		matrix[1][1] = 4;

		matrix[2][0] = 5;
		matrix[2][1] = 6;
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n\n\n");
		}
	}
}
