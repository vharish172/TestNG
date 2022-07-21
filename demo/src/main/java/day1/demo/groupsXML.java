package day1.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class groupsXML {
	
	WebDriver driver;
	
	/*@BeforeSuite
	public void example()
	{
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void example1()
	{
		System.out.println("After suite");
	}
	
	*/
	
	@BeforeMethod
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver = new ChromeDriver();  //open my browser
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	}
	
	@Test(groups="group2")
	public void zbookingtickets()
	{
		System.out.println("testcase 1");
	}
	
	@Test(groups="group1")
	public void checkingPNRStatus()
	{
		System.out.println("testcase 3");
	}
	
	@Test
	public void checkingPNRStatus1()
	{
		System.out.println("testcase 4");
	}
	
	@Test
	public void checkingPNRStatus2()
	{
		System.out.println("testcase 2");
	}
	
	
	
	@AfterMethod
	public void after()
	{
		//driver.quit();
	}

}
