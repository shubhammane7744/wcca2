package Locators;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class TagnameLocator {



	public static void main(String[] args) {

		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/QSP/Desktop/wcsa2htmldocs/usernametextbox.html");



		//how to user tagname locator

		driver.findElement(By.tagName("input")).sendKeys("admin");

		

	}



}