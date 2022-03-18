package com.sgtesting.tests;

public class ExecuteAutoITscriptDemo {

	public static void main(String[] args) {
		executeDemo();
	}
	private static void executeDemo()
	{
		try 
		{
			String path="C:\\ExampleAutomation\\AUTOIT\\Displayoutputmessage.exe";
			Runtime.getRuntime().exec(path);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
