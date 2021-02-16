package com.MyDoubts;

public class SingleRotation {

	public static void main(String[] args) {
		
		int  a[]={1,2,3,4,5};
	int rot = 0;
		
		for (int i=0; i>=3; i++){
			rot = a.length-1;
			//System.out.print(a[i]);
			for (int j=0; j<a.length; j--){
			a[j]=a[j-1];
			}
		//	a[0]=rot;
		}
for(int i=0; i<a.length; i++){
	System.out.print(a[i]);
}
	}

}
