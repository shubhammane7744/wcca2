package multiselectDropdown;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class SelectByIndex1 {

	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/QSP/Desktop/wcsa2htmldocs/multiselectdropdown.html");

		WebElement multiselectdd = driver.findElement(By.id("menu"));

		Select sel = new Select(multiselectdd);

	

		for(int i=4;i<=8;i++)

		{

			sel.selectByIndex(i);

			Thread.sleep(1000);

		}

		

	}



}


 