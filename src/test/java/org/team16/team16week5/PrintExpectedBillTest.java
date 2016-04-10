package org.team16.team16week5;
import static org.junit.Assert.*;
import org.junit.Test;

public class PrintExpectedBillTest {
	private PrintExpectedBill printExpectedBill;
	private DetailedCost detailedCost;
	private User user;
	private Gold gold = new Gold();
	private Silver silver = new Silver();
	
	@Test
	public void testNoAdditionalCost(){
		this.user = new User(silver,1,490);
		detailedCost = new DetailedCost(this.user);
		printExpectedBill = new PrintExpectedBill(this.detailedCost);
		
        assertEquals("29.95" , ""+this.printExpectedBill.printTotalCostEvaluation());
        assertEquals(null , this.printExpectedBill.printOverExcessMinutesCostEvaluation());
        assertEquals(null , this.printExpectedBill.printAdditionalLineCostEvaluation());
	}
	
	@Test
	public void testOverExcessMinutes(){
		this.user = new User(gold,1,1123);
		detailedCost = new DetailedCost(this.user);
		printExpectedBill = new PrintExpectedBill(this.detailedCost);
		
        assertEquals("49.95 + (123*0.45) = 105.30" , ""+this.printExpectedBill.printTotalCostEvaluation());
        assertEquals(" + (123*0.45)" , this.printExpectedBill.printOverExcessMinutesCostEvaluation());
        assertEquals(null , this.printExpectedBill.printAdditionalLineCostEvaluation());
	}
	
	@Test
	public void testHaveFamilyDiscountThreeAdditionalLine(){
		this.user = new User(silver,4,459);
		detailedCost = new DetailedCost(this.user);
		printExpectedBill = new PrintExpectedBill(this.detailedCost);
		
        assertEquals("29.95 + (2*21.5) + 5.0 = 77.95" , ""+this.printExpectedBill.printTotalCostEvaluation());
        assertEquals(null , this.printExpectedBill.printOverExcessMinutesCostEvaluation());
        assertEquals(" + (2*21.5) + 5.0" , this.printExpectedBill.printAdditionalLineCostEvaluation());
	}
	
	@Test
	public void testHaveFamilyDiscountOverThreeAdditionalLine(){
		this.user = new User(gold,5,981);
		detailedCost = new DetailedCost(this.user);
		printExpectedBill = new PrintExpectedBill(this.detailedCost);
		
        assertEquals("49.95 + (2*14.5) + (2*5.0) = 88.95" , ""+this.printExpectedBill.printTotalCostEvaluation());
        assertEquals(null , this.printExpectedBill.printOverExcessMinutesCostEvaluation());
        assertEquals(" + (2*14.5) + (2*5.0)" , this.printExpectedBill.printAdditionalLineCostEvaluation());
	}
	
	@Test
	public void testNoFamilyDiscountOneAdditionalLine(){
		this.user = new User(silver,2,354);
		detailedCost = new DetailedCost(this.user);
		printExpectedBill = new PrintExpectedBill(this.detailedCost);
		
        assertEquals("29.95 + 21.5 = 51.45" , ""+this.printExpectedBill.printTotalCostEvaluation());
        assertEquals(null , this.printExpectedBill.printOverExcessMinutesCostEvaluation());
        assertEquals(" + 21.5" , this.printExpectedBill.printAdditionalLineCostEvaluation());
	}
	
	@Test
	public void testNoFamilyDiscountTwoAdditionalLine(){
		this.user = new User(gold,3,885);
		detailedCost = new DetailedCost(this.user);
		printExpectedBill = new PrintExpectedBill(this.detailedCost);
		
        assertEquals("49.95 + (2*14.5) = 78.95" , ""+this.printExpectedBill.printTotalCostEvaluation());
        assertEquals(null , this.printExpectedBill.printOverExcessMinutesCostEvaluation());
        assertEquals(" + (2*14.5)" , this.printExpectedBill.printAdditionalLineCostEvaluation());
	}
}
