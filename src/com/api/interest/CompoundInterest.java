
package com.api.interest;

public class CompoundInterest {
public void calculateCompoundInterest(double principle,double rate,double time)
{
	rate=(1+rate/100);
	rate=Math.pow(rate, time);
	double amount=principle*rate;
	double ci=amount-principle;
	System.out.println("Compound Interest is "+ci);
}
}
