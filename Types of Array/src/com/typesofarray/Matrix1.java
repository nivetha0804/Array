package com.typesofarray;

public class Matrix1 
{
	public static void main(String[] args)
	{
		//array declaration
		int matrix[][] = new int[2][3];//array object creation

		//array initialization

		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;

		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;

		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n\n\n");
		}
	}
}
