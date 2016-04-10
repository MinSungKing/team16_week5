package org.team16.team16week4;

public class Plan {
	protected String planName;
	protected double basicMonthlyRate;
	protected int includeMinutes;
	protected double ratePerExcessMinute;
	protected double additionalLineRate;
	protected double familyDiscountFee;
	
	public String getPlanName() {
		return this.planName;
	}

	public double getBasicMonthlyRate() {
		return this.basicMonthlyRate;
	}

	public int getIncludeMinutes() {
		return this.includeMinutes;
	}

	public double getRatePerExcessMinute() {
		return this.ratePerExcessMinute;
	}

	public double getAdditionalLineRate() {
		return this.additionalLineRate;
	}
	
	public double getFamilyDiscountFee(){
		return this.familyDiscountFee;
	}
}