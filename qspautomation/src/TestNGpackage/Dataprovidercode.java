package TestNGpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovidercode {
	WebDriver driver;
	@Test(dataProvider= "dataprovider1")
	public void testactitimelogin(String invalidusername,String invalidpassword)
	{
		driver.findElement(By.name("username")).sendKeys(invalidusername);
		driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
		driver.findElement(By.id("loginButton")).click();
	}
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-2oeh57s/login.do");
	}
	@AfterMethod
	public void Aftermethod()
	{
		driver.quit();
	}
	
	@DataProvider
	public Object[][] dataprovider1()
	{
		Object[][]data =new Object[5][2];
		 
		data[0][0]="admin";
		data[0][1]="manager123";
		
		data[1][0]="manager";
		data[1][1]="manager123";
		
		data[2][0]="ad13";
		data[2][1]="manager123";
		
		data[3][0]="admin#123";
		data[3][1]="manager123";
		
		data[4][0]="manager1@133";
		data[4][1]="manager123";
		
		return data;
	
		
		
		
	}

}
