package day1.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test
public class elearning {
	
	WebDriver driver;
	
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver = new ChromeDriver();  //open my browser
		driver.get("http://elearningm1.upskills.in/index.php"); 
		
		driver.findElement(By.linkText("Sign up!")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harish"); //input[@name='lastname']
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Veeraragavan");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("harish172@gmail.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("harish172");
		driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys("harish172v@");
		driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys("harish172v@");
		driver.findElement(By.xpath("//em[@class='fa fa-plus']")).click(); //Register
		
		driver.findElement(By.linkText("Homepage")).click();
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("harish172");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("harish172v@");
		driver.findElement(By.xpath("//button[@name='submitAuth']")).click(); //next 
		driver.findElement(By.xpath("//*[@id=\"profileCollapse\"]/div/ul/li[2]/a")).click(); //input[@autocomplete='off']
	   
		
	
	}
	
	/*@Test()
	public void ClickLink()
	{
		driver.findElement(By.linkText("Sign up!")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harish");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Veeraragavan");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("harish172@gmail.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("harish172");
		driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys("harish172v@");
		driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys("harish172v@");
		driver.findElement(By.xpath("//em[@class='fa fa-plus']")).click();
	}*/
	
	/*@Test()
	public void register() 
	{
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harish");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Veeraragavan");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("harish172@gmail.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("harish172");
		driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys("harish172v@");
		driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys("harish172v@");
		driver.findElement(By.xpath("//em[@class='fa fa-plus']")).click(); //Register
		
	}
	
	@Test
	public void signon()
	{
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("harish172");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("harish172v@");
		driver.findElement(By.xpath("//input[@type='submit']")).click();		
	}*/

}
