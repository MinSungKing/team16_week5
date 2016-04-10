package org.team16.team16week5;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppControllerTest {

	private static AppController appController = new AppController();
	
	private void initAppController(String inputString)
	{
		appController.changeInputData(inputString);
	}
	
	@Test
	public void testAppControllerPassCase1()
	{
		initAppController("1 Silver 500 2 2");
		assertEquals(true, appController.run());
	}
	@Test
	public void testAppControllerPassCase2()
	{
		initAppController("1 Gold 812 1 2");
		assertEquals(true, appController.run());
	}
	@Test
	public void testAppControllerPassCase3()
	{
		initAppController("1 Silver 500 2 1 Gold 1000 2 2");
		assertEquals(true, appController.run());
	}
	@Test
	public void testAppControllerPassCase4()
	{
		initAppController("1 Gold 1123 4 2");
		assertEquals(true, appController.run());
	}
	@Test
	public void testAppControllerPassCase5()
	{
		initAppController("1 Silver 1123 3 2");
		assertEquals(true, appController.run());
	}
	@Test
	public void testAppControllerFailCase1()
	{
		initAppController("3");
		assertEquals(false, appController.run());
	}
	@Test
	public void testAppControllerFailCase2()
	{
		initAppController("1 Gold -10 2");
		assertEquals(false, appController.run());
	}
	@Test
	public void testAppControllerFailCase3()
	{
		initAppController("1 Gold 1123 -1");
		assertEquals(false, appController.run());
	}
	@Test
	public void testAppControllerFailCase4()
	{
		initAppController("1 Gold 512 0");
		assertEquals(false, appController.run());
	}
	@Test
	public void testAppControllerFailCase5()
	{
		initAppController("1 Gold 0 5");
		assertEquals(false, appController.run());
	}
	@Test
	public void testAppControllerFailCase6()
	{
		initAppController("1 Gold1234 1 0");
		assertEquals(false, appController.run());
	}
}
