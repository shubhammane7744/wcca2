package keyworddrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestvalidActitime extends  BaseTest
{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		Flib flib= new Flib();
		flib.readPropertFile(PROP_PATH, "username");
		flib.readPropertFile(PROP_PATH, "Password");
        driver.findElement(By.name("username")).sendKeys("username");
        driver.findElement(By.name("pwd")).sendKeys("password");
        Thread.sleep(10000);
        
        driver.findElement(By.id("loginbutton")).click();
        bt.closeBrowser();
        
	}

}
