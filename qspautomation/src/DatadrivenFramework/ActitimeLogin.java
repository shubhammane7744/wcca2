package DatadrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("http://desktop-2oeh57s/login.do");
        Flib flib=new Flib();
        String username =flib.readExceldata("./data/TestDataAct.xlsx","validcred",1,0);
        String password=flib.readExceldata("./data/TestDataAct.xlsx","validcred",1,1);
        driver.findElement(By.name("username")).sendKeys(username);

		driver.findElement(By.name("pwd")).sendKeys(password);



		driver.findElement(By.id("loginButton")).click();


        
        
        
        

}
}
