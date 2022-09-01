package TestNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
@Test(description="this test is used to perform a valid login")
public void validActitimetest()
{
	Reporter.log("valid login is performed",true);
}

@Test(description="This test is used to perform a invalid login")
public void invalidactitimetest()
{
	Reporter.log("valid login is performed",true);
	
}
}
