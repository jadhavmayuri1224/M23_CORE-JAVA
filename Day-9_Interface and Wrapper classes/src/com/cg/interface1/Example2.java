package com.cg.interface1;

public interface Example2 {

	void display();
	void print();
}

	class Main1 implements Example2
	{
		public void display() 
		 {
			 System.out.println(" Hi Mayuri");
		 }
		public void print()
		{
			System.out.println(" Hi Ravina");
		}
		 public static void main(String args[])
		 {
			 Main1 m=new Main1();
			 m.display();
			 m.print();
			
		}
}
