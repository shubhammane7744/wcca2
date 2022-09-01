package multiselectDropdown;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class DeselectByIndexMethod {



	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/QSP/Desktop/wcsa2htmldocs/multiselectdropdown.html");

		WebElement multiselectdd = driver.findElement(By.id("menu"));

		Select sel = new Select(multiselectdd);

		

		sel.selectByValue("v3");

		Thread.sleep(2000);

		sel.deselectByIndex(2);

		



	}



}