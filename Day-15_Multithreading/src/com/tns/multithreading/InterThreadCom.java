package com.tns.multithreading;
class Thread3 extends Thread
{
	public void run()
	{
		System.out.println("Thread interruption");
	}
}

public class InterThreadCom {

	public static void main(String[] args) {
		Thread3 t=new Thread3();
		t.start();
		System.out.println("is Thread interrupted"+t.isInterrupted());
		t.interrupt();
		System.out.println("is Thread interrupted"+t.isInterrupted());

	}

}
