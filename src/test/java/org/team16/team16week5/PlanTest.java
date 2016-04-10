package org.team16.team16week5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PlanTest {
	private Plan planGold;
	private Plan planSilver;
	
	@Before
	public void setUp(){
		planGold = new Gold();
		planSilver = new Silver();
	}
	
	@Test
	public void testGoldName(){
		assertEquals("Gold",planGold.getPlanName());
	}
	
	@Test
	public void testGoldBasicMonthlyRate(){
		assertEquals(49.95,planGold.getBasicMonthlyRate(),0.01);
	}
	
	@Test
	public void testGoldIncludeMinutes(){
		assertEquals(1000,planGold.getIncludeMinutes());
	}
	
	@Test
	public void testGoldRatePerExcessMinute(){
		assertEquals(0.45,planGold.getRatePerExcessMinute(),0.01);
	}
	
	@Test
	public void testGoldAdditionalLineRate(){
		assertEquals(14.50,planGold.getAdditionalLineRate(),0.01);
	}
	
	@Test
	public void testGoldFamilyDiscountFee(){
		assertEquals(5.00,planGold.getFamilyDiscountFee(),0.01);
	}

	@Test
	public void testSilverName(){
		assertEquals("Silver",planSilver.getPlanName());
	}
	
	@Test
	public void testSilverBasicMonthlyRate(){
		assertEquals(29.95,planSilver.getBasicMonthlyRate(),0.01);
	}
	
	@Test
	public void testSilverIncludeMinutes(){
		assertEquals(500,planSilver.getIncludeMinutes());
	}
	
	@Test
	public void testSilverRatePerExcessMinute(){
		assertEquals(0.54,planSilver.getRatePerExcessMinute(),0.01);
	}
	
	@Test
	public void testSilverAdditionalLineRate(){
		assertEquals(21.50,planSilver.getAdditionalLineRate(),0.01);
	}
	
	@Test
	public void testSilverFamilyDiscountFee(){
		assertEquals(5.00,planSilver.getFamilyDiscountFee(),0.01);
	}
}
