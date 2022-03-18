package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {
	private static WebDriver oBrowser=null;

	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
	}
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","C:\\ExampleAutomation\\Automation\\web-Automation\\library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
