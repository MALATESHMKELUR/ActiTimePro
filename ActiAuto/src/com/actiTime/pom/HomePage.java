package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(id="logoutLink")
	private WebElement lgout;
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement taskContn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setLogout() 
	{
		lgout.click();
	}
	
	public void setContainerTasks()
	{
		taskContn.click();
	}

}
