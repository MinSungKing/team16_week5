package org.team16.team16week5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

	private User goldUser;
	private User silverUser;
	private Gold gold;
	private Silver silver;
	
	@Before
	public void setupGoldUser(){
		gold = new Gold();
		goldUser = new User(gold, 4, 878);
	}
	
	@Before
	public void setupSilverUser(){
		silver = new Silver();
		silverUser = new User(silver, 5, 521);
	}
	
	@Test
	public void testGoldUserPlan(){
		assertEquals(gold, goldUser.getUserPlan());
	}
	
	@Test
	public void testGoldUserLines(){
		assertEquals(4, goldUser.getNumberOfLines());
	}
	
	@Test
	public void testGoldUserUsedMinutes(){
		assertEquals(878, goldUser.getUsedMinutes());
	}
	
	@Test
	public void testGoldUserFamilyDiscout(){
		assertEquals(false, goldUser.getFamilyDiscount());
	}
	
	@Test
	public void testSilverUserPlan(){
		assertEquals(silver, silverUser.getUserPlan());
	}
	
	@Test
	public void testSilverUserLines(){
		assertEquals(5, silverUser.getNumberOfLines());
	}
	
	@Test
	public void testSilverUserUsedMinutes(){
		assertEquals(521, silverUser.getUsedMinutes());
	}
	
	@Test
	public void testSilverUserFamilyDiscout(){
		assertEquals(true, silverUser.getFamilyDiscount());
	}
}
