package com.actitime.testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrackPage;
@Listeners(com.actitime.generic.Listenerimplementation.class)
public class CustomerModule extends BaseClass
{
	@Test
  public void testCreateCustomer() throws InterruptedException
  {
		Reporter.log("create customer",true);
		Thread.sleep(3000);
		//Assert.fail();
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.setTaskTab(); 
		Thread.sleep(3000);  
  }
  
}
