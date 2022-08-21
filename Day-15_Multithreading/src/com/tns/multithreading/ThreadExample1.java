package com.tns.multithreading;
//start method and run method
public class ThreadExample1 extends Thread
{
	public void run()
	{
		System.out.println("Thread is going to run");
	}

	public static void main(String[] args) {
		ThreadExample1 e=new ThreadExample1();
		e.start();
		e.run();
		

	}

}
