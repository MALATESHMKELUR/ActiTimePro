package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage
{
   @FindBy(xpath="//div[text()='Add New']")
   private WebElement addbtn;
   
   @FindBy(xpath="//div[@class='item createNewCustomer']")
   private WebElement newCust;
   
   @FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
   private WebElement custName;
   
   @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
   private WebElement custDescrpbx;
   
   @FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
   private WebElement selectCustDD;
   
   @FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='Our company']")
   private WebElement ourCmpDD;
   
   @FindBy(xpath="//div[text()='Create Customer']")
   private WebElement createCustBtn;
   
   @FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
   private WebElement verifyCust;

public TaskListPage(WebDriver driver) 
 {
	 PageFactory.initElements(driver, this);
}


public WebElement getAddbtn() {
	return addbtn;
}

public WebElement getNewCust() {
	return newCust;
}

public WebElement getCustName() {
	return custName;
}

public WebElement getCustDescrpbx() {
	return custDescrpbx;
}

public WebElement getSelectCustDD() {
	return selectCustDD;
}

public WebElement getOurCmpDD() {
	return ourCmpDD;
}

public WebElement getCreateCustBtn() {
	return createCustBtn;
}

public WebElement getVerifyCust() {
	return verifyCust;
}
   
   

}

