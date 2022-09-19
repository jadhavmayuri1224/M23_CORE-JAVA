package com.cg.application;

import com.cg.framework.SavingAcc;

public class MMSavingAcc extends  SavingAcc{
   
	//Constructor
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}
	//ToString Method

	@Override
	public String toString() {
		return String.format("MMSavingAcc []");
	}
	

}
