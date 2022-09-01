package keyworddrivenframework;
import java.io.IOException;
import org.openqa.selenium.By;

public class TestInvaliddataActitime  extends BaseTest{



	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();

		bt.openBrowser();


		Flib flib = new Flib();

		int rc = flib.getRowCount(EXCEL_PATH,"invalidcreds");



		for(int i=1;i<=rc;i++)

		{

			String username = flib.readExcelData(EXCEL_PATH,"invalidcreds",i,0);



			String password = flib.readExcelData(EXCEL_PATH,"invalidcreds",i,1);



			System.out.println(i);

			driver.findElement(By.name("username")).sendKeys(username);

			driver.findElement(By.name("pwd")).sendKeys(password);



			driver.findElement(By.id("loginButton")).click();

			Thread.sleep(4000);

			driver.findElement(By.name("username")).clear();

		}

		bt.closeBrowser();
}

}


 