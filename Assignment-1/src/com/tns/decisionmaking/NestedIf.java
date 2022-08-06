package com.tns.decisionmaking;

public class NestedIf {

	public static void main(String[] args) {
  int age=15;
  int weight=55;
  if(age>=12)
  {
	  if(weight>=40)
	  {
		  if(weight<=110)
		  {
		     System.out.println("Eligible to bunjee jumoing");	  
		  }
		  else
		  {
			  System.out.println("extra ropes will be added");
		  }
      }
	  else
	  {
		  System.out.println("Not eligible for bunjee jumping");
	  }
  }

	}

}
