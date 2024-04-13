package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage
{
   @FindBy(id="logoutLink")
   private WebElement logout;          //decaration
    
   @FindBy(xpath="//div[text()='Tasks']")   
   private WebElement tasksTab;
   
   public EnterTimeTrackPage(WebDriver driver) 
   {
	   PageFactory.initElements(driver, this);       //intialisation
   }
   public void setLogout()
   {
	   logout.click();                                 //utilisation
   }
   public void setTaskTab()
   {
	   tasksTab.click();
   }
}
