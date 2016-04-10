package org.team16.team16week5;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppController {
	private static final Logger logger = Logger.getLogger(Bill.class.getName());
	private FileHandler fileHandler;
	private Scanner sc;
	
	public AppController()
	{
		addFileHandler(logger);
	}
	public void changeInputData(String inputData)
	{
		if(inputData == null)
			sc = new Scanner(System.in);
		else
			sc = new Scanner(inputData);
	}
	public boolean run()
	{
		while(true)
		{
			logger.log(Level.INFO, "\n======================Bill System======================\n1-> "
				+ "Get Result\n2-> Exit");
				
			int choose = sc.nextInt();
				
			if(choose == 1)
			{
				if(getInputUserData() == false)
					return false;
			}
			else if(choose == 2)
			{
				logger.log(Level.INFO, "======================End Program======================");	
				return true;
			}
			else
			{
				logger.log(Level.INFO, "\nERROR!!\nWrong menu choosed\n\n");
				return false;
			}
		}
	}
	
	private boolean getInputUserData()
	{
		logger.log(Level.INFO, "Type a sequence. Gold or Silver, Usage of minutes, Usage of lines (ex : Gold 900 1)");
		String planType = sc.next();
		int usedMinutes = sc.nextInt();
		int numberOfLines = sc.nextInt();
		
		if(isValidTypeName(planType) && isValidMinutes(usedMinutes) && isValidLines(numberOfLines))
		{
			Bill newBill = new Bill(planType, usedMinutes, numberOfLines);
			logger.log(Level.INFO, "\n======================RESULT======================\nPlan : " + planType 
				+ "\nTotal Usage Time : " + usedMinutes + "\nUsing Lines : " 
				+ numberOfLines + "\n\n" + newBill.drawBill() + "==================================================\n");
			return true;
		}
		else
			return false;
	}
	private boolean isValidTypeName(String planType)
	{
		if( !("Gold".equals(planType) || "Silver".equals(planType)))
		{
			logger.log(Level.INFO, "\nERROR!!\nType must be Gold or Silver\n\n");
			return false;
		}
		return true;
	}
	private boolean isValidMinutes(int usedMinutes)
	{
		if (usedMinutes <= 0)
		{
			logger.log(Level.INFO, "\nERROR!!\nNegative number or Zero cannot be used for minutes\n\n");
			return false;
		}
		return true;
	}
	private boolean isValidLines(int numberOfLines)
	{
		if (numberOfLines <= 0)	
		{
			logger.log(Level.INFO, "\nERROR!!\nNegative number or Zero cannot be used for line number\n\n");
			return false;
		}
		return true;
	}
	private void addFileHandler(Logger logger)
	{
		try
		{
			fileHandler = new FileHandler(Bill.class.getName() + ".log");
		}
		catch(IOException ioe)
		{
			logger.log(Level.SEVERE, null, ioe);
		}
		catch(SecurityException sece)
		{
			logger.log(Level.SEVERE, null, sece);
		}
		logger.addHandler(fileHandler);
	}
}
