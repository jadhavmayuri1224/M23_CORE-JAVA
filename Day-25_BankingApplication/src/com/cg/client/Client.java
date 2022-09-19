package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(101, "Mayuri Jadhav", 2000, true);
		CurrentAcc c=new MMCurrentAcc(102, "Ravina Jadhav", 9000, 7000);
		
		System.out.println("Saving Account: ");
		s.withdraw(1000);
		
		System.out.println("Current Account: ");
		c.withdraw(1000);
		
		
		

	}

}
