package org.team16.team16week4;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class DetailedCostTest extends TestCase{

	public DetailedCostTest(String testName)
	{
		super(testName);
	}
    public static Test suite()
    {
        return new TestSuite( DetailedCostTest.class );
    }
    public void testApp()
    {
    	String gold = "Gold";
    	String silver = "Silver";
        Bill testBill = new Bill(gold, 878, 4);
        assertEquals(2*14.50 + 5.00, testBill.getDetailedCostObject().getAdditionalLineCost(), 0.01);
        assertEquals(0 ,testBill.getDetailedCostObject().getOverExcessMinutesCost(), 0.01);
        assertEquals(83.95,testBill.getDetailedCostObject().getTotalCost(),0.01);
        testBill.drawBill();
        testBill = new Bill(gold, 1123, 1);
        assertEquals(0, testBill.getDetailedCostObject().getAdditionalLineCost(), 0.01);
        assertEquals(123*0.45 ,testBill.getDetailedCostObject().getOverExcessMinutesCost(), 0.01);
        assertEquals(105.3,testBill.getDetailedCostObject().getTotalCost(),0.01);
        testBill.drawBill();
        testBill = new Bill(gold, 1123, 4);
        assertEquals((2*14.50) + 5.00, testBill.getDetailedCostObject().getAdditionalLineCost(), 0.01);
        assertEquals(123*0.45 ,testBill.getDetailedCostObject().getOverExcessMinutesCost(), 0.01);
        assertEquals(139.3,testBill.getDetailedCostObject().getTotalCost(),0.01);
        testBill.drawBill();
        testBill = new Bill(silver, 523, 2);
        assertEquals(21.50, testBill.getDetailedCostObject().getAdditionalLineCost(), 0.01);
        assertEquals(23*0.54 ,testBill.getDetailedCostObject().getOverExcessMinutesCost(), 0.01);
        assertEquals(63.87,testBill.getDetailedCostObject().getTotalCost(),0.01);
        testBill.drawBill();
        testBill = new Bill(silver, 44, 5);
        assertEquals((2*21.50) + (2*5.00), testBill.getDetailedCostObject().getAdditionalLineCost(), 0.01);
        assertEquals(0 ,testBill.getDetailedCostObject().getOverExcessMinutesCost(), 0.01);
        assertEquals(82.95,testBill.getDetailedCostObject().getTotalCost(),0.01);
        testBill.drawBill();
        testBill = new Bill(silver, 521, 5);
        assertEquals((2*21.50)+(2*5.00), testBill.getDetailedCostObject().getAdditionalLineCost(), 0.01);
        assertEquals(21*0.54 ,testBill.getDetailedCostObject().getOverExcessMinutesCost(), 0.01);
        assertEquals(94.29,testBill.getDetailedCostObject().getTotalCost(),0.01);
        testBill.drawBill();
    }
}
