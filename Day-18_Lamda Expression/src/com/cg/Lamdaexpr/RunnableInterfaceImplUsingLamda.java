package com.cg.Lamdaexpr;

public class RunnableInterfaceImplUsingLamda {

	public static void main(String[] args)
	{
		/*
		// Runnable Interface
		Runnable R1=new Runnable()
				{
			      public void run()
			      {
			    	  System.out.println("Runnable interface Implementation");
			      }
				};
				*/
		Runnable R1=()-> {
			System.out.println("Runnable interface Implementation");
		};
			@SuppressWarnings("unused")
			Thread t=new Thread(R1);
			//t.start();//when we will start it will come into run method as discussed in life cycle
				

	}

}
