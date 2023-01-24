package com.actTime.testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
import com.actiTime.generic.FileLib;
import com.actiTime.generic.ListenerImplementation;
import com.actiTime.pom.HomePage;
import com.actiTime.pom.TaskListPage;
@Listeners(com.actiTime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass
{
	@Test
	public void testcreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("Create Customer",true);
		FileLib fl=new FileLib();
		ListenerImplementation li=new ListenerImplementation();
		String customerName = fl.getExcellData("createCustomer", 1, 2);
		String customerDescr = fl.getExcellData("createCustomer", 1, 3);
		HomePage h=new HomePage(driver);
		h.setContainerTasks();
		TaskListPage t=new TaskListPage(driver);
		t.getAddbtn().click();
		t.getNewCust().click();
		t.getCustName().sendKeys(customerName);
		t.getCustDescrpbx().sendKeys(customerDescr);
		t.getSelectCustDD().click();
		t.getOurCmpDD().click();
		t.getCreateCustBtn().click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(t.getVerifyCust(), customerName));
		String actualCustText = t.getVerifyCust().getText();
		Assert.assertEquals(actualCustText, customerName);	}
}
