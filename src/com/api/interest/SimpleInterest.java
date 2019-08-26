package com.api.interest;

public class SimpleInterest {
	public void calculateSimpleInterest(double principle, double rate,double time )
	{
		double si= principle*rate*time/100;
		System.out.println("Simple interest is "+si);
	}
}
