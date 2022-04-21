package com.typesofarray;

public class Singledimensional 
{
	public static void main(String[] args)
	{
		//single dimensional array
		//single dimensional array in multiple lines(array declaration and initialization)
		//array declaration
		
		int employeeIds[] = new int[5];//array object creation	
		
		//array initialization		
		employeeIds[0] = 101;
		employeeIds[1] = 102;
		employeeIds[2] = 103;
		employeeIds[3] = 104;
		employeeIds[4] = 105;
		for(int id: employeeIds)
		{
			System.out.println(id);
		}
	}
}
