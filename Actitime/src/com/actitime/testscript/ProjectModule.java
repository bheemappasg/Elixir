package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

public class ProjectModule extends BaseClass 
{
	@Test
	public void testCreateProject() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("createproject",true);
	FileLib f=new FileLib();
	String projectName = f.getExcelData("createproject", 4, 5);
	String ProjectDescription = f.getExcelData("createproject", 4, 6);
       EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
       e.setTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewprojectoptions().click();
	t.getEnterprojectname().sendKeys(projectName);
	t.getSelectProjectDD().click();
	t.getGalxy().click();
	t.getEnterProjDescription().sendKeys(ProjectDescription );
	t.getCreateprojact().click();
	Thread.sleep(5000);
	String actualCustomerText = t.getActualCustomer().getText();                               
	Assert.assertEquals(actualCustomerText,  projectName);
}
}
