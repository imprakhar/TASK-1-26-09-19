package com.api.interest;

public class Test {

	public static void main(String[] args) {
		SimpleInterest si =new SimpleInterest();
		si.calculateSimpleInterest(5000, 5, 2);
		CompoundInterest ci=new CompoundInterest();
		ci.calculateCompoundInterest(10000, 9, 2);
	}

}
