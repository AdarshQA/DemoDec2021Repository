package com.sgtesting.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class creatanddeleteproject {
	public static WebDriver oBrowser = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		logout();
		closeapplication();

	}

	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\web-Automation\\library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
		oBrowser.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	 }
	
	  public static void minimizeflyoutwindow()
	  {
		 try
		 {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		 }catch(Exception e)
		 {
			e.printStackTrace();
		 }
		}
	  
		public static void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public static void closeapplication()
		{
			try
			{
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

}
