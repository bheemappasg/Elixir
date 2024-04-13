package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage
{
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerOption;
	
	@FindBy(xpath=" //input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDescriptionTbx;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompanyTx;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomer;
	 
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newprojectoptions;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class = 'projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement enterprojectnameTbx;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement selectprojectDD;
	 
	@FindBy(xpath="//div[text()='Galaxy Corporation'and @class='itemRow cpItemRow selected']")
	private WebElement galaxyTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement enterProjDescriptionTbx;
	
	@FindBy(xpath="//div[text()='Create Project' and @class='components_button_label']")
	private WebElement  createprojactBtn;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}
	public WebElement getEnterCustNameTbx() {
		return enterCustNameTbx;
	}
	public WebElement getEnterCustDescriptionTbx() {
		return enterCustDescriptionTbx;
	}
	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}
	public WebElement getBigBangCompanyTx() {
		return bigBangCompanyTx;
	}
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	public WebElement getActualCustomer() {
		return actualCustomer;
	}
	// NEW PROJECT MODULE 
	public WebElement getNewprojectoptions() 
	{
		return newprojectoptions;
	
     }
	public WebElement getEnterprojectname() 
	{
		return enterprojectnameTbx;
	}
	public WebElement getSelectProjectDD() 
	{
		return selectprojectDD;
	}
	public WebElement getGalxy() 
	{
		return  galaxyTbx;
	}
	public WebElement getEnterProjDescription() 
	{
		return enterProjDescriptionTbx; 
	}
	public WebElement getCreateprojact() 
	{
		return createprojactBtn;
	}}
