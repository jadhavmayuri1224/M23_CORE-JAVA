package com.tns.multithreading;
class Test extends Thread
{
	public void run() {
		System.out.println(" thread  passed");
	}

	public void printTable(int i) {
		// TODO Auto-generated method stub
		
	}
}

public class Main {

	public static void main(String[] args) {
		Test create =new Test();
		create.start();
		//create.start();

	}

}
