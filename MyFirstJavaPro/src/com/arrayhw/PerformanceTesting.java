package com.arrayhw;

public class PerformanceTesting {

	public static void main(String[] args) {
		 long sec=0l;
		long starttime =System.currentTimeMillis();
		 
		for (int i=1; i<=10000; i++)
		{
			System.out.println(i);
		}
		
		long endtime = System.currentTimeMillis();
		 sec=(endtime-starttime)/1000;
		//sec=sec/1000;
		System.out.println(sec+" sec  or "+(endtime-starttime)+" ms ");
	}

}
