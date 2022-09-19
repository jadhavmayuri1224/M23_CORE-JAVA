package com.cg.framework;

public abstract class SavingAcc extends BankAcc
{
	private boolean isSalaried;
	static final private float MINBAL=500;
	
	//constructor
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
//to string
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s]", isSalaried);
	}
	public void withdraw(float Withdraw)
	{
		if(accBal<MINBAL)
		{
			System.out.println("Account Balance Minimum Limit "+MINBAL);
		}
		else
		{
			System.out.println("Account no"+this.getAccNo()+" Account name "+this.getAccNm()+" Account Balance "+(accBal-Withdraw));
	}}
	
	
}
	
	
	
	
	
	


