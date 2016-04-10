package org.team16.team16week4;

public class User {
	private Plan plan;
	private int numberOfLines;
	private int usedMinutes;
	private boolean familyDiscount;
	
	public User(Plan plan, int lines, int minutes)
	{
		this.plan = plan;
		this.numberOfLines = lines;
		this.usedMinutes = minutes;
		if(this.numberOfLines > 3)
			this.familyDiscount = true;
		else
			this.familyDiscount = false;
	}
	
	public Plan getUserPlan()
	{
		return this.plan;
	}
	public int getNumberOfLines()
	{
		return this.numberOfLines;
	}
	public int getUsedMinutes()
	{
		return this.usedMinutes;
	}
	public boolean getFamilyDiscount()
	{
		return this.familyDiscount;
	}
	
}
