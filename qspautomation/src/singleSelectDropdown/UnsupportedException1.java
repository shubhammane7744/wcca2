package singleSelectDropdown;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class UnsupportedException1 {



	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/QSP/Desktop/wcsa2htmldocs/singleselectdropdown.html");

		

		Thread.sleep(3000);

		WebElement ssdropdown = driver.findElement(By.id("menu"));

		Select sel = new Select(ssdropdown);

		sel.selectByVisibleText("misal");

		sel.deselectAll();

		



	}



}