package launchbrowser;



import org.openqa.selenium.chrome.ChromeDriver;



public class launchchrome {



	public static void main(String[] args) {

		

		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		new ChromeDriver();

	}

}