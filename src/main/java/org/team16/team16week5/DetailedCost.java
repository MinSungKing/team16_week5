package org.team16.team16week5;

public class DetailedCost {

	private double additionalLineCost;
	private double overExcessMinutesCost;
	private double totalCost;
	private User userData;
	
	public DetailedCost(User userData){
		this.userData = userData;
		this.calculateAdditionalLineCost();
		this.calculateOverExcessMinutesCost();
		this.calculateTotalCost();
	}
	
	public User getUserData(){
		return this.userData;
	}
	
	public double getTotalCost(){
		return this.totalCost;
	}
	
	public double getOverExcessMinutesCost(){
		return this.overExcessMinutesCost;
	}
	
	public double getAdditionalLineCost(){
		return this.additionalLineCost;
	}
	
	private void calculateAdditionalLineCost(){
		if(this.userData.getNumberOfLines() == 1 || this.userData.getNumberOfLines()==2 ){
			this.additionalLineCost =  (this.userData.getNumberOfLines()-1)*this.userData.getUserPlan().getAdditionalLineRate();
		}
		else if(this.userData.getNumberOfLines() > 2){
			this.additionalLineCost =  2*this.userData.getUserPlan().getAdditionalLineRate() + (this.userData.getNumberOfLines()-3)*5;
		}
	}
	
	private void calculateOverExcessMinutesCost(){
		if(this.userData.getUsedMinutes() < this.userData.getUserPlan().getIncludeMinutes()){
			this.overExcessMinutesCost = 0;
		}
		else{
			this.overExcessMinutesCost = (this.userData.getUsedMinutes() - this.userData.getUserPlan().getIncludeMinutes())*this.userData.getUserPlan().getRatePerExcessMinute();
		}
	}
	
	private void calculateTotalCost(){
		this.totalCost = this.userData.getUserPlan().getBasicMonthlyRate() + this.overExcessMinutesCost + this.additionalLineCost;
	}
}
