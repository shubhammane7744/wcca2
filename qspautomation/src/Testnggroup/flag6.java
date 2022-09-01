package Testnggroup;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag6{
  @Test(groups="functional")
  public void ft1() {
	  Reporter.log("FUNCTIONAL TESTCASE",true);
  }
  @Test(groups="integration")
  public void It1() {
	  Reporter.log("integration TESTCASE",true);
  }
  @Test(groups="SMOKE")
  public void St1() {
	  Reporter.log("SMOKE TESTCASE",true);
  }
  
  @Test(groups="functional")
  public void ft2() {
	  Reporter.log("FUNCTIONAL TESTCASE2",true);
  }
  @Test(groups="integration")
  public void It2() {
	  Reporter.log("integration TESTCASE2",true);
  }
  @Test(groups="SMOKE")
  public void St2() {
	  Reporter.log("SMOKE TESTCASE2",true);
  } 
  @Test(groups="functional")
  public void ft3() {
	  Reporter.log("FUNCTIONAL TESTCASE3",true);
  }
  @Test(groups="integration")
  public void It3() {
	  Reporter.log("integration TESTCASE3",true);
  }
  @Test(groups="SMOKE")
  public void St3() {
	  Reporter.log("SMOKE TESTCASE3",true);
  }
}
