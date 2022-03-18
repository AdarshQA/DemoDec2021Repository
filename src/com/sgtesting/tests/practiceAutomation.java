package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class practiceAutomation {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		createUser();
		modifyuser();
		deleteUser();
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
		
		public static void createUser() 
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("admin");
				oBrowser.findElement(By.name("lastName")).sendKeys("user2");
				oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("admin@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("admin2");
				oBrowser.findElement(By.name("password")).sendKeys("demo123");
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("demo123");
				oBrowser.findElement(By.className("buttonTitle")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void modifyuser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Useradmin");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deleteUser() {
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_usernameField\"]")).click();
				oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
