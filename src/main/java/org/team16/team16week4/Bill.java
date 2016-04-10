package org.team16.team16week4;

public class Bill {
	private Plan plan;
	private User userObject;
	private DetailedCost detailedCostObject;
	private PrintExpectedBill printExpectedBill;
	
	public Bill(String planName, int usedMinutes, int numberOfLines){
		initBill(planName, usedMinutes, numberOfLines);
	}
	
	public DetailedCost getDetailedCostObject()
	{
		return this.detailedCostObject;
	}
	public User getUserObject()
	{
		return this.userObject;
	}
	
	private void initBill(String planName, int usedMinutes, int numberOfLines)
	{
		if("Gold".equals(planName))
			plan = new Gold();
		else
			plan = new Silver();
		
		this.userObject = new User(plan, numberOfLines, usedMinutes);
		this.detailedCostObject = new DetailedCost(userObject);
		this.printExpectedBill = new PrintExpectedBill(this.detailedCostObject);
	}

	public String drawBill(){
		return "TotalCost : " 
					+ this.printExpectedBill.printTotalCostEvaluation()+ "\n"+"AdditionalCost : " 
					+ this.printExpectedBill.printAdditionalLineCostEvaluation()+"\n"+"OverExcessMinutesCost : "
					+ this.printExpectedBill.printOverExcessMinutesCostEvaluation() + "\n";
	}
}
