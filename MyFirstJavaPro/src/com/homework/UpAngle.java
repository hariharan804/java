package com.homework;

public class UpAngle {

	public static void main(String[] args) {
		/*for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {

				if (i == 1 || j ==9 || i ==2 || j == i  || j == 1)

				{
					System.out.print("  * ");
				} else {
					System.out.print("  ");

				}
			}
			System.out.println();

		} */
		
		for (int i=1; i<=5; i++)
			
		{
			for (int j=1; j<=5; j++)
				
			{
				if (i==1 || j==1)
				{
					System.out.print(" *");
				}
				
				if (i==2 && j== 4)
				{
					System.out.print("     *");
				}
				if (i==3 && j==3)
				{
					System.out.print("   *");
				}
				if (i==4 && j==3)
				{
					System.out.print(" *");
				}
				
			}
			System.out.println("");
		}
		
	}
}