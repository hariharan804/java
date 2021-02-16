package com.TwoD.Array;

public class FiveFiveMatrix {

	public static void main(String[] args) {
		int b[][] = new int [5][5];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (i!=j){
					b[i][j]=1;
				} 
				if (j==4 || j==0 || i==0 || i==4 ){
					b[i][j]=1;
					//b[i]=1;
				}
				else{
					b[i][j]=0;
					
				}
				
		/*		b[00][j]=1;
				b[i][00]=1;
				b[i][04]=1;
				b[04][j]=1; */
				
				
				
				System.out.print(b[i][j]+"  ");
			}
			System.out.println(); 
				
			}

	}

}
