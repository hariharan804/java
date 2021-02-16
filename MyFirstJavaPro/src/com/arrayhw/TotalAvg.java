package com.arrayhw;

public class TotalAvg {

	public static void main(String[] args) {
		
		//Find Odd Element Total & Avg
		
		int ar[] ={5,10,8,3,7,13,10};
		
		int count =0;
		int total =0;
		
		for (int i=0; i<ar.length; i++){
			if(ar[i]%2!=0){
				total=total+ar[i];
				count =count+1;
			}
		}
System.out.println(total);
System.out.println(total/count);
	}

}
