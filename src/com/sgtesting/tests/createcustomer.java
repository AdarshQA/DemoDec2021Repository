package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createcustomer {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		createCustomer();
		modifyCustomer();
		deleteCustomer();
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

		private static void createCustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_nameField\"]")).sendKeys("Continental Automotives");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_descriptionField\"]")).sendKeys("Continental Automotives is a german based automobile maker./n It has stong footprint across more than 60 counties in the world");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deleteCustomer()
		{
			try
			{			
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
				Thread.sleep(4000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void modifyCustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[1]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea\r\n")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea\r\n")).clear();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea\r\n")).sendKeys("Continental Automotives is a german based automobile maker \n It has stong footprint across more than 60 counties in the world \n Coninenta automotives is the second largest autoparts manufacturer in Europe. and continental is the offciail sponsers for FIFA 2020;");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
