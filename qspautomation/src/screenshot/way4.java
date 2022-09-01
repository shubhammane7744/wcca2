package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

@SuppressWarnings("deprecation")
public class way4 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://www.selenium.dev/");

		EventFiringWebDriver efw = new EventFiringWebDriver(driver);

		File src = efw.getScreenshotAs(OutputType.FILE);

		File dest = new File("./screenshot/screenshot4.jpg");

		Files.copy(src, dest);

	}		
		
	}

