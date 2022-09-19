package com.cg.application;

import com.cg.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
    
	//Constructor
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
     
	//ToString Method
	@Override
	public String toString() {
		return String.format("MMCurrentAcc []");
	}
	
	
	

}
