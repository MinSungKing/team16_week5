package org.team16.team16week5;

import org.team16.team16week5.Bill;

import static org.junit.Assert.*;

import org.junit.Test;

public class DetailedCostTest{
	public static final String gold = "Gold";
	public static final String silver = "Silver";
	private Bill bill;
	
	private void setBillInfo(String type, int minute, int line)
	{
		this.bill = new Bill(type, minute, line);
	}
	
	private double getAdditionalLineCost()
	{
		return bill.getDetailedCostObject().getAdditionalLineCost();
	}
	private double getOverExcessMinutesCost()
	{
		return bill.getDetailedCostObject().getOverExcessMinutesCost();
	}
	private double getTotalCost()
	{
		return bill.getDetailedCostObject().getTotalCost();
	}
	
	@Test
	public void testGoldBillCase1()
	{
		setBillInfo(gold, 878, 4);
        assertEquals(2*14.50 + 5.00, getAdditionalLineCost(), 0.01);
        assertEquals(0 , getOverExcessMinutesCost(), 0.01);
        assertEquals(83.95, getTotalCost(),0.01);
	}
	@Test
	public void testGoldBillCase2()
	{
		setBillInfo(gold, 1123, 1);
        assertEquals(0, getAdditionalLineCost(), 0.01);
        assertEquals(123*0.45 , getOverExcessMinutesCost(), 0.01);
        assertEquals(105.3, getTotalCost(),0.01);
	}
	@Test
	public void testGoldBillCase3()
	{
		setBillInfo(gold, 1123, 4);
        assertEquals((2*14.50) + 5.00, getAdditionalLineCost(), 0.01);
        assertEquals(123*0.45 , getOverExcessMinutesCost(), 0.01);
        assertEquals(139.3, getTotalCost(), 0.01);
	}
	@Test
	public void testSilverBillCase1()
	{
		setBillInfo(silver, 523, 2);
        assertEquals(21.50, getAdditionalLineCost(), 0.01);
        assertEquals(23*0.54 , getOverExcessMinutesCost(), 0.01);
        assertEquals(63.87, getTotalCost(),0.01);
	}
	@Test
	public void testSilverBillCase2()
	{
		setBillInfo(silver, 44, 5);
        assertEquals((2*21.50) + (2*5.00), getAdditionalLineCost(), 0.01);
        assertEquals(0 , getOverExcessMinutesCost(), 0.01);
        assertEquals(82.95, getTotalCost(),0.01);
	}
	@Test
	public void testSilverBillCase3()
	{
		setBillInfo(silver, 521, 5);
        assertEquals((2*21.50) + (2*5.00), getAdditionalLineCost(), 0.01);
        assertEquals(21*0.54, getOverExcessMinutesCost(), 0.01);
        assertEquals(94.29, getTotalCost(),0.01);
	}
}
