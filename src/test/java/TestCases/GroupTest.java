package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class GroupTest extends TestBase {
	
	LoginPage login;
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
	{
		initialization();
		login=new LoginPage();
	}
	@Test(groups= {"Sanity","Regression"})
	public void verifyTitleTest1() throws Exception
	{
	String expTitle = "Swag Labs";
	String actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle, actTitle);
	}
	@Test(groups= {"Smoke","Regression"})
	public void verifyTitleTest2() throws Exception
	{
	String expTitle = "Swag Labs";
	String actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle, actTitle);
	}
	@Test(groups= {"Sanity","Regression"})
	public void verifyTitleTest3() throws Exception
	{
	String expTitle = "Swag Labs";
	String actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle, actTitle);
	}
	@Test(groups= {"Smoke","Regression"})
	public void verifyTitleTest4() throws Exception
	{
	String expTitle = "Swag Labs";
	String actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle, actTitle);
	}
	@Test(groups= "Smoke")
	public void verifyTitleTest5() throws Exception
	{
	String expTitle = "Swag Labs";
	String actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle, actTitle);
	}
	@AfterMethod(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}

}
