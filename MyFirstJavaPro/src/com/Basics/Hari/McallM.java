package com.Basics.Hari;

import java.util.concurrent.SynchronousQueue;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class McallM {
	
	void m()
	{
	
	System.out.println("jdhd");
	 n();
	}
	void n()
	{
		System.out.println("aaaa");
		m();
	}
	
	
	public static void main(String[] args) {
		
		McallM obj= new McallM();
		obj.m();
    
	}

}
