package Robotclass;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotasg1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.cleartrip.com");
		Thread.sleep(10000);
		WebElement target=driver.findElement(By.xpath("//h2[@class='fs-6 px-4 c-neAtral-400 fw-400"));
		Actions act= new Actions(driver);
		for(int i = 0;i<=2;i++)
		{
			act.clickAndHold(target).perform();
		}
		Thread.sleep(3000);
	    Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		
		driver.navigate().to("https://www.googlr.com");
		driver.findElement(By.name("q")).click();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		driver.findElement(By.name("btnk")).click();
		
		
		
		
		
		
		

	}

}
