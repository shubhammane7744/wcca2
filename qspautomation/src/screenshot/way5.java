package screenshot;



import java.io.File;

import java.io.IOException;

import java.time.Duration;



import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;




import com.google.common.io.Files;



public class way5 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

	

		TakesScreenshot ts = (TakesScreenshot)driver;

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://www.selenium.dev/");

		

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("./screenshot/screenshot5.jpg");

		Files.copy(src, dest);

	}
}