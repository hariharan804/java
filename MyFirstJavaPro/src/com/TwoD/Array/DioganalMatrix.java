package com.TwoD.Array;

public class DioganalMatrix {

	public static void main(String[] args) {
	
		int b[][] = new int [3][3];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (i==j){
					b[i][j]=1;
				}
				System.out.print(b[i][j]+"  ");
			}
			System.out.println(); 
				
			}
			
	}

}
