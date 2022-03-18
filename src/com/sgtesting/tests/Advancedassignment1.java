package com.sgtesting.tests;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advancedassignment1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		createUser2();
		createUser3();
		logout();
		loginAsUser1();
		logoutUser1();
		loginAsUser2();
		logoutUser2();
		loginAsUser3();
		logoutUser3();
		loginAsAdmin();
		modifypwdForUser1();
		modifypwdForUser2();
		modifypwdForUser3();
		logoutAsAdmin();
		loginAsUser1WithModifiedpwd();
		logoutUser1AfterModifingpwd();
		loginAsUser2WithModifiedpwd();
		logoutUser2AfterModifingpwd();
		loginAsUser3WithModifiedpwd();
		logoutUser3AfterModifingpwd();
		loginAs1Admin();
		deleteUser1();
		deleteUser2();
		deleteUser3();
		logoutAs1Admin();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\web-Automation\\library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
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
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("DemoUser1");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("U1");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demouser1@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("welcome1");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("welcome1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("DemoUser2");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("U2");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userdatalightbox_emailfield")).sendKeys("demouser2@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("welcome2");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("welcome2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("DemoUser3");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("U3");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userdatalightbox_emailfield")).sendKeys("demouser3@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User3");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("welcome3");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("welcome3");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
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
	private static void loginAsUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutUser1()
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
	private static void loginAsUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome2");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutUser2()
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
	private static void loginAsUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome3");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutUser3()
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
	private static void loginAsAdmin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifypwdForUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("welcome1new");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("welcome1new");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifypwdForUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("welcome2new");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("welcome2new");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifypwdForUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("welcome3new");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("welcome3new");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAsAdmin()
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
	private static void loginAsUser1WithModifiedpwd()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome1new");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutUser1AfterModifingpwd()
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
	private static void loginAsUser2WithModifiedpwd()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome2new");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutUser2AfterModifingpwd()
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
	private static void loginAsUser3WithModifiedpwd()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome3new");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutUser3AfterModifingpwd()
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
	private static void loginAs1Admin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
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
	private static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
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
	private static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
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
	private static void logoutAs1Admin()
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
	private static void closeApplication()
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
