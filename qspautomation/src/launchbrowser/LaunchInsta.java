package launchbrowser;


import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchInsta {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver .manage().window().maximize();
		driver.get("https://www.instagram.com");

	}

}
